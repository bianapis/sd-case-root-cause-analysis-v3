package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCaseRootCauseAnalysisRequestOutputModel
 */
public class CRCustomerCaseRootCauseAnalysisRequestOutputModel   {
  private String customerCaseRootCauseAnalysisParameterType = null;

  private String customerCaseRootCauseAnalysisSelectedOption = null;

  private String customerCaseRootCauseAnalysisRequest = null;

  private String customerCaseRootCauseAnalysisStatus = null;

  private String customerCaseRootCauseAnalysisUsageLog = null;

  private String customerCaseRootCauseAnalysisRequestActionTaskReference = null;

  private Object customerCaseRootCauseAnalysisRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between Analysis according to the type of business services and/or type of concern defined within Customer Case Root Cause Analysis . Eg Market Analysis, Risk Analysis, Perfomance Analysis, etc. 
   * @return customerCaseRootCauseAnalysisParameterType
  **/

  public String getCustomerCaseRootCauseAnalysisParameterType() {
    return customerCaseRootCauseAnalysisParameterType;
  }

  public void setCustomerCaseRootCauseAnalysisParameterType(String customerCaseRootCauseAnalysisParameterType) {
    this.customerCaseRootCauseAnalysisParameterType = customerCaseRootCauseAnalysisParameterType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A selected optional business service as subject matter of analysis 
   * @return customerCaseRootCauseAnalysisSelectedOption
  **/

  public String getCustomerCaseRootCauseAnalysisSelectedOption() {
    return customerCaseRootCauseAnalysisSelectedOption;
  }

  public void setCustomerCaseRootCauseAnalysisSelectedOption(String customerCaseRootCauseAnalysisSelectedOption) {
    this.customerCaseRootCauseAnalysisSelectedOption = customerCaseRootCauseAnalysisSelectedOption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Request to perform Customer Case Root Cause Analysis 
   * @return customerCaseRootCauseAnalysisRequest
  **/

  public String getCustomerCaseRootCauseAnalysisRequest() {
    return customerCaseRootCauseAnalysisRequest;
  }

  public void setCustomerCaseRootCauseAnalysisRequest(String customerCaseRootCauseAnalysisRequest) {
    this.customerCaseRootCauseAnalysisRequest = customerCaseRootCauseAnalysisRequest;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of Customer Case Root Cause Analysis 
   * @return customerCaseRootCauseAnalysisStatus
  **/

  public String getCustomerCaseRootCauseAnalysisStatus() {
    return customerCaseRootCauseAnalysisStatus;
  }

  public void setCustomerCaseRootCauseAnalysisStatus(String customerCaseRootCauseAnalysisStatus) {
    this.customerCaseRootCauseAnalysisStatus = customerCaseRootCauseAnalysisStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the log of (usage) ativities/events of Customer Case Root Cause Analysis 
   * @return customerCaseRootCauseAnalysisUsageLog
  **/

  public String getCustomerCaseRootCauseAnalysisUsageLog() {
    return customerCaseRootCauseAnalysisUsageLog;
  }

  public void setCustomerCaseRootCauseAnalysisUsageLog(String customerCaseRootCauseAnalysisUsageLog) {
    this.customerCaseRootCauseAnalysisUsageLog = customerCaseRootCauseAnalysisUsageLog;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Case Root Cause Analysis instance request service call 
   * @return customerCaseRootCauseAnalysisRequestActionTaskReference
  **/

  public String getCustomerCaseRootCauseAnalysisRequestActionTaskReference() {
    return customerCaseRootCauseAnalysisRequestActionTaskReference;
  }

  public void setCustomerCaseRootCauseAnalysisRequestActionTaskReference(String customerCaseRootCauseAnalysisRequestActionTaskReference) {
    this.customerCaseRootCauseAnalysisRequestActionTaskReference = customerCaseRootCauseAnalysisRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return customerCaseRootCauseAnalysisRequestActionTaskRecord
  **/

  public Object getCustomerCaseRootCauseAnalysisRequestActionTaskRecord() {
    return customerCaseRootCauseAnalysisRequestActionTaskRecord;
  }

  public void setCustomerCaseRootCauseAnalysisRequestActionTaskRecord(Object customerCaseRootCauseAnalysisRequestActionTaskRecord) {
    this.customerCaseRootCauseAnalysisRequestActionTaskRecord = customerCaseRootCauseAnalysisRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

