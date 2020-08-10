package zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord;

import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.contactInformation.EMediaList;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.contactInformation.AddressList;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.contactInformation.PhoneList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/**
* @author blue7
* @date 2020-08-10 14: 33: 11: 837
**/

public class ContactInformation{
  private EMediaList eMediaList;
  private AddressList addressList;
  private PhoneList phoneList;
}