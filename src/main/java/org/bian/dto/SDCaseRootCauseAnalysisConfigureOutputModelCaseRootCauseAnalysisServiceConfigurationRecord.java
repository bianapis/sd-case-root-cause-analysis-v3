package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCaseRootCauseAnalysisConfigureInputModelCaseRootCauseAnalysisServiceConfigurationRecordCaseRootCauseAnalysisServiceAgreement;
import org.bian.dto.SDCaseRootCauseAnalysisConfigureInputModelCaseRootCauseAnalysisServiceConfigurationRecordCaseRootCauseAnalysisServiceConfigurationSetup;
import org.bian.dto.SDCaseRootCauseAnalysisConfigureInputModelCaseRootCauseAnalysisServiceConfigurationRecordCaseRootCauseAnalysisServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDCaseRootCauseAnalysisConfigureOutputModelCaseRootCauseAnalysisServiceConfigurationRecord
 */
public class SDCaseRootCauseAnalysisConfigureOutputModelCaseRootCauseAnalysisServiceConfigurationRecord   {
  private String caseRootCauseAnalysisServiceConfigurationSettingDescription = null;

  private SDCaseRootCauseAnalysisConfigureInputModelCaseRootCauseAnalysisServiceConfigurationRecordCaseRootCauseAnalysisServiceConfigurationSetup caseRootCauseAnalysisServiceConfigurationSetup = null;

  private SDCaseRootCauseAnalysisConfigureInputModelCaseRootCauseAnalysisServiceConfigurationRecordCaseRootCauseAnalysisServiceSubscription caseRootCauseAnalysisServiceSubscription = null;

  private SDCaseRootCauseAnalysisConfigureInputModelCaseRootCauseAnalysisServiceConfigurationRecordCaseRootCauseAnalysisServiceAgreement caseRootCauseAnalysisServiceAgreement = null;

  private String caseRootCauseAnalysisServiceStatus = null;


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

  public SDCaseRootCauseAnalysisConfigureInputModelCaseRootCauseAnalysisServiceConfigurationRecordCaseRootCauseAnalysisServiceConfigurationSetup getCaseRootCauseAnalysisServiceConfigurationSetup() {
    return caseRootCauseAnalysisServiceConfigurationSetup;
  }

  public void setCaseRootCauseAnalysisServiceConfigurationSetup(SDCaseRootCauseAnalysisConfigureInputModelCaseRootCauseAnalysisServiceConfigurationRecordCaseRootCauseAnalysisServiceConfigurationSetup caseRootCauseAnalysisServiceConfigurationSetup) {
    this.caseRootCauseAnalysisServiceConfigurationSetup = caseRootCauseAnalysisServiceConfigurationSetup;
  }


  /**
   * Get caseRootCauseAnalysisServiceSubscription
   * @return caseRootCauseAnalysisServiceSubscription
  **/

  public SDCaseRootCauseAnalysisConfigureInputModelCaseRootCauseAnalysisServiceConfigurationRecordCaseRootCauseAnalysisServiceSubscription getCaseRootCauseAnalysisServiceSubscription() {
    return caseRootCauseAnalysisServiceSubscription;
  }

  public void setCaseRootCauseAnalysisServiceSubscription(SDCaseRootCauseAnalysisConfigureInputModelCaseRootCauseAnalysisServiceConfigurationRecordCaseRootCauseAnalysisServiceSubscription caseRootCauseAnalysisServiceSubscription) {
    this.caseRootCauseAnalysisServiceSubscription = caseRootCauseAnalysisServiceSubscription;
  }


  /**
   * Get caseRootCauseAnalysisServiceAgreement
   * @return caseRootCauseAnalysisServiceAgreement
  **/

  public SDCaseRootCauseAnalysisConfigureInputModelCaseRootCauseAnalysisServiceConfigurationRecordCaseRootCauseAnalysisServiceAgreement getCaseRootCauseAnalysisServiceAgreement() {
    return caseRootCauseAnalysisServiceAgreement;
  }

  public void setCaseRootCauseAnalysisServiceAgreement(SDCaseRootCauseAnalysisConfigureInputModelCaseRootCauseAnalysisServiceConfigurationRecordCaseRootCauseAnalysisServiceAgreement caseRootCauseAnalysisServiceAgreement) {
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

