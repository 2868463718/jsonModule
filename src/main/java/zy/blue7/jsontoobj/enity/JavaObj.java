package zy.blue7.jsontoobj.enity;

import zy.blue7.jsontoobj.enity.javaObj.Header;
import zy.blue7.jsontoobj.enity.javaObj.ConsumerBestRecord;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/**
* @author blue7
* @date 2020-08-10 14: 33: 11: 889
**/

public class JavaObj{
  private ConsumerBestRecord consumerBestRecord;
  private Header header;
}
