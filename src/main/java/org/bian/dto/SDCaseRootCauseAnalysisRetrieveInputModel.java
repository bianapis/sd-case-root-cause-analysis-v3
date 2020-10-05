package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCaseRootCauseAnalysisRetrieveInputModelCaseRootCauseAnalysisOfferedService;
import org.bian.dto.SDCaseRootCauseAnalysisRetrieveInputModelCaseRootCauseAnalysisRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDCaseRootCauseAnalysisRetrieveInputModel
 */
public class SDCaseRootCauseAnalysisRetrieveInputModel   {
  private Object caseRootCauseAnalysisRetrieveActionTaskRecord = null;

  private String caseRootCauseAnalysisRetrieveActionRequest = null;

  private SDCaseRootCauseAnalysisRetrieveInputModelCaseRootCauseAnalysisRetrieveActionRecord caseRootCauseAnalysisRetrieveActionRecord = null;

  private SDCaseRootCauseAnalysisRetrieveInputModelCaseRootCauseAnalysisOfferedService caseRootCauseAnalysisOfferedService = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return caseRootCauseAnalysisRetrieveActionRequest
  **/

  public String getCaseRootCauseAnalysisRetrieveActionRequest() {
    return caseRootCauseAnalysisRetrieveActionRequest;
  }

  public void setCaseRootCauseAnalysisRetrieveActionRequest(String caseRootCauseAnalysisRetrieveActionRequest) {
    this.caseRootCauseAnalysisRetrieveActionRequest = caseRootCauseAnalysisRetrieveActionRequest;
  }


  /**
   * Get caseRootCauseAnalysisRetrieveActionRecord
   * @return caseRootCauseAnalysisRetrieveActionRecord
  **/

  public SDCaseRootCauseAnalysisRetrieveInputModelCaseRootCauseAnalysisRetrieveActionRecord getCaseRootCauseAnalysisRetrieveActionRecord() {
    return caseRootCauseAnalysisRetrieveActionRecord;
  }

  public void setCaseRootCauseAnalysisRetrieveActionRecord(SDCaseRootCauseAnalysisRetrieveInputModelCaseRootCauseAnalysisRetrieveActionRecord caseRootCauseAnalysisRetrieveActionRecord) {
    this.caseRootCauseAnalysisRetrieveActionRecord = caseRootCauseAnalysisRetrieveActionRecord;
  }


  /**
   * Get caseRootCauseAnalysisOfferedService
   * @return caseRootCauseAnalysisOfferedService
  **/

  public SDCaseRootCauseAnalysisRetrieveInputModelCaseRootCauseAnalysisOfferedService getCaseRootCauseAnalysisOfferedService() {
    return caseRootCauseAnalysisOfferedService;
  }

  public void setCaseRootCauseAnalysisOfferedService(SDCaseRootCauseAnalysisRetrieveInputModelCaseRootCauseAnalysisOfferedService caseRootCauseAnalysisOfferedService) {
    this.caseRootCauseAnalysisOfferedService = caseRootCauseAnalysisOfferedService;
  }


}

