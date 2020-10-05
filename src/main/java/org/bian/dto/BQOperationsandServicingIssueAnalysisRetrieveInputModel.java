package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOperationsandServicingIssueAnalysisRetrieveInputModelOperationsandServicingIssueAnalysisInstanceAnalysis;
import org.bian.dto.BQOperationsandServicingIssueAnalysisRetrieveInputModelOperationsandServicingIssueAnalysisInstanceReport;

import javax.validation.Valid;
  
/**
 * BQOperationsandServicingIssueAnalysisRetrieveInputModel
 */
public class BQOperationsandServicingIssueAnalysisRetrieveInputModel   {
  private Object operationsandServicingIssueAnalysisRetrieveActionTaskRecord = null;

  private String operationsandServicingIssueAnalysisRetrieveActionRequest = null;

  private BQOperationsandServicingIssueAnalysisRetrieveInputModelOperationsandServicingIssueAnalysisInstanceReport operationsandServicingIssueAnalysisInstanceReport = null;

  private BQOperationsandServicingIssueAnalysisRetrieveInputModelOperationsandServicingIssueAnalysisInstanceAnalysis operationsandServicingIssueAnalysisInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return operationsandServicingIssueAnalysisRetrieveActionTaskRecord
  **/

  public Object getOperationsandServicingIssueAnalysisRetrieveActionTaskRecord() {
    return operationsandServicingIssueAnalysisRetrieveActionTaskRecord;
  }

  public void setOperationsandServicingIssueAnalysisRetrieveActionTaskRecord(Object operationsandServicingIssueAnalysisRetrieveActionTaskRecord) {
    this.operationsandServicingIssueAnalysisRetrieveActionTaskRecord = operationsandServicingIssueAnalysisRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return operationsandServicingIssueAnalysisRetrieveActionRequest
  **/

  public String getOperationsandServicingIssueAnalysisRetrieveActionRequest() {
    return operationsandServicingIssueAnalysisRetrieveActionRequest;
  }

  public void setOperationsandServicingIssueAnalysisRetrieveActionRequest(String operationsandServicingIssueAnalysisRetrieveActionRequest) {
    this.operationsandServicingIssueAnalysisRetrieveActionRequest = operationsandServicingIssueAnalysisRetrieveActionRequest;
  }


  /**
   * Get operationsandServicingIssueAnalysisInstanceReport
   * @return operationsandServicingIssueAnalysisInstanceReport
  **/

  public BQOperationsandServicingIssueAnalysisRetrieveInputModelOperationsandServicingIssueAnalysisInstanceReport getOperationsandServicingIssueAnalysisInstanceReport() {
    return operationsandServicingIssueAnalysisInstanceReport;
  }

  public void setOperationsandServicingIssueAnalysisInstanceReport(BQOperationsandServicingIssueAnalysisRetrieveInputModelOperationsandServicingIssueAnalysisInstanceReport operationsandServicingIssueAnalysisInstanceReport) {
    this.operationsandServicingIssueAnalysisInstanceReport = operationsandServicingIssueAnalysisInstanceReport;
  }


  /**
   * Get operationsandServicingIssueAnalysisInstanceAnalysis
   * @return operationsandServicingIssueAnalysisInstanceAnalysis
  **/

  public BQOperationsandServicingIssueAnalysisRetrieveInputModelOperationsandServicingIssueAnalysisInstanceAnalysis getOperationsandServicingIssueAnalysisInstanceAnalysis() {
    return operationsandServicingIssueAnalysisInstanceAnalysis;
  }

  public void setOperationsandServicingIssueAnalysisInstanceAnalysis(BQOperationsandServicingIssueAnalysisRetrieveInputModelOperationsandServicingIssueAnalysisInstanceAnalysis operationsandServicingIssueAnalysisInstanceAnalysis) {
    this.operationsandServicingIssueAnalysisInstanceAnalysis = operationsandServicingIssueAnalysisInstanceAnalysis;
  }


}

