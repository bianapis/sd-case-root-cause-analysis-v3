package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCaseRootCauseAnalysisRetrieveOutputModelCaseRootCauseAnalysisOfferedServiceCaseRootCauseAnalysisServiceRecord;

import javax.validation.Valid;
  
/**
 * SDCaseRootCauseAnalysisRetrieveOutputModelCaseRootCauseAnalysisOfferedService
 */
public class SDCaseRootCauseAnalysisRetrieveOutputModelCaseRootCauseAnalysisOfferedService   {
  private String caseRootCauseAnalysisServiceReference = null;

  private SDCaseRootCauseAnalysisRetrieveOutputModelCaseRootCauseAnalysisOfferedServiceCaseRootCauseAnalysisServiceRecord caseRootCauseAnalysisServiceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return caseRootCauseAnalysisServiceReference
  **/

  public String getCaseRootCauseAnalysisServiceReference() {
    return caseRootCauseAnalysisServiceReference;
  }

  public void setCaseRootCauseAnalysisServiceReference(String caseRootCauseAnalysisServiceReference) {
    this.caseRootCauseAnalysisServiceReference = caseRootCauseAnalysisServiceReference;
  }


  /**
   * Get caseRootCauseAnalysisServiceRecord
   * @return caseRootCauseAnalysisServiceRecord
  **/

  public SDCaseRootCauseAnalysisRetrieveOutputModelCaseRootCauseAnalysisOfferedServiceCaseRootCauseAnalysisServiceRecord getCaseRootCauseAnalysisServiceRecord() {
    return caseRootCauseAnalysisServiceRecord;
  }

  public void setCaseRootCauseAnalysisServiceRecord(SDCaseRootCauseAnalysisRetrieveOutputModelCaseRootCauseAnalysisOfferedServiceCaseRootCauseAnalysisServiceRecord caseRootCauseAnalysisServiceRecord) {
    this.caseRootCauseAnalysisServiceRecord = caseRootCauseAnalysisServiceRecord;
  }


}

