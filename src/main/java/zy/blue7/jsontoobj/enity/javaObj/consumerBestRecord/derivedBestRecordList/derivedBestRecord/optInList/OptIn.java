package zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.optInList;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/**
* @author blue7
* @date 2020-08-10 14: 33: 11: 838
**/

public class OptIn{
  private String optInTimestamp;
  private boolean optInFlag;
  private String optInSourceSystemCode;
  private String communicationChannelCode;
}