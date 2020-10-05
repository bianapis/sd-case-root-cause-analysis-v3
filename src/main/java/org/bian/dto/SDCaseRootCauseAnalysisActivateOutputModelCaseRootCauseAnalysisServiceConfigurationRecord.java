package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCaseRootCauseAnalysisActivateInputModelCaseRootCauseAnalysisServiceConfigurationRecordCaseRootCauseAnalysisServiceConfigurationSetup;
import org.bian.dto.SDCaseRootCauseAnalysisActivateOutputModelCaseRootCauseAnalysisServiceConfigurationRecordCaseRootCauseAnalysisServiceAgreement;
import org.bian.dto.SDCaseRootCauseAnalysisActivateOutputModelCaseRootCauseAnalysisServiceConfigurationRecordCaseRootCauseAnalysisServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDCaseRootCauseAnalysisActivateOutputModelCaseRootCauseAnalysisServiceConfigurationRecord
 */
public class SDCaseRootCauseAnalysisActivateOutputModelCaseRootCauseAnalysisServiceConfigurationRecord   {
  private String caseRootCauseAnalysisServiceConfigurationSettingReference = null;

  private String caseRootCauseAnalysisServiceConfigurationSettingDescription = null;

  private SDCaseRootCauseAnalysisActivateInputModelCaseRootCauseAnalysisServiceConfigurationRecordCaseRootCauseAnalysisServiceConfigurationSetup caseRootCauseAnalysisServiceConfigurationSetup = null;

  private SDCaseRootCauseAnalysisActivateOutputModelCaseRootCauseAnalysisServiceConfigurationRecordCaseRootCauseAnalysisServiceSubscription caseRootCauseAnalysisServiceSubscription = null;

  private SDCaseRootCauseAnalysisActivateOutputModelCaseRootCauseAnalysisServiceConfigurationRecordCaseRootCauseAnalysisServiceAgreement caseRootCauseAnalysisServiceAgreement = null;

  private String caseRootCauseAnalysisServiceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return caseRootCauseAnalysisServiceConfigurationSettingDescription
  **/

  public String getCaseRootCauseAnalysisServiceConfigurationSettingDescription() {
    return caseRootCauseAnalysisServiceConfigurationSettingDescription;
  }

  public void setCaseRootCauseAnalysisServiceConfigurationSettingDescription(String caseRootCauseAnalysisServiceConfigurationSettingDescription) {
    this.caseRootCauseAnalysisServiceConfigurationSettingDescription = caseRootCauseAnalysisServiceConfigurationSettingDescription;
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


  /**
   * Get caseRootCauseAnalysisServiceSubscription
   * @return caseRootCauseAnalysisServiceSubscription
  **/

  public SDCaseRootCauseAnalysisActivateOutputModelCaseRootCauseAnalysisServiceConfigurationRecordCaseRootCauseAnalysisServiceSubscription getCaseRootCauseAnalysisServiceSubscription() {
    return caseRootCauseAnalysisServiceSubscription;
  }

  public void setCaseRootCauseAnalysisServiceSubscription(SDCaseRootCauseAnalysisActivateOutputModelCaseRootCauseAnalysisServiceConfigurationRecordCaseRootCauseAnalysisServiceSubscription caseRootCauseAnalysisServiceSubscription) {
    this.caseRootCauseAnalysisServiceSubscription = caseRootCauseAnalysisServiceSubscription;
  }


  /**
   * Get caseRootCauseAnalysisServiceAgreement
   * @return caseRootCauseAnalysisServiceAgreement
  **/

  public SDCaseRootCauseAnalysisActivateOutputModelCaseRootCauseAnalysisServiceConfigurationRecordCaseRootCauseAnalysisServiceAgreement getCaseRootCauseAnalysisServiceAgreement() {
    return caseRootCauseAnalysisServiceAgreement;
  }

  public void setCaseRootCauseAnalysisServiceAgreement(SDCaseRootCauseAnalysisActivateOutputModelCaseRootCauseAnalysisServiceConfigurationRecordCaseRootCauseAnalysisServiceAgreement caseRootCauseAnalysisServiceAgreement) {
    this.caseRootCauseAnalysisServiceAgreement = caseRootCauseAnalysisServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return caseRootCauseAnalysisServiceStatus
  **/

  public String getCaseRootCauseAnalysisServiceStatus() {
    return caseRootCauseAnalysisServiceStatus;
  }

  public void setCaseRootCauseAnalysisServiceStatus(String caseRootCauseAnalysisServiceStatus) {
    this.caseRootCauseAnalysisServiceStatus = caseRootCauseAnalysisServiceStatus;
  }


}

