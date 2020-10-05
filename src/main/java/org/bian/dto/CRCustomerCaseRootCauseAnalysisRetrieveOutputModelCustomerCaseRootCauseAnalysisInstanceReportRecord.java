package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCaseRootCauseAnalysisRetrieveOutputModelCustomerCaseRootCauseAnalysisInstanceReportRecord
 */
public class CRCustomerCaseRootCauseAnalysisRetrieveOutputModelCustomerCaseRootCauseAnalysisInstanceReportRecord   {
  private String customerCaseRootCauseAnalysisInstanceReportData = null;

  private String customerCaseRootCauseAnalysisInstanceReportType = null;

  private Object customerCaseRootCauseAnalysisInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return customerCaseRootCauseAnalysisInstanceReportData
  **/

  public String getCustomerCaseRootCauseAnalysisInstanceReportData() {
    return customerCaseRootCauseAnalysisInstanceReportData;
  }

  public void setCustomerCaseRootCauseAnalysisInstanceReportData(String customerCaseRootCauseAnalysisInstanceReportData) {
    this.customerCaseRootCauseAnalysisInstanceReportData = customerCaseRootCauseAnalysisInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return customerCaseRootCauseAnalysisInstanceReportType
  **/

  public String getCustomerCaseRootCauseAnalysisInstanceReportType() {
    return customerCaseRootCauseAnalysisInstanceReportType;
  }

  public void setCustomerCaseRootCauseAnalysisInstanceReportType(String customerCaseRootCauseAnalysisInstanceReportType) {
    this.customerCaseRootCauseAnalysisInstanceReportType = customerCaseRootCauseAnalysisInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return customerCaseRootCauseAnalysisInstanceReport
  **/

  public Object getCustomerCaseRootCauseAnalysisInstanceReport() {
    return customerCaseRootCauseAnalysisInstanceReport;
  }

  public void setCustomerCaseRootCauseAnalysisInstanceReport(Object customerCaseRootCauseAnalysisInstanceReport) {
    this.customerCaseRootCauseAnalysisInstanceReport = customerCaseRootCauseAnalysisInstanceReport;
  }


}

