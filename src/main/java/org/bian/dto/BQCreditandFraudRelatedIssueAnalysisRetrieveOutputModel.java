package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCreditandFraudRelatedIssueAnalysisRetrieveOutputModelCreditandFraudRelatedIssueAnalysisInstanceAnalysis;
import org.bian.dto.BQCreditandFraudRelatedIssueAnalysisRetrieveOutputModelCreditandFraudRelatedIssueAnalysisInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCreditandFraudRelatedIssueAnalysisRetrieveOutputModel
 */
public class BQCreditandFraudRelatedIssueAnalysisRetrieveOutputModel   {
  private String creditandFraudRelatedIssueAnalysisPreconditions = null;

  private String creditandFraudRelatedIssueAnalysisAnalysisSchedule = null;

  private String creditandFraudRelatedIssueAnalysisVersionNumber = null;

  private String creditandFraudRelatedIssueAnalysis = null;

  private String creditandFraudRelatedIssueAnalysisServiceType = null;

  private String creditandFraudRelatedIssueAnalysisServiceDescription = null;

  private String creditandFraudRelatedIssueAnalysisServiceInputsandOuputs = null;

  private String creditandFraudRelatedIssueAnalysisServiceWorkProduct = null;

  private String creditandFraudRelatedIssueAnalysisServiceName = null;

  private String creditandFraudRelatedIssueAnalysisRetrieveActionTaskReference = null;

  private Object creditandFraudRelatedIssueAnalysisRetrieveActionTaskRecord = null;

  private String creditandFraudRelatedIssueAnalysisRetrieveActionResponse = null;

  private BQCreditandFraudRelatedIssueAnalysisRetrieveOutputModelCreditandFraudRelatedIssueAnalysisInstanceReport creditandFraudRelatedIssueAnalysisInstanceReport = null;

  private BQCreditandFraudRelatedIssueAnalysisRetrieveOutputModelCreditandFraudRelatedIssueAnalysisInstanceAnalysis creditandFraudRelatedIssueAnalysisInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Credit and Fraud Related Issue Analysis instance retrieve service call 
   * @return creditandFraudRelatedIssueAnalysisRetrieveActionTaskReference
  **/

  public String getCreditandFraudRelatedIssueAnalysisRetrieveActionTaskReference() {
    return creditandFraudRelatedIssueAnalysisRetrieveActionTaskReference;
  }

  public void setCreditandFraudRelatedIssueAnalysisRetrieveActionTaskReference(String creditandFraudRelatedIssueAnalysisRetrieveActionTaskReference) {
    this.creditandFraudRelatedIssueAnalysisRetrieveActionTaskReference = creditandFraudRelatedIssueAnalysisRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return creditandFraudRelatedIssueAnalysisRetrieveActionTaskRecord
  **/

  public Object getCreditandFraudRelatedIssueAnalysisRetrieveActionTaskRecord() {
    return creditandFraudRelatedIssueAnalysisRetrieveActionTaskRecord;
  }

  public void setCreditandFraudRelatedIssueAnalysisRetrieveActionTaskRecord(Object creditandFraudRelatedIssueAnalysisRetrieveActionTaskRecord) {
    this.creditandFraudRelatedIssueAnalysisRetrieveActionTaskRecord = creditandFraudRelatedIssueAnalysisRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return creditandFraudRelatedIssueAnalysisRetrieveActionResponse
  **/

  public String getCreditandFraudRelatedIssueAnalysisRetrieveActionResponse() {
    return creditandFraudRelatedIssueAnalysisRetrieveActionResponse;
  }

  public void setCreditandFraudRelatedIssueAnalysisRetrieveActionResponse(String creditandFraudRelatedIssueAnalysisRetrieveActionResponse) {
    this.creditandFraudRelatedIssueAnalysisRetrieveActionResponse = creditandFraudRelatedIssueAnalysisRetrieveActionResponse;
  }


  /**
   * Get creditandFraudRelatedIssueAnalysisInstanceReport
   * @return creditandFraudRelatedIssueAnalysisInstanceReport
  **/

  public BQCreditandFraudRelatedIssueAnalysisRetrieveOutputModelCreditandFraudRelatedIssueAnalysisInstanceReport getCreditandFraudRelatedIssueAnalysisInstanceReport() {
    return creditandFraudRelatedIssueAnalysisInstanceReport;
  }

  public void setCreditandFraudRelatedIssueAnalysisInstanceReport(BQCreditandFraudRelatedIssueAnalysisRetrieveOutputModelCreditandFraudRelatedIssueAnalysisInstanceReport creditandFraudRelatedIssueAnalysisInstanceReport) {
    this.creditandFraudRelatedIssueAnalysisInstanceReport = creditandFraudRelatedIssueAnalysisInstanceReport;
  }


  /**
   * Get creditandFraudRelatedIssueAnalysisInstanceAnalysis
   * @return creditandFraudRelatedIssueAnalysisInstanceAnalysis
  **/

  public BQCreditandFraudRelatedIssueAnalysisRetrieveOutputModelCreditandFraudRelatedIssueAnalysisInstanceAnalysis getCreditandFraudRelatedIssueAnalysisInstanceAnalysis() {
    return creditandFraudRelatedIssueAnalysisInstanceAnalysis;
  }

  public void setCreditandFraudRelatedIssueAnalysisInstanceAnalysis(BQCreditandFraudRelatedIssueAnalysisRetrieveOutputModelCreditandFraudRelatedIssueAnalysisInstanceAnalysis creditandFraudRelatedIssueAnalysisInstanceAnalysis) {
    this.creditandFraudRelatedIssueAnalysisInstanceAnalysis = creditandFraudRelatedIssueAnalysisInstanceAnalysis;
  }


}

