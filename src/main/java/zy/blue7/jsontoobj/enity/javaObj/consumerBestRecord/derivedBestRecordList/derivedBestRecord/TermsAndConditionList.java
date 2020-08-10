package zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord;

import java.util.List;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.termsAndConditionList.TermsAndCondition;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/**
* @author blue7
* @date 2020-08-10 14: 33: 11: 879
**/

public class TermsAndConditionList{
  private List<TermsAndCondition> termsAndCondition;
}