package com.dell.services.quicksilver.notifications.obdsmsresponseservice.service;

import com.dell.services.quicksilver.notifications.obdsmsresponseservice.model.SmsResponseFromObd;
import com.dell.services.quicksilver.notifications.obdsmsresponseservice.repository.SmsResponseFromObdRepository;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SmsResponseFromObdService {

  @Autowired private SmsResponseFromObdRepository smsResponseFromObdRepository;

  public SmsResponseFromObd save(SmsResponseFromObd payload) {
    return smsResponseFromObdRepository.save(payload);
  }

  public List<SmsResponseFromObd> findByPhoneNumberAndReplyMessage(
      String fromPhoneNumber, String caseNumber) {
    return smsResponseFromObdRepository.findAllByFromPhoneNumberAndReplyMessageIsContaining(
        fromPhoneNumber, caseNumber);
  }
}
