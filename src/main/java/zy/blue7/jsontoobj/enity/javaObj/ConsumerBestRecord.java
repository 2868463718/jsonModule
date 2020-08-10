package zy.blue7.jsontoobj.enity.javaObj;

import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.DerivedBestRecordList;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.BestRecord;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/**
* @author blue7
* @date 2020-08-10 14: 33: 11: 887
**/

public class ConsumerBestRecord{
  private String recordUUID;
  private DerivedBestRecordList derivedBestRecordList;
  private BestRecord bestRecord;
}