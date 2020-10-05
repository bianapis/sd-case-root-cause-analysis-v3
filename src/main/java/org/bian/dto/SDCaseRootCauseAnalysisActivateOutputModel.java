package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCaseRootCauseAnalysisActivateOutputModelCaseRootCauseAnalysisServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCaseRootCauseAnalysisActivateOutputModel
 */
public class SDCaseRootCauseAnalysisActivateOutputModel   {
  private String caseRootCauseAnalysisActivationActionTaskReference = null;

  private Object caseRootCauseAnalysisActivationActionTaskRecord = null;

  private String caseRootCauseAnalysisServicingSessionReference = null;

  private Object caseRootCauseAnalysisServicingSessionRecord = null;

  private SDCaseRootCauseAnalysisActivateOutputModelCaseRootCauseAnalysisServiceConfigurationRecord caseRootCauseAnalysisServiceConfigurationRecord = null;

  private String caseRootCauseAnalysisServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return caseRootCauseAnalysisActivationActionTaskReference
  **/

  public String getCaseRootCauseAnalysisActivationActionTaskReference() {
    return caseRootCauseAnalysisActivationActionTaskReference;
  }

  public void setCaseRootCauseAnalysisActivationActionTaskReference(String caseRootCauseAnalysisActivationActionTaskReference) {
    this.caseRootCauseAnalysisActivationActionTaskReference = caseRootCauseAnalysisActivationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return caseRootCauseAnalysisActivationActionTaskRecord
  **/

  public Object getCaseRootCauseAnalysisActivationActionTaskRecord() {
    return caseRootCauseAnalysisActivationActionTaskRecord;
  }

  public void setCaseRootCauseAnalysisActivationActionTaskRecord(Object caseRootCauseAnalysisActivationActionTaskRecord) {
    this.caseRootCauseAnalysisActivationActionTaskRecord = caseRootCauseAnalysisActivationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return caseRootCauseAnalysisServicingSessionReference
  **/

  public String getCaseRootCauseAnalysisServicingSessionReference() {
    return caseRootCauseAnalysisServicingSessionReference;
  }

  public void setCaseRootCauseAnalysisServicingSessionReference(String caseRootCauseAnalysisServicingSessionReference) {
    this.caseRootCauseAnalysisServicingSessionReference = caseRootCauseAnalysisServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return caseRootCauseAnalysisServicingSessionRecord
  **/

  public Object getCaseRootCauseAnalysisServicingSessionRecord() {
    return caseRootCauseAnalysisServicingSessionRecord;
  }

  public void setCaseRootCauseAnalysisServicingSessionRecord(Object caseRootCauseAnalysisServicingSessionRecord) {
    this.caseRootCauseAnalysisServicingSessionRecord = caseRootCauseAnalysisServicingSessionRecord;
  }


  /**
   * Get caseRootCauseAnalysisServiceConfigurationRecord
   * @return caseRootCauseAnalysisServiceConfigurationRecord
  **/

  public SDCaseRootCauseAnalysisActivateOutputModelCaseRootCauseAnalysisServiceConfigurationRecord getCaseRootCauseAnalysisServiceConfigurationRecord() {
    return caseRootCauseAnalysisServiceConfigurationRecord;
  }

  public void setCaseRootCauseAnalysisServiceConfigurationRecord(SDCaseRootCauseAnalysisActivateOutputModelCaseRootCauseAnalysisServiceConfigurationRecord caseRootCauseAnalysisServiceConfigurationRecord) {
    this.caseRootCauseAnalysisServiceConfigurationRecord = caseRootCauseAnalysisServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return caseRootCauseAnalysisServicingSessionStatus
  **/

  public String getCaseRootCauseAnalysisServicingSessionStatus() {
    return caseRootCauseAnalysisServicingSessionStatus;
  }

  public void setCaseRootCauseAnalysisServicingSessionStatus(String caseRootCauseAnalysisServicingSessionStatus) {
    this.caseRootCauseAnalysisServicingSessionStatus = caseRootCauseAnalysisServicingSessionStatus;
  }


}

