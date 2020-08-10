package zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.bestRecord;

import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.bestRecord.calculatedBusinessVariables.RecencySegment;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.bestRecord.calculatedBusinessVariables.PurchaseSummary;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.bestRecord.calculatedBusinessVariables.ValueGroup;
import zy.blue7.jsontoobj.enity.javaObj.consumerBestRecord.bestRecord.calculatedBusinessVariables.Segment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/**
* @author blue7
* @date 2020-08-10 14: 33: 11: 806
**/

public class CalculatedBusinessVariables{
  private int decile;
  private PurchaseSummary purchaseSummary;
  private Segment segment;
  private RecencySegment recencySegment;
  private ValueGroup valueGroup;
}