package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOperationsandServicingIssueAnalysisRetrieveOutputModelOperationsandServicingIssueAnalysisInstanceAnalysis;
import org.bian.dto.BQOperationsandServicingIssueAnalysisRetrieveOutputModelOperationsandServicingIssueAnalysisInstanceReport;

import javax.validation.Valid;
  
/**
 * BQOperationsandServicingIssueAnalysisRetrieveOutputModel
 */
public class BQOperationsandServicingIssueAnalysisRetrieveOutputModel   {
  private String operationsandServicingIssueAnalysisPreconditions = null;

  private String operationsandServicingIssueAnalysisAnalysisSchedule = null;

  private String operationsandServicingIssueAnalysisVersionNumber = null;

  private String operationsandServicingIssueAnalysis = null;

  private String operationsandServicingIssueAnalysisServiceType = null;

  private String operationsandServicingIssueAnalysisServiceDescription = null;

  private String operationsandServicingIssueAnalysisServiceInputsandOuputs = null;

  private String operationsandServicingIssueAnalysisServiceWorkProduct = null;

  private String operationsandServicingIssueAnalysisRetrieveActionTaskReference = null;

  private Object operationsandServicingIssueAnalysisRetrieveActionTaskRecord = null;

  private String operationsandServicingIssueAnalysisRetrieveActionResponse = null;

  private BQOperationsandServicingIssueAnalysisRetrieveOutputModelOperationsandServicingIssueAnalysisInstanceReport operationsandServicingIssueAnalysisInstanceReport = null;

  private BQOperationsandServicingIssueAnalysisRetrieveOutputModelOperationsandServicingIssueAnalysisInstanceAnalysis operationsandServicingIssueAnalysisInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the algorithm can be applied 
   * @return operationsandServicingIssueAnalysisPreconditions
  **/

  public String getOperationsandServicingIssueAnalysisPreconditions() {
    return operationsandServicingIssueAnalysisPreconditions;
  }

  public void setOperationsandServicingIssueAnalysisPreconditions(String operationsandServicingIssueAnalysisPreconditions) {
    this.operationsandServicingIssueAnalysisPreconditions = operationsandServicingIssueAnalysisPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the analysis performed using the algorithm 
   * @return operationsandServicingIssueAnalysisAnalysisSchedule
  **/

  public String getOperationsandServicingIssueAnalysisAnalysisSchedule() {
    return operationsandServicingIssueAnalysisAnalysisSchedule;
  }

  public void setOperationsandServicingIssueAnalysisAnalysisSchedule(String operationsandServicingIssueAnalysisAnalysisSchedule) {
    this.operationsandServicingIssueAnalysisAnalysisSchedule = operationsandServicingIssueAnalysisAnalysisSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The algorithm version employed in the analysis 
   * @return operationsandServicingIssueAnalysisVersionNumber
  **/

  public String getOperationsandServicingIssueAnalysisVersionNumber() {
    return operationsandServicingIssueAnalysisVersionNumber;
  }

  public void setOperationsandServicingIssueAnalysisVersionNumber(String operationsandServicingIssueAnalysisVersionNumber) {
    this.operationsandServicingIssueAnalysisVersionNumber = operationsandServicingIssueAnalysisVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Customer Case Root Cause Analysis specific Business Service 
   * @return operationsandServicingIssueAnalysis
  **/

  public String getOperationsandServicingIssueAnalysis() {
    return operationsandServicingIssueAnalysis;
  }

  public void setOperationsandServicingIssueAnalysis(String operationsandServicingIssueAnalysis) {
    this.operationsandServicingIssueAnalysis = operationsandServicingIssueAnalysis;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return operationsandServicingIssueAnalysisServiceType
  **/

  public String getOperationsandServicingIssueAnalysisServiceType() {
    return operationsandServicingIssueAnalysisServiceType;
  }

  public void setOperationsandServicingIssueAnalysisServiceType(String operationsandServicingIssueAnalysisServiceType) {
    this.operationsandServicingIssueAnalysisServiceType = operationsandServicingIssueAnalysisServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return operationsandServicingIssueAnalysisServiceDescription
  **/

  public String getOperationsandServicingIssueAnalysisServiceDescription() {
    return operationsandServicingIssueAnalysisServiceDescription;
  }

  public void setOperationsandServicingIssueAnalysisServiceDescription(String operationsandServicingIssueAnalysisServiceDescription) {
    this.operationsandServicingIssueAnalysisServiceDescription = operationsandServicingIssueAnalysisServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return operationsandServicingIssueAnalysisServiceInputsandOuputs
  **/

  public String getOperationsandServicingIssueAnalysisServiceInputsandOuputs() {
    return operationsandServicingIssueAnalysisServiceInputsandOuputs;
  }

  public void setOperationsandServicingIssueAnalysisServiceInputsandOuputs(String operationsandServicingIssueAnalysisServiceInputsandOuputs) {
    this.operationsandServicingIssueAnalysisServiceInputsandOuputs = operationsandServicingIssueAnalysisServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return operationsandServicingIssueAnalysisServiceWorkProduct
  **/

  public String getOperationsandServicingIssueAnalysisServiceWorkProduct() {
    return operationsandServicingIssueAnalysisServiceWorkProduct;
  }

  public void setOperationsandServicingIssueAnalysisServiceWorkProduct(String operationsandServicingIssueAnalysisServiceWorkProduct) {
    this.operationsandServicingIssueAnalysisServiceWorkProduct = operationsandServicingIssueAnalysisServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Operations and Servicing Issue Analysis instance retrieve service call 
   * @return operationsandServicingIssueAnalysisRetrieveActionTaskReference
  **/

  public String getOperationsandServicingIssueAnalysisRetrieveActionTaskReference() {
    return operationsandServicingIssueAnalysisRetrieveActionTaskReference;
  }

  public void setOperationsandServicingIssueAnalysisRetrieveActionTaskReference(String operationsandServicingIssueAnalysisRetrieveActionTaskReference) {
    this.operationsandServicingIssueAnalysisRetrieveActionTaskReference = operationsandServicingIssueAnalysisRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return operationsandServicingIssueAnalysisRetrieveActionResponse
  **/

  public String getOperationsandServicingIssueAnalysisRetrieveActionResponse() {
    return operationsandServicingIssueAnalysisRetrieveActionResponse;
  }

  public void setOperationsandServicingIssueAnalysisRetrieveActionResponse(String operationsandServicingIssueAnalysisRetrieveActionResponse) {
    this.operationsandServicingIssueAnalysisRetrieveActionResponse = operationsandServicingIssueAnalysisRetrieveActionResponse;
  }


  /**
   * Get operationsandServicingIssueAnalysisInstanceReport
   * @return operationsandServicingIssueAnalysisInstanceReport
  **/

  public BQOperationsandServicingIssueAnalysisRetrieveOutputModelOperationsandServicingIssueAnalysisInstanceReport getOperationsandServicingIssueAnalysisInstanceReport() {
    return operationsandServicingIssueAnalysisInstanceReport;
  }

  public void setOperationsandServicingIssueAnalysisInstanceReport(BQOperationsandServicingIssueAnalysisRetrieveOutputModelOperationsandServicingIssueAnalysisInstanceReport operationsandServicingIssueAnalysisInstanceReport) {
    this.operationsandServicingIssueAnalysisInstanceReport = operationsandServicingIssueAnalysisInstanceReport;
  }


  /**
   * Get operationsandServicingIssueAnalysisInstanceAnalysis
   * @return operationsandServicingIssueAnalysisInstanceAnalysis
  **/

  public BQOperationsandServicingIssueAnalysisRetrieveOutputModelOperationsandServicingIssueAnalysisInstanceAnalysis getOperationsandServicingIssueAnalysisInstanceAnalysis() {
    return operationsandServicingIssueAnalysisInstanceAnalysis;
  }

  public void setOperationsandServicingIssueAnalysisInstanceAnalysis(BQOperationsandServicingIssueAnalysisRetrieveOutputModelOperationsandServicingIssueAnalysisInstanceAnalysis operationsandServicingIssueAnalysisInstanceAnalysis) {
    this.operationsandServicingIssueAnalysisInstanceAnalysis = operationsandServicingIssueAnalysisInstanceAnalysis;
  }


}
