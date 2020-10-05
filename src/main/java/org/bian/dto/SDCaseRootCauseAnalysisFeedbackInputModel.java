package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCaseRootCauseAnalysisFeedbackInputModelCaseRootCauseAnalysisFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDCaseRootCauseAnalysisFeedbackInputModel
 */
public class SDCaseRootCauseAnalysisFeedbackInputModel   {
  private Object caseRootCauseAnalysisFeedbackActionTaskRecord = null;

  private SDCaseRootCauseAnalysisFeedbackInputModelCaseRootCauseAnalysisFeedbackActionRecord caseRootCauseAnalysisFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return caseRootCauseAnalysisFeedbackActionTaskRecord
  **/

  public Object getCaseRootCauseAnalysisFeedbackActionTaskRecord() {
    return caseRootCauseAnalysisFeedbackActionTaskRecord;
  }

  public void setCaseRootCauseAnalysisFeedbackActionTaskRecord(Object caseRootCauseAnalysisFeedbackActionTaskRecord) {
    this.caseRootCauseAnalysisFeedbackActionTaskRecord = caseRootCauseAnalysisFeedbackActionTaskRecord;
  }


  /**
   * Get caseRootCauseAnalysisFeedbackActionRecord
   * @return caseRootCauseAnalysisFeedbackActionRecord
  **/

  public SDCaseRootCauseAnalysisFeedbackInputModelCaseRootCauseAnalysisFeedbackActionRecord getCaseRootCauseAnalysisFeedbackActionRecord() {
    return caseRootCauseAnalysisFeedbackActionRecord;
  }

  public void setCaseRootCauseAnalysisFeedbackActionRecord(SDCaseRootCauseAnalysisFeedbackInputModelCaseRootCauseAnalysisFeedbackActionRecord caseRootCauseAnalysisFeedbackActionRecord) {
    this.caseRootCauseAnalysisFeedbackActionRecord = caseRootCauseAnalysisFeedbackActionRecord;
  }


}

