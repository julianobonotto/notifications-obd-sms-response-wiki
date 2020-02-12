package com.dell.services.quicksilver.notifications.obdsmsresponseservice.repository;

import com.dell.services.quicksilver.notifications.obdsmsresponseservice.model.SmsResponseFromObd;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmsResponseFromObdRepository extends MongoRepository<SmsResponseFromObd, String> {

  List<SmsResponseFromObd> findAllByFromPhoneNumberAndReplyMessageIsContaining(
      String fromPhoneNumber, String CaseNumber);
}
