package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCaseRootCauseAnalysisRetrieveOutputModelCaseRootCauseAnalysisRetrieveActionRecordCaseRootCauseAnalysisActivityAnalysis;
import org.bian.dto.SDCaseRootCauseAnalysisRetrieveOutputModelCaseRootCauseAnalysisRetrieveActionRecordCaseRootCauseAnalysisPerformanceAnalysis;
import org.bian.dto.SDCaseRootCauseAnalysisRetrieveOutputModelCaseRootCauseAnalysisRetrieveActionRecordControlRecordPortfolioAnalysis;

import javax.validation.Valid;
  
/**
 * SDCaseRootCauseAnalysisRetrieveOutputModelCaseRootCauseAnalysisRetrieveActionRecord
 */
public class SDCaseRootCauseAnalysisRetrieveOutputModelCaseRootCauseAnalysisRetrieveActionRecord   {
  private SDCaseRootCauseAnalysisRetrieveOutputModelCaseRootCauseAnalysisRetrieveActionRecordCaseRootCauseAnalysisActivityAnalysis caseRootCauseAnalysisActivityAnalysis = null;

  private SDCaseRootCauseAnalysisRetrieveOutputModelCaseRootCauseAnalysisRetrieveActionRecordCaseRootCauseAnalysisPerformanceAnalysis caseRootCauseAnalysisPerformanceAnalysis = null;

  private SDCaseRootCauseAnalysisRetrieveOutputModelCaseRootCauseAnalysisRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get caseRootCauseAnalysisActivityAnalysis
   * @return caseRootCauseAnalysisActivityAnalysis
  **/

  public SDCaseRootCauseAnalysisRetrieveOutputModelCaseRootCauseAnalysisRetrieveActionRecordCaseRootCauseAnalysisActivityAnalysis getCaseRootCauseAnalysisActivityAnalysis() {
    return caseRootCauseAnalysisActivityAnalysis;
  }

  public void setCaseRootCauseAnalysisActivityAnalysis(SDCaseRootCauseAnalysisRetrieveOutputModelCaseRootCauseAnalysisRetrieveActionRecordCaseRootCauseAnalysisActivityAnalysis caseRootCauseAnalysisActivityAnalysis) {
    this.caseRootCauseAnalysisActivityAnalysis = caseRootCauseAnalysisActivityAnalysis;
  }


  /**
   * Get caseRootCauseAnalysisPerformanceAnalysis
   * @return caseRootCauseAnalysisPerformanceAnalysis
  **/

  public SDCaseRootCauseAnalysisRetrieveOutputModelCaseRootCauseAnalysisRetrieveActionRecordCaseRootCauseAnalysisPerformanceAnalysis getCaseRootCauseAnalysisPerformanceAnalysis() {
    return caseRootCauseAnalysisPerformanceAnalysis;
  }

  public void setCaseRootCauseAnalysisPerformanceAnalysis(SDCaseRootCauseAnalysisRetrieveOutputModelCaseRootCauseAnalysisRetrieveActionRecordCaseRootCauseAnalysisPerformanceAnalysis caseRootCauseAnalysisPerformanceAnalysis) {
    this.caseRootCauseAnalysisPerformanceAnalysis = caseRootCauseAnalysisPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDCaseRootCauseAnalysisRetrieveOutputModelCaseRootCauseAnalysisRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDCaseRootCauseAnalysisRetrieveOutputModelCaseRootCauseAnalysisRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

