package com.dell.services.quicksilver.notifications.obdsmsresponseservice;

import com.dell.services.quicksilver.notifications.obdsmsresponseservice.model.SmsResponseFromObd;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SmsResponseFromObdTest {

  @Test
  public void smsResponseFromObdConstructorAndMethods() {
    SmsResponseFromObd smsResponseFromObd = new SmsResponseFromObd();

    smsResponseFromObd.setFromPhoneNumber("+5551992477099");
    smsResponseFromObd.setToPhoneNumber("30267");
    smsResponseFromObd.setReplyBatchID("3 TPGJ5dEnPj - MDTL");
    smsResponseFromObd.setReplyMessage("My reply message");
    smsResponseFromObd.setReplyTimestamp("2019-12-02T07:43:41.7176845-06:00");
    smsResponseFromObd.setSentBatchID("f9aabd69-c7d3-44cd-b26e-732b3942df5a");
    smsResponseFromObd.setSentStatus("Sent");
    smsResponseFromObd.setSentMessage("β Ѿ Ϡ Ǿ ½ ۩UAT ⛸⛷✏⚰⚽⚾⛄⛹⛺⛳Obd.Text 24 x7");
    smsResponseFromObd.setSentTimestamp("2019 - 10 - 24 T06:56:10.293");

    Assert.assertEquals(smsResponseFromObd.getFromPhoneNumber(), "+5551992477099");
    Assert.assertEquals(smsResponseFromObd.getToPhoneNumber(), "30267");
    Assert.assertEquals(smsResponseFromObd.getReplyBatchID(), "3 TPGJ5dEnPj - MDTL");
    Assert.assertEquals(smsResponseFromObd.getReplyMessage(), "My reply message");
    Assert.assertEquals(
        smsResponseFromObd.getReplyTimestamp(), "2019-12-02T07:43:41.7176845-06:00");
    Assert.assertEquals(
        smsResponseFromObd.getSentBatchID(), "f9aabd69-c7d3-44cd-b26e-732b3942df5a");
    Assert.assertEquals(smsResponseFromObd.getSentStatus(), "Sent");
    Assert.assertEquals(
        smsResponseFromObd.getSentMessage(), "β Ѿ Ϡ Ǿ ½ ۩UAT ⛸⛷✏⚰⚽⚾⛄⛹⛺⛳Obd.Text 24 x7");
    Assert.assertEquals(smsResponseFromObd.getSentTimestamp(), "2019 - 10 - 24 T06:56:10.293");
  }
}
