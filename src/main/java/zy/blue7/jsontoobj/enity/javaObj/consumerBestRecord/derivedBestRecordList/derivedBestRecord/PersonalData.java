package zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord;

import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.personalData.SkinType;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.personalData.MakeUpConcernList;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.personalData.RegTouchPointSourceSystem;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.personalData.HairConcernsList;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.personalData.AssignedPersonnelSourceSystem;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.personalData.HairTypeList;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.personalData.SkinConcernsList;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.personalData.LastUpdateTouchPointSourceSystem;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.personalData.LastVisitTouchPointCodeSourceSystem;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.personalData.PreferredTouchPointCodeSourceSystem;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.personalData.HobbyList;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.personalData.Currency;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.personalData.AgeRange;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.personalData.RegPersonnelSourceSystem;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.personalData.Ethnicity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/**
* @author blue7
* @date 2020-08-10 14: 33: 11: 872
**/

public class PersonalData{
  private AgeRange ageRange;
  private String englishFullName;
  private String localLastName;
  private String jobTitle;
  private boolean generalOptInFlag;
  private HairTypeList hairTypeList;
  private LastUpdateTouchPointSourceSystem lastUpdateTouchPointSourceSystem;
  private HobbyList hobbyList;
  private String consumerClassCode;
  private RegPersonnelSourceSystem regPersonnelSourceSystem;
  private int estimatedBirthYear;
  private String firstPurchaseDate;
  private String localMiddleName2;
  private SkinType skinType;
  private RegTouchPointSourceSystem regTouchPointSourceSystem;
  private SkinConcernsList skinConcernsList;
  private String consumerCountryCode_ISO3;
  private String writtenLanguageCode;
  private String localFirstName;
  private String nameGenderCode;
  private String englishLastName;
  private boolean doNotContact;
  private String identityNum;
  private int birthMonth;
  private String localFullName2;
  private String genderCode;
  private MakeUpConcernList makeUpConcernList;
  private String nationality;
  private String localMiddleName;
  private String salutation;
  private String socialSecurityNum;
  private Ethnicity ethnicity;
  private String regDate;
  private boolean nameFilledFlag;
  private String yearlyIncome;
  private String generalOptInDate;
  private PreferredTouchPointCodeSourceSystem preferredTouchPointCodeSourceSystem;
  private String spokenLanguageCode;
  private String localLastName2;
  private String company;
  private Currency currency;
  private String localFullName;
  private String englishMiddleName;
  private String department;
  private int birthDay;
  private LastVisitTouchPointCodeSourceSystem lastVisitTouchPointCodeSourceSystem;
  private String englishFirstName;
  private String civilStatusCode;
  private String passportNum;
  private int birthYear;
  private AssignedPersonnelSourceSystem assignedPersonnelSourceSystem;
  private String localFirstName2;
  private HairConcernsList hairConcernsList;
}