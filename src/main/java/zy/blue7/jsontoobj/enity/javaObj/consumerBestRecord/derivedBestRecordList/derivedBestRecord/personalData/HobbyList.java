package zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.personalData;

import java.util.List;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.derivedBestRecordList.derivedBestRecord.personalData.hobbyList.Hobby;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/**
* @author blue7
* @date 2020-08-10 14: 33: 11: 871
**/

public class HobbyList{
  private List<Hobby> hobby;
}