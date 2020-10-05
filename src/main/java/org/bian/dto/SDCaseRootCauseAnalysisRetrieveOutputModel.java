package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCaseRootCauseAnalysisRetrieveOutputModelCaseRootCauseAnalysisOfferedService;
import org.bian.dto.SDCaseRootCauseAnalysisRetrieveOutputModelCaseRootCauseAnalysisRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDCaseRootCauseAnalysisRetrieveOutputModel
 */
public class SDCaseRootCauseAnalysisRetrieveOutputModel   {
  private String caseRootCauseAnalysisRetrieveActionTaskReference = null;

  private Object caseRootCauseAnalysisRetrieveActionTaskRecord = null;

  private String caseRootCauseAnalysisRetrieveActionResponse = null;

  private SDCaseRootCauseAnalysisRetrieveOutputModelCaseRootCauseAnalysisRetrieveActionRecord caseRootCauseAnalysisRetrieveActionRecord = null;

  private SDCaseRootCauseAnalysisRetrieveOutputModelCaseRootCauseAnalysisOfferedService caseRootCauseAnalysisOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return caseRootCauseAnalysisRetrieveActionTaskReference
  **/

  public String getCaseRootCauseAnalysisRetrieveActionTaskReference() {
    return caseRootCauseAnalysisRetrieveActionTaskReference;
  }

  public void setCaseRootCauseAnalysisRetrieveActionTaskReference(String caseRootCauseAnalysisRetrieveActionTaskReference) {
    this.caseRootCauseAnalysisRetrieveActionTaskReference = caseRootCauseAnalysisRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return caseRootCauseAnalysisRetrieveActionTaskRecord
  **/

  public Object getCaseRootCauseAnalysisRetrieveActionTaskRecord() {
    return caseRootCauseAnalysisRetrieveActionTaskRecord;
  }

  public void setCaseRootCauseAnalysisRetrieveActionTaskRecord(Object caseRootCauseAnalysisRetrieveActionTaskRecord) {
    this.caseRootCauseAnalysisRetrieveActionTaskRecord = caseRootCauseAnalysisRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return caseRootCauseAnalysisRetrieveActionResponse
  **/

  public String getCaseRootCauseAnalysisRetrieveActionResponse() {
    return caseRootCauseAnalysisRetrieveActionResponse;
  }

  public void setCaseRootCauseAnalysisRetrieveActionResponse(String caseRootCauseAnalysisRetrieveActionResponse) {
    this.caseRootCauseAnalysisRetrieveActionResponse = caseRootCauseAnalysisRetrieveActionResponse;
  }


  /**
   * Get caseRootCauseAnalysisRetrieveActionRecord
   * @return caseRootCauseAnalysisRetrieveActionRecord
  **/

  public SDCaseRootCauseAnalysisRetrieveOutputModelCaseRootCauseAnalysisRetrieveActionRecord getCaseRootCauseAnalysisRetrieveActionRecord() {
    return caseRootCauseAnalysisRetrieveActionRecord;
  }

  public void setCaseRootCauseAnalysisRetrieveActionRecord(SDCaseRootCauseAnalysisRetrieveOutputModelCaseRootCauseAnalysisRetrieveActionRecord caseRootCauseAnalysisRetrieveActionRecord) {
    this.caseRootCauseAnalysisRetrieveActionRecord = caseRootCauseAnalysisRetrieveActionRecord;
  }


  /**
   * Get caseRootCauseAnalysisOfferedService
   * @return caseRootCauseAnalysisOfferedService
  **/

  public SDCaseRootCauseAnalysisRetrieveOutputModelCaseRootCauseAnalysisOfferedService getCaseRootCauseAnalysisOfferedService() {
    return caseRootCauseAnalysisOfferedService;
  }

  public void setCaseRootCauseAnalysisOfferedService(SDCaseRootCauseAnalysisRetrieveOutputModelCaseRootCauseAnalysisOfferedService caseRootCauseAnalysisOfferedService) {
    this.caseRootCauseAnalysisOfferedService = caseRootCauseAnalysisOfferedService;
  }


}

