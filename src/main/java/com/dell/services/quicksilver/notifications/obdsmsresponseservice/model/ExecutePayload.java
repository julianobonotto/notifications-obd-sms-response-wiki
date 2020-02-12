package com.dell.services.quicksilver.notifications.obdsmsresponseservice.model;

import java.io.Serializable;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExecutePayload implements Serializable {
  private String mode;
  private String activityId;
  private String activityObjectID;
  private String definitionInstanceId;
  private String keyValue;
  private Map<String, String>[] outArguments;
  private Map<String, String>[] inArguments;
  private String activityInstanceId;
  private String journeyId;
}
