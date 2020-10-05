package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCaseRootCauseAnalysisConfigureInputModelCaseRootCauseAnalysisServiceConfigurationRecordCaseRootCauseAnalysisServiceConfigurationSetup
 */
public class SDCaseRootCauseAnalysisConfigureInputModelCaseRootCauseAnalysisServiceConfigurationRecordCaseRootCauseAnalysisServiceConfigurationSetup   {
  private String caseRootCauseAnalysisServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The requested and current activation values for the service configuration parameter  
   * @return caseRootCauseAnalysisServiceConfigurationParameter
  **/

  public String getCaseRootCauseAnalysisServiceConfigurationParameter() {
    return caseRootCauseAnalysisServiceConfigurationParameter;
  }

  public void setCaseRootCauseAnalysisServiceConfigurationParameter(String caseRootCauseAnalysisServiceConfigurationParameter) {
    this.caseRootCauseAnalysisServiceConfigurationParameter = caseRootCauseAnalysisServiceConfigurationParameter;
  }


}

