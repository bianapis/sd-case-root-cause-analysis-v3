package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCaseRootCauseAnalysisFeedbackOutputModelCaseRootCauseAnalysisFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDCaseRootCauseAnalysisFeedbackOutputModel
 */
public class SDCaseRootCauseAnalysisFeedbackOutputModel   {
  private String caseRootCauseAnalysisFeedbackActionTaskReference = null;

  private Object caseRootCauseAnalysisFeedbackActionTaskRecord = null;

  private SDCaseRootCauseAnalysisFeedbackOutputModelCaseRootCauseAnalysisFeedbackActionRecord caseRootCauseAnalysisFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return caseRootCauseAnalysisFeedbackActionTaskReference
  **/

  public String getCaseRootCauseAnalysisFeedbackActionTaskReference() {
    return caseRootCauseAnalysisFeedbackActionTaskReference;
  }

  public void setCaseRootCauseAnalysisFeedbackActionTaskReference(String caseRootCauseAnalysisFeedbackActionTaskReference) {
    this.caseRootCauseAnalysisFeedbackActionTaskReference = caseRootCauseAnalysisFeedbackActionTaskReference;
  }


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

  public SDCaseRootCauseAnalysisFeedbackOutputModelCaseRootCauseAnalysisFeedbackActionRecord getCaseRootCauseAnalysisFeedbackActionRecord() {
    return caseRootCauseAnalysisFeedbackActionRecord;
  }

  public void setCaseRootCauseAnalysisFeedbackActionRecord(SDCaseRootCauseAnalysisFeedbackOutputModelCaseRootCauseAnalysisFeedbackActionRecord caseRootCauseAnalysisFeedbackActionRecord) {
    this.caseRootCauseAnalysisFeedbackActionRecord = caseRootCauseAnalysisFeedbackActionRecord;
  }


}

