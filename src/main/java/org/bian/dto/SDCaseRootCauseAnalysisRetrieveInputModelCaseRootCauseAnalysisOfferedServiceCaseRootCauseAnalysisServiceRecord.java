package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCaseRootCauseAnalysisRetrieveInputModelCaseRootCauseAnalysisOfferedServiceCaseRootCauseAnalysisServiceRecord
 */
public class SDCaseRootCauseAnalysisRetrieveInputModelCaseRootCauseAnalysisOfferedServiceCaseRootCauseAnalysisServiceRecord   {
  private String caseRootCauseAnalysisServiceVersion = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return caseRootCauseAnalysisServiceVersion
  **/

  public String getCaseRootCauseAnalysisServiceVersion() {
    return caseRootCauseAnalysisServiceVersion;
  }

  public void setCaseRootCauseAnalysisServiceVersion(String caseRootCauseAnalysisServiceVersion) {
    this.caseRootCauseAnalysisServiceVersion = caseRootCauseAnalysisServiceVersion;
  }


}

