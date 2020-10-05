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
 * SDCaseRootCauseAnalysisConfigureInputModelCaseRootCauseAnalysisServiceConfigurationRecord
 */
public class SDCaseRootCauseAnalysisConfigureInputModelCaseRootCauseAnalysisServiceConfigurationRecord   {
  private String caseRootCauseAnalysisServiceConfigurationSettingReference = null;

  private String caseRootCauseAnalysisServiceConfigurationSettingType = null;

  private SDCaseRootCauseAnalysisConfigureInputModelCaseRootCauseAnalysisServiceConfigurationRecordCaseRootCauseAnalysisServiceConfigurationSetup caseRootCauseAnalysisServiceConfigurationSetup = null;

  private SDCaseRootCauseAnalysisConfigureInputModelCaseRootCauseAnalysisServiceConfigurationRecordCaseRootCauseAnalysisServiceSubscription caseRootCauseAnalysisServiceSubscription = null;

  private SDCaseRootCauseAnalysisConfigureInputModelCaseRootCauseAnalysisServiceConfigurationRecordCaseRootCauseAnalysisServiceAgreement caseRootCauseAnalysisServiceAgreement = null;


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


}

