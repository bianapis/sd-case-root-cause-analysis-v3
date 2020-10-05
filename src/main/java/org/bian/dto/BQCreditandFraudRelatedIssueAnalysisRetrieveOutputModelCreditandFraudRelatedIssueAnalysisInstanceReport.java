package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCreditandFraudRelatedIssueAnalysisRetrieveOutputModelCreditandFraudRelatedIssueAnalysisInstanceReport
 */
public class BQCreditandFraudRelatedIssueAnalysisRetrieveOutputModelCreditandFraudRelatedIssueAnalysisInstanceReport   {
  private Object creditandFraudRelatedIssueAnalysisInstanceReportRecord = null;

  private String creditandFraudRelatedIssueAnalysisInstanceReportType = null;

  private String creditandFraudRelatedIssueAnalysisInstanceReportParameters = null;

  private Object creditandFraudRelatedIssueAnalysisInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return creditandFraudRelatedIssueAnalysisInstanceReportRecord
  **/

  public Object getCreditandFraudRelatedIssueAnalysisInstanceReportRecord() {
    return creditandFraudRelatedIssueAnalysisInstanceReportRecord;
  }

  public void setCreditandFraudRelatedIssueAnalysisInstanceReportRecord(Object creditandFraudRelatedIssueAnalysisInstanceReportRecord) {
    this.creditandFraudRelatedIssueAnalysisInstanceReportRecord = creditandFraudRelatedIssueAnalysisInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return creditandFraudRelatedIssueAnalysisInstanceReportType
  **/

  public String getCreditandFraudRelatedIssueAnalysisInstanceReportType() {
    return creditandFraudRelatedIssueAnalysisInstanceReportType;
  }

  public void setCreditandFraudRelatedIssueAnalysisInstanceReportType(String creditandFraudRelatedIssueAnalysisInstanceReportType) {
    this.creditandFraudRelatedIssueAnalysisInstanceReportType = creditandFraudRelatedIssueAnalysisInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return creditandFraudRelatedIssueAnalysisInstanceReportParameters
  **/

  public String getCreditandFraudRelatedIssueAnalysisInstanceReportParameters() {
    return creditandFraudRelatedIssueAnalysisInstanceReportParameters;
  }

  public void setCreditandFraudRelatedIssueAnalysisInstanceReportParameters(String creditandFraudRelatedIssueAnalysisInstanceReportParameters) {
    this.creditandFraudRelatedIssueAnalysisInstanceReportParameters = creditandFraudRelatedIssueAnalysisInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return creditandFraudRelatedIssueAnalysisInstanceReport
  **/

  public Object getCreditandFraudRelatedIssueAnalysisInstanceReport() {
    return creditandFraudRelatedIssueAnalysisInstanceReport;
  }

  public void setCreditandFraudRelatedIssueAnalysisInstanceReport(Object creditandFraudRelatedIssueAnalysisInstanceReport) {
    this.creditandFraudRelatedIssueAnalysisInstanceReport = creditandFraudRelatedIssueAnalysisInstanceReport;
  }


}

