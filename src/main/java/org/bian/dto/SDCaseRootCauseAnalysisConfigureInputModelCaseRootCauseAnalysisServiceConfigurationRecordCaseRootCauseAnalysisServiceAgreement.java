package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCaseRootCauseAnalysisConfigureInputModelCaseRootCauseAnalysisServiceConfigurationRecordCaseRootCauseAnalysisServiceAgreement
 */
public class SDCaseRootCauseAnalysisConfigureInputModelCaseRootCauseAnalysisServiceConfigurationRecordCaseRootCauseAnalysisServiceAgreement   {
  private String caseRootCauseAnalysisServiceAgreementReference = null;

  private String caseRootCauseAnalysisServiceUserReference = null;

  private String caseRootCauseAnalysisServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return caseRootCauseAnalysisServiceAgreementReference
  **/

  public String getCaseRootCauseAnalysisServiceAgreementReference() {
    return caseRootCauseAnalysisServiceAgreementReference;
  }

  public void setCaseRootCauseAnalysisServiceAgreementReference(String caseRootCauseAnalysisServiceAgreementReference) {
    this.caseRootCauseAnalysisServiceAgreementReference = caseRootCauseAnalysisServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return caseRootCauseAnalysisServiceUserReference
  **/

  public String getCaseRootCauseAnalysisServiceUserReference() {
    return caseRootCauseAnalysisServiceUserReference;
  }

  public void setCaseRootCauseAnalysisServiceUserReference(String caseRootCauseAnalysisServiceUserReference) {
    this.caseRootCauseAnalysisServiceUserReference = caseRootCauseAnalysisServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return caseRootCauseAnalysisServiceAgreementTermsandConditions
  **/

  public String getCaseRootCauseAnalysisServiceAgreementTermsandConditions() {
    return caseRootCauseAnalysisServiceAgreementTermsandConditions;
  }

  public void setCaseRootCauseAnalysisServiceAgreementTermsandConditions(String caseRootCauseAnalysisServiceAgreementTermsandConditions) {
    this.caseRootCauseAnalysisServiceAgreementTermsandConditions = caseRootCauseAnalysisServiceAgreementTermsandConditions;
  }


}

