package zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.bestRecord.sourceSystemList;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/**
* @author blue7
* @date 2020-08-10 14: 33: 11: 795
**/

public class SourceSystem{
  private String divisionCode;
  private String code;
  private String sourceTimestamp;
  private String consumerId;
  private String marketCode;
  private String terminalId;
  private String affiliateCode;
  private String brandCode;
}