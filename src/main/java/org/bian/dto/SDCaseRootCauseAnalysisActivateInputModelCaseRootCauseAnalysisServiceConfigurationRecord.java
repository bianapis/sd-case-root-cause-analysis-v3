package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCaseRootCauseAnalysisActivateInputModelCaseRootCauseAnalysisServiceConfigurationRecordCaseRootCauseAnalysisServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDCaseRootCauseAnalysisActivateInputModelCaseRootCauseAnalysisServiceConfigurationRecord
 */
public class SDCaseRootCauseAnalysisActivateInputModelCaseRootCauseAnalysisServiceConfigurationRecord   {
  private String caseRootCauseAnalysisServiceConfigurationSettingReference = null;

  private String caseRootCauseAnalysisServiceConfigurationSettingType = null;

  private SDCaseRootCauseAnalysisActivateInputModelCaseRootCauseAnalysisServiceConfigurationRecordCaseRootCauseAnalysisServiceConfigurationSetup caseRootCauseAnalysisServiceConfigurationSetup = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return caseRootCauseAnalysisServiceConfigurationSettingReference
  **/

  public String getCaseRootCauseAnalysisServiceConfigurationSettingReference() {
    return caseRootCauseAnalysisServiceConfigurationSettingReference;
  }

  public void setCaseRootCauseAnalysisServiceConfigurationSettingReference(String caseRootCauseAnalysisServiceConfigurationSettingReference) {
    this.caseRootCauseAnalysisServiceConfigurationSettingReference = caseRootCauseAnalysisServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return caseRootCauseAnalysisServiceConfigurationSettingType
  **/

  public String getCaseRootCauseAnalysisServiceConfigurationSettingType() {
    return caseRootCauseAnalysisServiceConfigurationSettingType;
  }

  public void setCaseRootCauseAnalysisServiceConfigurationSettingType(String caseRootCauseAnalysisServiceConfigurationSettingType) {
    this.caseRootCauseAnalysisServiceConfigurationSettingType = caseRootCauseAnalysisServiceConfigurationSettingType;
  }


  /**
   * Get caseRootCauseAnalysisServiceConfigurationSetup
   * @return caseRootCauseAnalysisServiceConfigurationSetup
  **/

  public SDCaseRootCauseAnalysisActivateInputModelCaseRootCauseAnalysisServiceConfigurationRecordCaseRootCauseAnalysisServiceConfigurationSetup getCaseRootCauseAnalysisServiceConfigurationSetup() {
    return caseRootCauseAnalysisServiceConfigurationSetup;
  }

  public void setCaseRootCauseAnalysisServiceConfigurationSetup(SDCaseRootCauseAnalysisActivateInputModelCaseRootCauseAnalysisServiceConfigurationRecordCaseRootCauseAnalysisServiceConfigurationSetup caseRootCauseAnalysisServiceConfigurationSetup) {
    this.caseRootCauseAnalysisServiceConfigurationSetup = caseRootCauseAnalysisServiceConfigurationSetup;
  }


}

