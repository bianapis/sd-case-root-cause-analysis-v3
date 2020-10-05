package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOperationsandServicingIssueAnalysisRetrieveInputModelOperationsandServicingIssueAnalysisInstanceAnalysis
 */
public class BQOperationsandServicingIssueAnalysisRetrieveInputModelOperationsandServicingIssueAnalysisInstanceAnalysis   {
  private String operationsandServicingIssueAnalysisInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return operationsandServicingIssueAnalysisInstanceAnalysisReference
  **/

  public String getOperationsandServicingIssueAnalysisInstanceAnalysisReference() {
    return operationsandServicingIssueAnalysisInstanceAnalysisReference;
  }

  public void setOperationsandServicingIssueAnalysisInstanceAnalysisReference(String operationsandServicingIssueAnalysisInstanceAnalysisReference) {
    this.operationsandServicingIssueAnalysisInstanceAnalysisReference = operationsandServicingIssueAnalysisInstanceAnalysisReference;
  }


}

