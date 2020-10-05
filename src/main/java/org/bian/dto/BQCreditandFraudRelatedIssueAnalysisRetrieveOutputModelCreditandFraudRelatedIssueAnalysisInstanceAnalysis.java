package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCreditandFraudRelatedIssueAnalysisRetrieveOutputModelCreditandFraudRelatedIssueAnalysisInstanceAnalysis
 */
public class BQCreditandFraudRelatedIssueAnalysisRetrieveOutputModelCreditandFraudRelatedIssueAnalysisInstanceAnalysis   {
  private Object creditandFraudRelatedIssueAnalysisInstanceAnalysisRecord = null;

  private String creditandFraudRelatedIssueAnalysisInstanceAnalysisReportType = null;

  private String creditandFraudRelatedIssueAnalysisInstanceAnalysisParameters = null;

  private Object creditandFraudRelatedIssueAnalysisInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return creditandFraudRelatedIssueAnalysisInstanceAnalysisRecord
  **/

  public Object getCreditandFraudRelatedIssueAnalysisInstanceAnalysisRecord() {
    return creditandFraudRelatedIssueAnalysisInstanceAnalysisRecord;
  }

  public void setCreditandFraudRelatedIssueAnalysisInstanceAnalysisRecord(Object creditandFraudRelatedIssueAnalysisInstanceAnalysisRecord) {
    this.creditandFraudRelatedIssueAnalysisInstanceAnalysisRecord = creditandFraudRelatedIssueAnalysisInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return creditandFraudRelatedIssueAnalysisInstanceAnalysisReportType
  **/

  public String getCreditandFraudRelatedIssueAnalysisInstanceAnalysisReportType() {
    return creditandFraudRelatedIssueAnalysisInstanceAnalysisReportType;
  }

  public void setCreditandFraudRelatedIssueAnalysisInstanceAnalysisReportType(String creditandFraudRelatedIssueAnalysisInstanceAnalysisReportType) {
    this.creditandFraudRelatedIssueAnalysisInstanceAnalysisReportType = creditandFraudRelatedIssueAnalysisInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return creditandFraudRelatedIssueAnalysisInstanceAnalysisParameters
  **/

  public String getCreditandFraudRelatedIssueAnalysisInstanceAnalysisParameters() {
    return creditandFraudRelatedIssueAnalysisInstanceAnalysisParameters;
  }

  public void setCreditandFraudRelatedIssueAnalysisInstanceAnalysisParameters(String creditandFraudRelatedIssueAnalysisInstanceAnalysisParameters) {
    this.creditandFraudRelatedIssueAnalysisInstanceAnalysisParameters = creditandFraudRelatedIssueAnalysisInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return creditandFraudRelatedIssueAnalysisInstanceAnalysisReport
  **/

  public Object getCreditandFraudRelatedIssueAnalysisInstanceAnalysisReport() {
    return creditandFraudRelatedIssueAnalysisInstanceAnalysisReport;
  }

  public void setCreditandFraudRelatedIssueAnalysisInstanceAnalysisReport(Object creditandFraudRelatedIssueAnalysisInstanceAnalysisReport) {
    this.creditandFraudRelatedIssueAnalysisInstanceAnalysisReport = creditandFraudRelatedIssueAnalysisInstanceAnalysisReport;
  }


}

