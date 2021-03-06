package zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.bestRecord.programList;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/**
* @author blue7
* @date 2020-08-10 14: 33: 11: 769
**/

public class Program{
  private String availableQuota;
  private String initialQuota;
  private String pointsRedeemed;
  private String programSystemIDDescription;
  private String programLevelCode;
  private String applicationTouchPointCode;
  private String cardNum;
  private String membershipNum;
  private String programTypeCode;
  private String pointsAcquired;
  private String programLevelDescription;
  private String programSystemIDCode;
  private String programTypeDescription;
  private String endTimestamp;
  private String startTimestamp;
  private String consumerGroup;
}