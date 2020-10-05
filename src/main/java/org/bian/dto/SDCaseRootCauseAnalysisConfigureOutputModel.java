package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCaseRootCauseAnalysisConfigureOutputModelCaseRootCauseAnalysisServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCaseRootCauseAnalysisConfigureOutputModel
 */
public class SDCaseRootCauseAnalysisConfigureOutputModel   {
  private String caseRootCauseAnalysisConfigurationActionTaskReference = null;

  private Object caseRootCauseAnalysisConfigurationActionTaskRecord = null;

  private SDCaseRootCauseAnalysisConfigureOutputModelCaseRootCauseAnalysisServiceConfigurationRecord caseRootCauseAnalysisServiceConfigurationRecord = null;

  private String caseRootCauseAnalysisServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return caseRootCauseAnalysisConfigurationActionTaskReference
  **/

  public String getCaseRootCauseAnalysisConfigurationActionTaskReference() {
    return caseRootCauseAnalysisConfigurationActionTaskReference;
  }

  public void setCaseRootCauseAnalysisConfigurationActionTaskReference(String caseRootCauseAnalysisConfigurationActionTaskReference) {
    this.caseRootCauseAnalysisConfigurationActionTaskReference = caseRootCauseAnalysisConfigurationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return caseRootCauseAnalysisConfigurationActionTaskRecord
  **/

  public Object getCaseRootCauseAnalysisConfigurationActionTaskRecord() {
    return caseRootCauseAnalysisConfigurationActionTaskRecord;
  }

  public void setCaseRootCauseAnalysisConfigurationActionTaskRecord(Object caseRootCauseAnalysisConfigurationActionTaskRecord) {
    this.caseRootCauseAnalysisConfigurationActionTaskRecord = caseRootCauseAnalysisConfigurationActionTaskRecord;
  }


  /**
   * Get caseRootCauseAnalysisServiceConfigurationRecord
   * @return caseRootCauseAnalysisServiceConfigurationRecord
  **/

  public SDCaseRootCauseAnalysisConfigureOutputModelCaseRootCauseAnalysisServiceConfigurationRecord getCaseRootCauseAnalysisServiceConfigurationRecord() {
    return caseRootCauseAnalysisServiceConfigurationRecord;
  }

  public void setCaseRootCauseAnalysisServiceConfigurationRecord(SDCaseRootCauseAnalysisConfigureOutputModelCaseRootCauseAnalysisServiceConfigurationRecord caseRootCauseAnalysisServiceConfigurationRecord) {
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

