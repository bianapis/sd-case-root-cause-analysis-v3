package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCaseRootCauseAnalysisActivateInputModelCaseRootCauseAnalysisServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCaseRootCauseAnalysisActivateInputModel
 */
public class SDCaseRootCauseAnalysisActivateInputModel   {
  private Object caseRootCauseAnalysisActivationActionTaskRecord = null;

  private String caseRootCauseAnalysisCenterReference = null;

  private String caseRootCauseAnalysisServiceReference = null;

  private SDCaseRootCauseAnalysisActivateInputModelCaseRootCauseAnalysisServiceConfigurationRecord caseRootCauseAnalysisServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return caseRootCauseAnalysisCenterReference
  **/

  public String getCaseRootCauseAnalysisCenterReference() {
    return caseRootCauseAnalysisCenterReference;
  }

  public void setCaseRootCauseAnalysisCenterReference(String caseRootCauseAnalysisCenterReference) {
    this.caseRootCauseAnalysisCenterReference = caseRootCauseAnalysisCenterReference;
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

  public SDCaseRootCauseAnalysisActivateInputModelCaseRootCauseAnalysisServiceConfigurationRecord getCaseRootCauseAnalysisServiceConfigurationRecord() {
    return caseRootCauseAnalysisServiceConfigurationRecord;
  }

  public void setCaseRootCauseAnalysisServiceConfigurationRecord(SDCaseRootCauseAnalysisActivateInputModelCaseRootCauseAnalysisServiceConfigurationRecord caseRootCauseAnalysisServiceConfigurationRecord) {
    this.caseRootCauseAnalysisServiceConfigurationRecord = caseRootCauseAnalysisServiceConfigurationRecord;
  }


}

