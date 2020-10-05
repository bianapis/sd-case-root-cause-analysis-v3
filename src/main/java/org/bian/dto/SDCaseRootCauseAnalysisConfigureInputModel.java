package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCaseRootCauseAnalysisConfigureInputModelCaseRootCauseAnalysisServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCaseRootCauseAnalysisConfigureInputModel
 */
public class SDCaseRootCauseAnalysisConfigureInputModel   {
  private Object caseRootCauseAnalysisConfigurationActionTaskRecord = null;

  private String caseRootCauseAnalysisServicingSessionReference = null;

  private String caseRootCauseAnalysisServiceReference = null;

  private SDCaseRootCauseAnalysisConfigureInputModelCaseRootCauseAnalysisServiceConfigurationRecord caseRootCauseAnalysisServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return caseRootCauseAnalysisServiceReference
  **/

  public String getCaseRootCauseAnalysisServiceReference() {
    return caseRootCauseAnalysisServiceReference;
  }

  public void setCaseRootCauseAnalysisServiceReference(String caseRootCauseAnalysisServiceReference) {
    this.caseRootCauseAnalysisServiceReference = caseRootCauseAnalysisServiceReference;
  }


  /**
   * Get caseRootCauseAnalysisServiceConfigurationRecord
   * @return caseRootCauseAnalysisServiceConfigurationRecord
  **/

  public SDCaseRootCauseAnalysisConfigureInputModelCaseRootCauseAnalysisServiceConfigurationRecord getCaseRootCauseAnalysisServiceConfigurationRecord() {
    return caseRootCauseAnalysisServiceConfigurationRecord;
  }

  public void setCaseRootCauseAnalysisServiceConfigurationRecord(SDCaseRootCauseAnalysisConfigureInputModelCaseRootCauseAnalysisServiceConfigurationRecord caseRootCauseAnalysisServiceConfigurationRecord) {
    this.caseRootCauseAnalysisServiceConfigurationRecord = caseRootCauseAnalysisServiceConfigurationRecord;
  }


}

