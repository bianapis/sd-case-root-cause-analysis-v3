package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCaseRootCauseAnalysisRetrieveOutputModelCaseRootCauseAnalysisOfferedServiceCaseRootCauseAnalysisServiceRecordCaseRootCauseAnalysisServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDCaseRootCauseAnalysisRetrieveOutputModelCaseRootCauseAnalysisOfferedServiceCaseRootCauseAnalysisServiceRecord
 */
public class SDCaseRootCauseAnalysisRetrieveOutputModelCaseRootCauseAnalysisOfferedServiceCaseRootCauseAnalysisServiceRecord   {
  private String caseRootCauseAnalysisServiceType = null;

  private String caseRootCauseAnalysisServiceVersion = null;

  private String caseRootCauseAnalysisServiceDescription = null;

  private SDCaseRootCauseAnalysisRetrieveOutputModelCaseRootCauseAnalysisOfferedServiceCaseRootCauseAnalysisServiceRecordCaseRootCauseAnalysisServicePoliciesandGuidelines caseRootCauseAnalysisServicePoliciesandGuidelines = null;

  private String caseRootCauseAnalysisServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return caseRootCauseAnalysisServiceType
  **/

  public String getCaseRootCauseAnalysisServiceType() {
    return caseRootCauseAnalysisServiceType;
  }

  public void setCaseRootCauseAnalysisServiceType(String caseRootCauseAnalysisServiceType) {
    this.caseRootCauseAnalysisServiceType = caseRootCauseAnalysisServiceType;
  }


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return caseRootCauseAnalysisServiceDescription
  **/

  public String getCaseRootCauseAnalysisServiceDescription() {
    return caseRootCauseAnalysisServiceDescription;
  }

  public void setCaseRootCauseAnalysisServiceDescription(String caseRootCauseAnalysisServiceDescription) {
    this.caseRootCauseAnalysisServiceDescription = caseRootCauseAnalysisServiceDescription;
  }


  /**
   * Get caseRootCauseAnalysisServicePoliciesandGuidelines
   * @return caseRootCauseAnalysisServicePoliciesandGuidelines
  **/

  public SDCaseRootCauseAnalysisRetrieveOutputModelCaseRootCauseAnalysisOfferedServiceCaseRootCauseAnalysisServiceRecordCaseRootCauseAnalysisServicePoliciesandGuidelines getCaseRootCauseAnalysisServicePoliciesandGuidelines() {
    return caseRootCauseAnalysisServicePoliciesandGuidelines;
  }

  public void setCaseRootCauseAnalysisServicePoliciesandGuidelines(SDCaseRootCauseAnalysisRetrieveOutputModelCaseRootCauseAnalysisOfferedServiceCaseRootCauseAnalysisServiceRecordCaseRootCauseAnalysisServicePoliciesandGuidelines caseRootCauseAnalysisServicePoliciesandGuidelines) {
    this.caseRootCauseAnalysisServicePoliciesandGuidelines = caseRootCauseAnalysisServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return caseRootCauseAnalysisServiceSchedule
  **/

  public String getCaseRootCauseAnalysisServiceSchedule() {
    return caseRootCauseAnalysisServiceSchedule;
  }

  public void setCaseRootCauseAnalysisServiceSchedule(String caseRootCauseAnalysisServiceSchedule) {
    this.caseRootCauseAnalysisServiceSchedule = caseRootCauseAnalysisServiceSchedule;
  }


}

