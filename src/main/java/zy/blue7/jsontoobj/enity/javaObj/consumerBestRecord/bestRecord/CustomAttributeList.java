package zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.bestRecord;

import java.util.List;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.bestRecord.customAttributeList.CustomAttribute;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/**
* @author blue7
* @date 2020-08-10 14: 33: 11: 777
**/

public class CustomAttributeList{
  private List<CustomAttribute> customAttribute;
}