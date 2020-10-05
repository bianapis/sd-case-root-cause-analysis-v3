package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCaseRootCauseAnalysisRetrieveOutputModelCaseRootCauseAnalysisOfferedServiceCaseRootCauseAnalysisServiceRecordCaseRootCauseAnalysisServicePoliciesandGuidelines
 */
public class SDCaseRootCauseAnalysisRetrieveOutputModelCaseRootCauseAnalysisOfferedServiceCaseRootCauseAnalysisServiceRecordCaseRootCauseAnalysisServicePoliciesandGuidelines   {
  private String caseRootCauseAnalysisServiceEligibility = null;

  private String caseRootCauseAnalysisServiceIntendedUses = null;

  private String caseRootCauseAnalysisServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return caseRootCauseAnalysisServiceEligibility
  **/

  public String getCaseRootCauseAnalysisServiceEligibility() {
    return caseRootCauseAnalysisServiceEligibility;
  }

  public void setCaseRootCauseAnalysisServiceEligibility(String caseRootCauseAnalysisServiceEligibility) {
    this.caseRootCauseAnalysisServiceEligibility = caseRootCauseAnalysisServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return caseRootCauseAnalysisServiceIntendedUses
  **/

  public String getCaseRootCauseAnalysisServiceIntendedUses() {
    return caseRootCauseAnalysisServiceIntendedUses;
  }

  public void setCaseRootCauseAnalysisServiceIntendedUses(String caseRootCauseAnalysisServiceIntendedUses) {
    this.caseRootCauseAnalysisServiceIntendedUses = caseRootCauseAnalysisServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return caseRootCauseAnalysisServicePricingandTerms
  **/

  public String getCaseRootCauseAnalysisServicePricingandTerms() {
    return caseRootCauseAnalysisServicePricingandTerms;
  }

  public void setCaseRootCauseAnalysisServicePricingandTerms(String caseRootCauseAnalysisServicePricingandTerms) {
    this.caseRootCauseAnalysisServicePricingandTerms = caseRootCauseAnalysisServicePricingandTerms;
  }


}

