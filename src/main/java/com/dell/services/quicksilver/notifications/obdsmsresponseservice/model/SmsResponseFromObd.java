package com.dell.services.quicksilver.notifications.obdsmsresponseservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class SmsResponseFromObd {

  @Id private String id;
  private String fromPhoneNumber;
  private String toPhoneNumber;
  private String replyBatchID;
  private String replyMessage;
  private String replyTimestamp;
  private String sentBatchID;
  private String sentStatus;
  private String sentMessage;
  private String sentTimestamp;
}
