package zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList;

import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.Attributes;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.RemarkList;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.SourceSystemList;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.TermsAndConditionList;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.CustomAttributeList;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.PersonalData;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.ContactInformation;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.CustomerGroupList;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.NoteList;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.CrossBrandOptInList;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.AuxiliaryAttributeList;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.OptInList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/**
* @author blue7
* @date 2020-08-10 14: 33: 11: 884
**/

public class DerivedBestRecord{
  private AuxiliaryAttributeList auxiliaryAttributeList;
  private String level;
  private SourceSystemList sourceSystemList;
  private PersonalData personalData;
  private CustomerGroupList customerGroupList;
  private NoteList noteList;
  private CustomAttributeList customAttributeList;
  private OptInList optInList;
  private CrossBrandOptInList crossBrandOptInList;
  private ContactInformation contactInformation;
  private Attributes attributes;
  private TermsAndConditionList termsAndConditionList;
  private RemarkList remarkList;
}