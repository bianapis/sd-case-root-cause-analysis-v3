package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCaseRootCauseAnalysisRetrieveOutputModelCustomerCaseRootCauseAnalysisInstanceAnalysis
 */
public class CRCustomerCaseRootCauseAnalysisRetrieveOutputModelCustomerCaseRootCauseAnalysisInstanceAnalysis   {
  private String customerCaseRootCauseAnalysisInstanceAnalysisData = null;

  private String customerCaseRootCauseAnalysisInstanceAnalysisReportType = null;

  private Object customerCaseRootCauseAnalysisInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return customerCaseRootCauseAnalysisInstanceAnalysisData
  **/

  public String getCustomerCaseRootCauseAnalysisInstanceAnalysisData() {
    return customerCaseRootCauseAnalysisInstanceAnalysisData;
  }

  public void setCustomerCaseRootCauseAnalysisInstanceAnalysisData(String customerCaseRootCauseAnalysisInstanceAnalysisData) {
    this.customerCaseRootCauseAnalysisInstanceAnalysisData = customerCaseRootCauseAnalysisInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return customerCaseRootCauseAnalysisInstanceAnalysisReportType
  **/

  public String getCustomerCaseRootCauseAnalysisInstanceAnalysisReportType() {
    return customerCaseRootCauseAnalysisInstanceAnalysisReportType;
  }

  public void setCustomerCaseRootCauseAnalysisInstanceAnalysisReportType(String customerCaseRootCauseAnalysisInstanceAnalysisReportType) {
    this.customerCaseRootCauseAnalysisInstanceAnalysisReportType = customerCaseRootCauseAnalysisInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return customerCaseRootCauseAnalysisInstanceAnalysisReport
  **/

  public Object getCustomerCaseRootCauseAnalysisInstanceAnalysisReport() {
    return customerCaseRootCauseAnalysisInstanceAnalysisReport;
  }

  public void setCustomerCaseRootCauseAnalysisInstanceAnalysisReport(Object customerCaseRootCauseAnalysisInstanceAnalysisReport) {
    this.customerCaseRootCauseAnalysisInstanceAnalysisReport = customerCaseRootCauseAnalysisInstanceAnalysisReport;
  }


}

