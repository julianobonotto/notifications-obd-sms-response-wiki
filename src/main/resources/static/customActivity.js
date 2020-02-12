'use strict';
define(function (require) {
    var Postmonger = require('postmonger');
    var connection = new Postmonger.Session();
    var payload = {};
    var steps = [{'key': 'eventdefinitionkey', 'label': 'Event Definition Key'}];
    var currentStep = steps[0].key;
    var eventDefinitionKey = '';
    var deFields = [];
    $(window).ready(function () {
        connection.trigger('ready');
        connection.trigger('requestInteraction');
    });

    function initialize(data) {
        if (data) {
            payload = data;
        }
    }

    function onClickedNext() {
        save();
    }

    function onClickedBack() {
        connection.trigger('prevStep');
    }

    function onGotoStep(step) {
        showStep(step);
        connection.trigger('ready');
    }

    function showStep(step, stepIndex) {
        if (stepIndex && !step) {
            step = steps[stepIndex - 1];
        }
        currentStep = step;
        $('.step').hide();
        switch (currentStep.key) {
            case 'eventdefinitionkey':
                $('#step1').show();
                $('#step1 input').focus();
                break;
        }
    }

    function requestedInteractionHandler(settings) {
        try {
            eventDefinitionKey = settings.triggers[0].metaData.eventDefinitionKey;
            $('#select-entryevent-defkey').val(eventDefinitionKey);
            if (settings.triggers[0].type === 'SalesforceObjectTriggerV2' && settings.triggers[0].configurationArguments && settings.triggers[0].configurationArguments.eventDataConfig) {
                if (typeof settings.triggers[0].configurationArguments.eventDataConfig === 'string' || !settings.triggers[0].configurationArguments.eventDataConfig.objects) {
                    settings.triggers[0].configurationArguments.eventDataConfig = JSON.parse(settings.triggers[0].configurationArguments.eventDataConfig);
                }
                settings.triggers[0].configurationArguments.eventDataConfig.objects.forEach((obj) => {
                    deFields = deFields.concat(obj.fields.map((fieldName) => {
                        return obj.dePrefix + fieldName;
                    }));
                });
                deFields.forEach((option) => {
                    $('#select-id-dropdown').append($('<option>', {value: option, text: option}));
                });
                $('#select-id').hide();
                $('#select-id-dropdown').show();
            } else {
                $('#select-id-dropdown').hide();
                $('#select-id').show();
            }
        } catch (e) {
            console.error(e);
            $('#select-id-dropdown').hide();
            $('#select-id').show();
        }
    }

    function save() {
        payload['arguments'] = payload['arguments'] || {};
        payload['arguments'].execute = payload['arguments'].execute || {};
        var idField = deFields.length > 0 ? $('#select-id-dropdown').val() : $('#select-id').val();
        payload['metaData'] = payload['metaData'] || {};
        payload['metaData'].isConfigured = true;
        payload['arguments'].execute.inArguments = [{
            'fromPhoneNumber': '{{Event.' + eventDefinitionKey + '.\"fromPhoneNumber"}}',
            'caseNumber': '{{Event.' + eventDefinitionKey + '.\"caseNumber\"}}'
        }];
        console.log(JSON.stringify(payload));
        connection.trigger('updateActivity', payload);
    }

    connection.on('initActivity', initialize);
    connection.on('clickedNext', onClickedNext);
    connection.on('clickedBack', onClickedBack);
    connection.on('gotoStep', onGotoStep);
    connection.on('requestedInteraction', requestedInteractionHandler);
});