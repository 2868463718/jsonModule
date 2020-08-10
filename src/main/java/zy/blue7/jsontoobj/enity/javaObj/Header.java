package zy.blue7.jsontoobj.enity.javaObj;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/**
* @author blue7
* @date 2020-08-10 14: 33: 11: 757
**/

public class Header{
  private String documentTimestamp;
  private String documentUUID;
  private String action;
}