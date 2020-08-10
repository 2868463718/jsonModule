package zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.bestRecord;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/**
* @author blue7
* @date 2020-08-10 14: 33: 11: 793
**/

public class Attributes{
  private String recognitionServiceCode;
  private String cSRInstanceCode;
  private String sourceTimestamp;
  private String universalKey;
  private String cSRInstanceDescription;
  private String recordTimestamp;
}