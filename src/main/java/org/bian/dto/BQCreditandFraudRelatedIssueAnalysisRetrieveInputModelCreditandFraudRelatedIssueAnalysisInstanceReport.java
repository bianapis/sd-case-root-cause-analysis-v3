package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCreditandFraudRelatedIssueAnalysisRetrieveInputModelCreditandFraudRelatedIssueAnalysisInstanceReport
 */
public class BQCreditandFraudRelatedIssueAnalysisRetrieveInputModelCreditandFraudRelatedIssueAnalysisInstanceReport   {
  private String creditandFraudRelatedIssueAnalysisInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return creditandFraudRelatedIssueAnalysisInstanceReportReference
  **/

  public String getCreditandFraudRelatedIssueAnalysisInstanceReportReference() {
    return creditandFraudRelatedIssueAnalysisInstanceReportReference;
  }

  public void setCreditandFraudRelatedIssueAnalysisInstanceReportReference(String creditandFraudRelatedIssueAnalysisInstanceReportReference) {
    this.creditandFraudRelatedIssueAnalysisInstanceReportReference = creditandFraudRelatedIssueAnalysisInstanceReportReference;
  }


}

