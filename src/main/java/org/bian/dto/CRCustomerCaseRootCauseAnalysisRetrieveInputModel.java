package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCaseRootCauseAnalysisRetrieveInputModelCustomerCaseRootCauseAnalysisInstanceAnalysis;
import org.bian.dto.CRCustomerCaseRootCauseAnalysisRetrieveInputModelCustomerCaseRootCauseAnalysisInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCaseRootCauseAnalysisRetrieveInputModel
 */
public class CRCustomerCaseRootCauseAnalysisRetrieveInputModel   {
  private Object customerCaseRootCauseAnalysisRetrieveActionTaskRecord = null;

  private String customerCaseRootCauseAnalysisRetrieveActionRequest = null;

  private CRCustomerCaseRootCauseAnalysisRetrieveInputModelCustomerCaseRootCauseAnalysisInstanceReportRecord customerCaseRootCauseAnalysisInstanceReportRecord = null;

  private CRCustomerCaseRootCauseAnalysisRetrieveInputModelCustomerCaseRootCauseAnalysisInstanceAnalysis customerCaseRootCauseAnalysisInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return customerCaseRootCauseAnalysisRetrieveActionTaskRecord
  **/

  public Object getCustomerCaseRootCauseAnalysisRetrieveActionTaskRecord() {
    return customerCaseRootCauseAnalysisRetrieveActionTaskRecord;
  }

  public void setCustomerCaseRootCauseAnalysisRetrieveActionTaskRecord(Object customerCaseRootCauseAnalysisRetrieveActionTaskRecord) {
    this.customerCaseRootCauseAnalysisRetrieveActionTaskRecord = customerCaseRootCauseAnalysisRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return customerCaseRootCauseAnalysisRetrieveActionRequest
  **/

  public String getCustomerCaseRootCauseAnalysisRetrieveActionRequest() {
    return customerCaseRootCauseAnalysisRetrieveActionRequest;
  }

  public void setCustomerCaseRootCauseAnalysisRetrieveActionRequest(String customerCaseRootCauseAnalysisRetrieveActionRequest) {
    this.customerCaseRootCauseAnalysisRetrieveActionRequest = customerCaseRootCauseAnalysisRetrieveActionRequest;
  }


  /**
   * Get customerCaseRootCauseAnalysisInstanceReportRecord
   * @return customerCaseRootCauseAnalysisInstanceReportRecord
  **/

  public CRCustomerCaseRootCauseAnalysisRetrieveInputModelCustomerCaseRootCauseAnalysisInstanceReportRecord getCustomerCaseRootCauseAnalysisInstanceReportRecord() {
    return customerCaseRootCauseAnalysisInstanceReportRecord;
  }

  public void setCustomerCaseRootCauseAnalysisInstanceReportRecord(CRCustomerCaseRootCauseAnalysisRetrieveInputModelCustomerCaseRootCauseAnalysisInstanceReportRecord customerCaseRootCauseAnalysisInstanceReportRecord) {
    this.customerCaseRootCauseAnalysisInstanceReportRecord = customerCaseRootCauseAnalysisInstanceReportRecord;
  }


  /**
   * Get customerCaseRootCauseAnalysisInstanceAnalysis
   * @return customerCaseRootCauseAnalysisInstanceAnalysis
  **/

  public CRCustomerCaseRootCauseAnalysisRetrieveInputModelCustomerCaseRootCauseAnalysisInstanceAnalysis getCustomerCaseRootCauseAnalysisInstanceAnalysis() {
    return customerCaseRootCauseAnalysisInstanceAnalysis;
  }

  public void setCustomerCaseRootCauseAnalysisInstanceAnalysis(CRCustomerCaseRootCauseAnalysisRetrieveInputModelCustomerCaseRootCauseAnalysisInstanceAnalysis customerCaseRootCauseAnalysisInstanceAnalysis) {
    this.customerCaseRootCauseAnalysisInstanceAnalysis = customerCaseRootCauseAnalysisInstanceAnalysis;
  }


}

