package com.dell.services.quicksilver.notifications.obdsmsresponseservice.controller;

import com.dell.services.quicksilver.notifications.obdsmsresponseservice.model.ActivityResult;
import com.dell.services.quicksilver.notifications.obdsmsresponseservice.model.ExecutePayload;
import com.dell.services.quicksilver.notifications.obdsmsresponseservice.model.SmsResponseFromObd;
import com.dell.services.quicksilver.notifications.obdsmsresponseservice.service.SmsResponseFromObdService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/obd")
@Slf4j
public class ObdResponseRestController {

    @Autowired
    private SmsResponseFromObdService smsResponseFromObdService;

    @PostMapping("/smsresponse")
    public void smsResponse(@RequestBody SmsResponseFromObd smsResponseFromObd) {
        smsResponseFromObdService.save(smsResponseFromObd);
    }

    @PostMapping("/checksmsresponse")
    public ActivityResult checkSmsResponse(@RequestBody ExecutePayload payload) {
        log.debug(String.format("Checking sms response: %s", payload.toString()));
        List<SmsResponseFromObd> queryResult =
                smsResponseFromObdService.findByPhoneNumberAndReplyMessage(
                        payload.getInArguments()[0].get("fromPhoneNumber"),
                        payload.getInArguments()[0].get("caseNumber"));
        log.debug(String.format("Responses found: %s", queryResult.toString()));
        ActivityResult result = new ActivityResult();
        result.setBranchResult(queryResult.size() > 0 ? "true" : "false");
        return result;
    }


    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody Map<String, Object> payload) {
        return new ResponseEntity<>("Save", HttpStatus.OK);
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody Map<String, Object> payload) {
        return new ResponseEntity<>("Publish", HttpStatus.OK);
    }

    @PostMapping("/validate")
    public ResponseEntity<Map> validate(@RequestBody Map<String, Object> payload) {
        Map<String, Boolean> res = new HashMap();
        res.put("Success", true);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
}