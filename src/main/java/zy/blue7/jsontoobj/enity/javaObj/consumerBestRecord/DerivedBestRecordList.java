package zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord;

import java.util.List;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.DerivedBestRecord;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/**
* @author blue7
* @date 2020-08-10 14: 33: 11: 885
**/

public class DerivedBestRecordList{
  private List<DerivedBestRecord> derivedBestRecord;
}