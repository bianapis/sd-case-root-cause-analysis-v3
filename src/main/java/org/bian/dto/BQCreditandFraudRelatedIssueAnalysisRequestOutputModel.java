package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCreditandFraudRelatedIssueAnalysisRequestOutputModel
 */
public class BQCreditandFraudRelatedIssueAnalysisRequestOutputModel   {
  private String creditandFraudRelatedIssueAnalysisPreconditions = null;

  private String creditandFraudRelatedIssueAnalysisAnalysisSchedule = null;

  private String creditandFraudRelatedIssueAnalysisVersionNumber = null;

  private String creditandFraudRelatedIssueAnalysis = null;

  private String creditandFraudRelatedIssueAnalysisServiceType = null;

  private String creditandFraudRelatedIssueAnalysisServiceDescription = null;

  private String creditandFraudRelatedIssueAnalysisServiceInputsandOuputs = null;

  private String creditandFraudRelatedIssueAnalysisServiceWorkProduct = null;

  private String creditandFraudRelatedIssueAnalysisServiceName = null;

  private String creditandFraudRelatedIssueAnalysisRequestActionTaskReference = null;

  private Object creditandFraudRelatedIssueAnalysisRequestActionTaskRecord = null;

  private String creditandFraudRelatedIssueAnalysisRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the algorithm can be applied 
   * @return creditandFraudRelatedIssueAnalysisPreconditions
  **/

  public String getCreditandFraudRelatedIssueAnalysisPreconditions() {
    return creditandFraudRelatedIssueAnalysisPreconditions;
  }

  public void setCreditandFraudRelatedIssueAnalysisPreconditions(String creditandFraudRelatedIssueAnalysisPreconditions) {
    this.creditandFraudRelatedIssueAnalysisPreconditions = creditandFraudRelatedIssueAnalysisPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the analysis performed using the algorithm 
   * @return creditandFraudRelatedIssueAnalysisAnalysisSchedule
  **/

  public String getCreditandFraudRelatedIssueAnalysisAnalysisSchedule() {
    return creditandFraudRelatedIssueAnalysisAnalysisSchedule;
  }

  public void setCreditandFraudRelatedIssueAnalysisAnalysisSchedule(String creditandFraudRelatedIssueAnalysisAnalysisSchedule) {
    this.creditandFraudRelatedIssueAnalysisAnalysisSchedule = creditandFraudRelatedIssueAnalysisAnalysisSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The algorithm version employed in the analysis 
   * @return creditandFraudRelatedIssueAnalysisVersionNumber
  **/

  public String getCreditandFraudRelatedIssueAnalysisVersionNumber() {
    return creditandFraudRelatedIssueAnalysisVersionNumber;
  }

  public void setCreditandFraudRelatedIssueAnalysisVersionNumber(String creditandFraudRelatedIssueAnalysisVersionNumber) {
    this.creditandFraudRelatedIssueAnalysisVersionNumber = creditandFraudRelatedIssueAnalysisVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Customer Case Root Cause Analysis specific Business Service 
   * @return creditandFraudRelatedIssueAnalysis
  **/

  public String getCreditandFraudRelatedIssueAnalysis() {
    return creditandFraudRelatedIssueAnalysis;
  }

  public void setCreditandFraudRelatedIssueAnalysis(String creditandFraudRelatedIssueAnalysis) {
    this.creditandFraudRelatedIssueAnalysis = creditandFraudRelatedIssueAnalysis;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return creditandFraudRelatedIssueAnalysisServiceType
  **/

  public String getCreditandFraudRelatedIssueAnalysisServiceType() {
    return creditandFraudRelatedIssueAnalysisServiceType;
  }

  public void setCreditandFraudRelatedIssueAnalysisServiceType(String creditandFraudRelatedIssueAnalysisServiceType) {
    this.creditandFraudRelatedIssueAnalysisServiceType = creditandFraudRelatedIssueAnalysisServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return creditandFraudRelatedIssueAnalysisServiceDescription
  **/

  public String getCreditandFraudRelatedIssueAnalysisServiceDescription() {
    return creditandFraudRelatedIssueAnalysisServiceDescription;
  }

  public void setCreditandFraudRelatedIssueAnalysisServiceDescription(String creditandFraudRelatedIssueAnalysisServiceDescription) {
    this.creditandFraudRelatedIssueAnalysisServiceDescription = creditandFraudRelatedIssueAnalysisServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return creditandFraudRelatedIssueAnalysisServiceInputsandOuputs
  **/

  public String getCreditandFraudRelatedIssueAnalysisServiceInputsandOuputs() {
    return creditandFraudRelatedIssueAnalysisServiceInputsandOuputs;
  }

  public void setCreditandFraudRelatedIssueAnalysisServiceInputsandOuputs(String creditandFraudRelatedIssueAnalysisServiceInputsandOuputs) {
    this.creditandFraudRelatedIssueAnalysisServiceInputsandOuputs = creditandFraudRelatedIssueAnalysisServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return creditandFraudRelatedIssueAnalysisServiceWorkProduct
  **/

  public String getCreditandFraudRelatedIssueAnalysisServiceWorkProduct() {
    return creditandFraudRelatedIssueAnalysisServiceWorkProduct;
  }

  public void setCreditandFraudRelatedIssueAnalysisServiceWorkProduct(String creditandFraudRelatedIssueAnalysisServiceWorkProduct) {
    this.creditandFraudRelatedIssueAnalysisServiceWorkProduct = creditandFraudRelatedIssueAnalysisServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return creditandFraudRelatedIssueAnalysisServiceName
  **/

  public String getCreditandFraudRelatedIssueAnalysisServiceName() {
    return creditandFraudRelatedIssueAnalysisServiceName;
  }

  public void setCreditandFraudRelatedIssueAnalysisServiceName(String creditandFraudRelatedIssueAnalysisServiceName) {
    this.creditandFraudRelatedIssueAnalysisServiceName = creditandFraudRelatedIssueAnalysisServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Credit and Fraud Related Issue Analysis instance request service call 
   * @return creditandFraudRelatedIssueAnalysisRequestActionTaskReference
  **/

  public String getCreditandFraudRelatedIssueAnalysisRequestActionTaskReference() {
    return creditandFraudRelatedIssueAnalysisRequestActionTaskReference;
  }

  public void setCreditandFraudRelatedIssueAnalysisRequestActionTaskReference(String creditandFraudRelatedIssueAnalysisRequestActionTaskReference) {
    this.creditandFraudRelatedIssueAnalysisRequestActionTaskReference = creditandFraudRelatedIssueAnalysisRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return creditandFraudRelatedIssueAnalysisRequestActionTaskRecord
  **/

  public Object getCreditandFraudRelatedIssueAnalysisRequestActionTaskRecord() {
    return creditandFraudRelatedIssueAnalysisRequestActionTaskRecord;
  }

  public void setCreditandFraudRelatedIssueAnalysisRequestActionTaskRecord(Object creditandFraudRelatedIssueAnalysisRequestActionTaskRecord) {
    this.creditandFraudRelatedIssueAnalysisRequestActionTaskRecord = creditandFraudRelatedIssueAnalysisRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Credit and Fraud Related Issue Analysis service request record 
   * @return creditandFraudRelatedIssueAnalysisRequestRecordReference
  **/

  public String getCreditandFraudRelatedIssueAnalysisRequestRecordReference() {
    return creditandFraudRelatedIssueAnalysisRequestRecordReference;
  }

  public void setCreditandFraudRelatedIssueAnalysisRequestRecordReference(String creditandFraudRelatedIssueAnalysisRequestRecordReference) {
    this.creditandFraudRelatedIssueAnalysisRequestRecordReference = creditandFraudRelatedIssueAnalysisRequestRecordReference;
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

