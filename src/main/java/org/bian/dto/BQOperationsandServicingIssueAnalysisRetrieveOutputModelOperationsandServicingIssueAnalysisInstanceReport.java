package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOperationsandServicingIssueAnalysisRetrieveOutputModelOperationsandServicingIssueAnalysisInstanceReport
 */
public class BQOperationsandServicingIssueAnalysisRetrieveOutputModelOperationsandServicingIssueAnalysisInstanceReport   {
  private Object operationsandServicingIssueAnalysisInstanceReportRecord = null;

  private String operationsandServicingIssueAnalysisInstanceReportType = null;

  private String operationsandServicingIssueAnalysisInstanceReportParameters = null;

  private Object operationsandServicingIssueAnalysisInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return operationsandServicingIssueAnalysisInstanceReportRecord
  **/

  public Object getOperationsandServicingIssueAnalysisInstanceReportRecord() {
    return operationsandServicingIssueAnalysisInstanceReportRecord;
  }

  public void setOperationsandServicingIssueAnalysisInstanceReportRecord(Object operationsandServicingIssueAnalysisInstanceReportRecord) {
    this.operationsandServicingIssueAnalysisInstanceReportRecord = operationsandServicingIssueAnalysisInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return operationsandServicingIssueAnalysisInstanceReportType
  **/

  public String getOperationsandServicingIssueAnalysisInstanceReportType() {
    return operationsandServicingIssueAnalysisInstanceReportType;
  }

  public void setOperationsandServicingIssueAnalysisInstanceReportType(String operationsandServicingIssueAnalysisInstanceReportType) {
    this.operationsandServicingIssueAnalysisInstanceReportType = operationsandServicingIssueAnalysisInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return operationsandServicingIssueAnalysisInstanceReportParameters
  **/

  public String getOperationsandServicingIssueAnalysisInstanceReportParameters() {
    return operationsandServicingIssueAnalysisInstanceReportParameters;
  }

  public void setOperationsandServicingIssueAnalysisInstanceReportParameters(String operationsandServicingIssueAnalysisInstanceReportParameters) {
    this.operationsandServicingIssueAnalysisInstanceReportParameters = operationsandServicingIssueAnalysisInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return operationsandServicingIssueAnalysisInstanceReport
  **/

  public Object getOperationsandServicingIssueAnalysisInstanceReport() {
    return operationsandServicingIssueAnalysisInstanceReport;
  }

  public void setOperationsandServicingIssueAnalysisInstanceReport(Object operationsandServicingIssueAnalysisInstanceReport) {
    this.operationsandServicingIssueAnalysisInstanceReport = operationsandServicingIssueAnalysisInstanceReport;
  }


}

