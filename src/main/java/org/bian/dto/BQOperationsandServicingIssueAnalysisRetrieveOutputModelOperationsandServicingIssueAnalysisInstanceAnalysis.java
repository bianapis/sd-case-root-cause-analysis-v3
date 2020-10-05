package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOperationsandServicingIssueAnalysisRetrieveOutputModelOperationsandServicingIssueAnalysisInstanceAnalysis
 */
public class BQOperationsandServicingIssueAnalysisRetrieveOutputModelOperationsandServicingIssueAnalysisInstanceAnalysis   {
  private Object operationsandServicingIssueAnalysisInstanceAnalysisRecord = null;

  private String operationsandServicingIssueAnalysisInstanceAnalysisReportType = null;

  private String operationsandServicingIssueAnalysisInstanceAnalysisParameters = null;

  private Object operationsandServicingIssueAnalysisInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return operationsandServicingIssueAnalysisInstanceAnalysisRecord
  **/

  public Object getOperationsandServicingIssueAnalysisInstanceAnalysisRecord() {
    return operationsandServicingIssueAnalysisInstanceAnalysisRecord;
  }

  public void setOperationsandServicingIssueAnalysisInstanceAnalysisRecord(Object operationsandServicingIssueAnalysisInstanceAnalysisRecord) {
    this.operationsandServicingIssueAnalysisInstanceAnalysisRecord = operationsandServicingIssueAnalysisInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return operationsandServicingIssueAnalysisInstanceAnalysisReportType
  **/

  public String getOperationsandServicingIssueAnalysisInstanceAnalysisReportType() {
    return operationsandServicingIssueAnalysisInstanceAnalysisReportType;
  }

  public void setOperationsandServicingIssueAnalysisInstanceAnalysisReportType(String operationsandServicingIssueAnalysisInstanceAnalysisReportType) {
    this.operationsandServicingIssueAnalysisInstanceAnalysisReportType = operationsandServicingIssueAnalysisInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return operationsandServicingIssueAnalysisInstanceAnalysisParameters
  **/

  public String getOperationsandServicingIssueAnalysisInstanceAnalysisParameters() {
    return operationsandServicingIssueAnalysisInstanceAnalysisParameters;
  }

  public void setOperationsandServicingIssueAnalysisInstanceAnalysisParameters(String operationsandServicingIssueAnalysisInstanceAnalysisParameters) {
    this.operationsandServicingIssueAnalysisInstanceAnalysisParameters = operationsandServicingIssueAnalysisInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return operationsandServicingIssueAnalysisInstanceAnalysisReport
  **/

  public Object getOperationsandServicingIssueAnalysisInstanceAnalysisReport() {
    return operationsandServicingIssueAnalysisInstanceAnalysisReport;
  }

  public void setOperationsandServicingIssueAnalysisInstanceAnalysisReport(Object operationsandServicingIssueAnalysisInstanceAnalysisReport) {
    this.operationsandServicingIssueAnalysisInstanceAnalysisReport = operationsandServicingIssueAnalysisInstanceAnalysisReport;
  }


}

