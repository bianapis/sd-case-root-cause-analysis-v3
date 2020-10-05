package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCaseRootCauseAnalysisRetrieveInputModelCaseRootCauseAnalysisRetrieveActionRecordCaseRootCauseAnalysisActivityAnalysis;
import org.bian.dto.SDCaseRootCauseAnalysisRetrieveInputModelCaseRootCauseAnalysisRetrieveActionRecordCaseRootCauseAnalysisPerformanceAnalysis;
import org.bian.dto.SDCaseRootCauseAnalysisRetrieveInputModelCaseRootCauseAnalysisRetrieveActionRecordControlRecordPortfolioAnalysis;

import javax.validation.Valid;
  
/**
 * SDCaseRootCauseAnalysisRetrieveInputModelCaseRootCauseAnalysisRetrieveActionRecord
 */
public class SDCaseRootCauseAnalysisRetrieveInputModelCaseRootCauseAnalysisRetrieveActionRecord   {
  private SDCaseRootCauseAnalysisRetrieveInputModelCaseRootCauseAnalysisRetrieveActionRecordCaseRootCauseAnalysisActivityAnalysis caseRootCauseAnalysisActivityAnalysis = null;

  private SDCaseRootCauseAnalysisRetrieveInputModelCaseRootCauseAnalysisRetrieveActionRecordCaseRootCauseAnalysisPerformanceAnalysis caseRootCauseAnalysisPerformanceAnalysis = null;

  private SDCaseRootCauseAnalysisRetrieveInputModelCaseRootCauseAnalysisRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get caseRootCauseAnalysisActivityAnalysis
   * @return caseRootCauseAnalysisActivityAnalysis
  **/

  public SDCaseRootCauseAnalysisRetrieveInputModelCaseRootCauseAnalysisRetrieveActionRecordCaseRootCauseAnalysisActivityAnalysis getCaseRootCauseAnalysisActivityAnalysis() {
    return caseRootCauseAnalysisActivityAnalysis;
  }

  public void setCaseRootCauseAnalysisActivityAnalysis(SDCaseRootCauseAnalysisRetrieveInputModelCaseRootCauseAnalysisRetrieveActionRecordCaseRootCauseAnalysisActivityAnalysis caseRootCauseAnalysisActivityAnalysis) {
    this.caseRootCauseAnalysisActivityAnalysis = caseRootCauseAnalysisActivityAnalysis;
  }


  /**
   * Get caseRootCauseAnalysisPerformanceAnalysis
   * @return caseRootCauseAnalysisPerformanceAnalysis
  **/

  public SDCaseRootCauseAnalysisRetrieveInputModelCaseRootCauseAnalysisRetrieveActionRecordCaseRootCauseAnalysisPerformanceAnalysis getCaseRootCauseAnalysisPerformanceAnalysis() {
    return caseRootCauseAnalysisPerformanceAnalysis;
  }

  public void setCaseRootCauseAnalysisPerformanceAnalysis(SDCaseRootCauseAnalysisRetrieveInputModelCaseRootCauseAnalysisRetrieveActionRecordCaseRootCauseAnalysisPerformanceAnalysis caseRootCauseAnalysisPerformanceAnalysis) {
    this.caseRootCauseAnalysisPerformanceAnalysis = caseRootCauseAnalysisPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDCaseRootCauseAnalysisRetrieveInputModelCaseRootCauseAnalysisRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDCaseRootCauseAnalysisRetrieveInputModelCaseRootCauseAnalysisRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

