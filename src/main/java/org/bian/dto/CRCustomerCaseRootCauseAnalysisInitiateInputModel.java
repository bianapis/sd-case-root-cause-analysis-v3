package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCaseRootCauseAnalysisInitiateInputModel
 */
public class CRCustomerCaseRootCauseAnalysisInitiateInputModel   {
  private String caseRootCauseAnalysisServicingSessionReference = null;

  private Object customerCaseRootCauseAnalysisInitiateActionRecord = null;

  private String customerCaseRootCauseAnalysisInstanceStatus = null;

  private String customerCaseRootCauseAnalysisParameterType = null;

  private String customerCaseRootCauseAnalysisSelectedOption = null;

  private String customerCaseRootCauseAnalysisRequest = null;

  private String customerCaseRootCauseAnalysisSchedule = null;

  private String customerCaseRootCauseAnalysisStatus = null;

  private String customerCaseRootCauseAnalysisUsageLog = null;

  private String customerCaseRootCauseAnalysisRequesterReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return caseRootCauseAnalysisServicingSessionReference
  **/

  public String getCaseRootCauseAnalysisServicingSessionReference() {
    return caseRootCauseAnalysisServicingSessionReference;
  }

  public void setCaseRootCauseAnalysisServicingSessionReference(String caseRootCauseAnalysisServicingSessionReference) {
    this.caseRootCauseAnalysisServicingSessionReference = caseRootCauseAnalysisServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return customerCaseRootCauseAnalysisInitiateActionRecord
  **/

  public Object getCustomerCaseRootCauseAnalysisInitiateActionRecord() {
    return customerCaseRootCauseAnalysisInitiateActionRecord;
  }

  public void setCustomerCaseRootCauseAnalysisInitiateActionRecord(Object customerCaseRootCauseAnalysisInitiateActionRecord) {
    this.customerCaseRootCauseAnalysisInitiateActionRecord = customerCaseRootCauseAnalysisInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Customer Case Root Cause Analysis instance (e.g. initialised, pending, active) 
   * @return customerCaseRootCauseAnalysisInstanceStatus
  **/

  public String getCustomerCaseRootCauseAnalysisInstanceStatus() {
    return customerCaseRootCauseAnalysisInstanceStatus;
  }

  public void setCustomerCaseRootCauseAnalysisInstanceStatus(String customerCaseRootCauseAnalysisInstanceStatus) {
    this.customerCaseRootCauseAnalysisInstanceStatus = customerCaseRootCauseAnalysisInstanceStatus;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Timetable to perform Customer Case Root Cause Analysis 
   * @return customerCaseRootCauseAnalysisSchedule
  **/

  public String getCustomerCaseRootCauseAnalysisSchedule() {
    return customerCaseRootCauseAnalysisSchedule;
  }

  public void setCustomerCaseRootCauseAnalysisSchedule(String customerCaseRootCauseAnalysisSchedule) {
    this.customerCaseRootCauseAnalysisSchedule = customerCaseRootCauseAnalysisSchedule;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the party who has requested Customer Case Root Cause Analysis 
   * @return customerCaseRootCauseAnalysisRequesterReference
  **/

  public String getCustomerCaseRootCauseAnalysisRequesterReference() {
    return customerCaseRootCauseAnalysisRequesterReference;
  }

  public void setCustomerCaseRootCauseAnalysisRequesterReference(String customerCaseRootCauseAnalysisRequesterReference) {
    this.customerCaseRootCauseAnalysisRequesterReference = customerCaseRootCauseAnalysisRequesterReference;
  }


}

