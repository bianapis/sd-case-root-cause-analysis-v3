package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCreditandFraudRelatedIssueAnalysisRetrieveInputModelCreditandFraudRelatedIssueAnalysisInstanceAnalysis;
import org.bian.dto.BQCreditandFraudRelatedIssueAnalysisRetrieveInputModelCreditandFraudRelatedIssueAnalysisInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCreditandFraudRelatedIssueAnalysisRetrieveInputModel
 */
public class BQCreditandFraudRelatedIssueAnalysisRetrieveInputModel   {
  private Object creditandFraudRelatedIssueAnalysisRetrieveActionTaskRecord = null;

  private String creditandFraudRelatedIssueAnalysisRetrieveActionRequest = null;

  private BQCreditandFraudRelatedIssueAnalysisRetrieveInputModelCreditandFraudRelatedIssueAnalysisInstanceReport creditandFraudRelatedIssueAnalysisInstanceReport = null;

  private BQCreditandFraudRelatedIssueAnalysisRetrieveInputModelCreditandFraudRelatedIssueAnalysisInstanceAnalysis creditandFraudRelatedIssueAnalysisInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return creditandFraudRelatedIssueAnalysisRetrieveActionTaskRecord
  **/

  public Object getCreditandFraudRelatedIssueAnalysisRetrieveActionTaskRecord() {
    return creditandFraudRelatedIssueAnalysisRetrieveActionTaskRecord;
  }

  public void setCreditandFraudRelatedIssueAnalysisRetrieveActionTaskRecord(Object creditandFraudRelatedIssueAnalysisRetrieveActionTaskRecord) {
    this.creditandFraudRelatedIssueAnalysisRetrieveActionTaskRecord = creditandFraudRelatedIssueAnalysisRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return creditandFraudRelatedIssueAnalysisRetrieveActionRequest
  **/

  public String getCreditandFraudRelatedIssueAnalysisRetrieveActionRequest() {
    return creditandFraudRelatedIssueAnalysisRetrieveActionRequest;
  }

  public void setCreditandFraudRelatedIssueAnalysisRetrieveActionRequest(String creditandFraudRelatedIssueAnalysisRetrieveActionRequest) {
    this.creditandFraudRelatedIssueAnalysisRetrieveActionRequest = creditandFraudRelatedIssueAnalysisRetrieveActionRequest;
  }


  /**
   * Get creditandFraudRelatedIssueAnalysisInstanceReport
   * @return creditandFraudRelatedIssueAnalysisInstanceReport
  **/

  public BQCreditandFraudRelatedIssueAnalysisRetrieveInputModelCreditandFraudRelatedIssueAnalysisInstanceReport getCreditandFraudRelatedIssueAnalysisInstanceReport() {
    return creditandFraudRelatedIssueAnalysisInstanceReport;
  }

  public void setCreditandFraudRelatedIssueAnalysisInstanceReport(BQCreditandFraudRelatedIssueAnalysisRetrieveInputModelCreditandFraudRelatedIssueAnalysisInstanceReport creditandFraudRelatedIssueAnalysisInstanceReport) {
    this.creditandFraudRelatedIssueAnalysisInstanceReport = creditandFraudRelatedIssueAnalysisInstanceReport;
  }


  /**
   * Get creditandFraudRelatedIssueAnalysisInstanceAnalysis
   * @return creditandFraudRelatedIssueAnalysisInstanceAnalysis
  **/

  public BQCreditandFraudRelatedIssueAnalysisRetrieveInputModelCreditandFraudRelatedIssueAnalysisInstanceAnalysis getCreditandFraudRelatedIssueAnalysisInstanceAnalysis() {
    return creditandFraudRelatedIssueAnalysisInstanceAnalysis;
  }

  public void setCreditandFraudRelatedIssueAnalysisInstanceAnalysis(BQCreditandFraudRelatedIssueAnalysisRetrieveInputModelCreditandFraudRelatedIssueAnalysisInstanceAnalysis creditandFraudRelatedIssueAnalysisInstanceAnalysis) {
    this.creditandFraudRelatedIssueAnalysisInstanceAnalysis = creditandFraudRelatedIssueAnalysisInstanceAnalysis;
  }


}

