package zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord;

import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.bestRecord.SourceSystemList;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.bestRecord.ProgramList;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.bestRecord.Attributes;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.bestRecord.PersonalData;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.bestRecord.CalculatedBusinessVariables;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.bestRecord.CustomAttributeList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/**
* @author blue7
* @date 2020-08-10 14: 33: 11: 807
**/

public class BestRecord{
  private SourceSystemList sourceSystemList;
  private PersonalData personalData;
  private ProgramList programList;
  private Attributes attributes;
  private CustomAttributeList customAttributeList;
  private CalculatedBusinessVariables calculatedBusinessVariables;
}