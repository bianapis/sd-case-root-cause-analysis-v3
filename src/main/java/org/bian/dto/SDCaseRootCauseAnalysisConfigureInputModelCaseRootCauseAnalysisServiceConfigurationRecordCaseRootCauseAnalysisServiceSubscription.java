package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCaseRootCauseAnalysisConfigureInputModelCaseRootCauseAnalysisServiceConfigurationRecordCaseRootCauseAnalysisServiceSubscription
 */
public class SDCaseRootCauseAnalysisConfigureInputModelCaseRootCauseAnalysisServiceConfigurationRecordCaseRootCauseAnalysisServiceSubscription   {
  private String caseRootCauseAnalysisServiceSubscriberReference = null;

  private String caseRootCauseAnalysisServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return caseRootCauseAnalysisServiceSubscriberReference
  **/

  public String getCaseRootCauseAnalysisServiceSubscriberReference() {
    return caseRootCauseAnalysisServiceSubscriberReference;
  }

  public void setCaseRootCauseAnalysisServiceSubscriberReference(String caseRootCauseAnalysisServiceSubscriberReference) {
    this.caseRootCauseAnalysisServiceSubscriberReference = caseRootCauseAnalysisServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return caseRootCauseAnalysisServiceSubscriberAccessProfile
  **/

  public String getCaseRootCauseAnalysisServiceSubscriberAccessProfile() {
    return caseRootCauseAnalysisServiceSubscriberAccessProfile;
  }

  public void setCaseRootCauseAnalysisServiceSubscriberAccessProfile(String caseRootCauseAnalysisServiceSubscriberAccessProfile) {
    this.caseRootCauseAnalysisServiceSubscriberAccessProfile = caseRootCauseAnalysisServiceSubscriberAccessProfile;
  }


}

