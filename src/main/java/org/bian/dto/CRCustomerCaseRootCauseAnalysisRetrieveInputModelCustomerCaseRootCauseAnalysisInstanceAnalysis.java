package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCaseRootCauseAnalysisRetrieveInputModelCustomerCaseRootCauseAnalysisInstanceAnalysis
 */
public class CRCustomerCaseRootCauseAnalysisRetrieveInputModelCustomerCaseRootCauseAnalysisInstanceAnalysis   {
  private String customerCaseRootCauseAnalysisInstanceAnalysisReference = null;

  private String customerCaseRootCauseAnalysisInstanceAnalysisReportType = null;

  private String customerCaseRootCauseAnalysisInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return customerCaseRootCauseAnalysisInstanceAnalysisReference
  **/

  public String getCustomerCaseRootCauseAnalysisInstanceAnalysisReference() {
    return customerCaseRootCauseAnalysisInstanceAnalysisReference;
  }

  public void setCustomerCaseRootCauseAnalysisInstanceAnalysisReference(String customerCaseRootCauseAnalysisInstanceAnalysisReference) {
    this.customerCaseRootCauseAnalysisInstanceAnalysisReference = customerCaseRootCauseAnalysisInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return customerCaseRootCauseAnalysisInstanceAnalysisParameters
  **/

  public String getCustomerCaseRootCauseAnalysisInstanceAnalysisParameters() {
    return customerCaseRootCauseAnalysisInstanceAnalysisParameters;
  }

  public void setCustomerCaseRootCauseAnalysisInstanceAnalysisParameters(String customerCaseRootCauseAnalysisInstanceAnalysisParameters) {
    this.customerCaseRootCauseAnalysisInstanceAnalysisParameters = customerCaseRootCauseAnalysisInstanceAnalysisParameters;
  }


}

