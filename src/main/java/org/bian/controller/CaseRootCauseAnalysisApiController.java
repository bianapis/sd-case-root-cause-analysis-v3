/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Analyse;

@BianRestController
public class CaseRootCauseAnalysisApiController {

	@Autowired
	CaseRootCauseAnalysisApiService service;
	
	@Analyse.Activate
	public BianResponse<SDCaseRootCauseAnalysisActivateOutputModel> activate(@RequestBody BianRequest<SDCaseRootCauseAnalysisActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Analyse.Configure
	public BianResponse<SDCaseRootCauseAnalysisConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCaseRootCauseAnalysisConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("creditandfraudrelatedissueanalysis")
	@Analyse.Execute
	public BianResponse<BQCreditandFraudRelatedIssueAnalysisExecuteOutputModel> executeCreditandfraudrelatedissueanalysis(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCreditandFraudRelatedIssueAnalysisExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeCreditandfraudrelatedissueanalysis(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("operationsandservicingissueanalysis")
	@Analyse.Execute
	public BianResponse<BQOperationsandServicingIssueAnalysisExecuteOutputModel> executeOperationsandservicingissueanalysis(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQOperationsandServicingIssueAnalysisExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeOperationsandservicingissueanalysis(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Analyse.Execute
	public BianResponse<CRCustomerCaseRootCauseAnalysisExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerCaseRootCauseAnalysisExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Analyse.Feedback
	public BianResponse<SDCaseRootCauseAnalysisFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCaseRootCauseAnalysisFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Analyse.Initiate
	public BianResponse<CRCustomerCaseRootCauseAnalysisInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCustomerCaseRootCauseAnalysisInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("creditandfraudrelatedissueanalysis")
	@Analyse.Initiate
	public BianResponse<BQCreditandFraudRelatedIssueAnalysisInitiateOutputModel> initiateCreditandfraudrelatedissueanalysis(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQCreditandFraudRelatedIssueAnalysisInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateCreditandfraudrelatedissueanalysis(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("operationsandservicingissueanalysis")
	@Analyse.Initiate
	public BianResponse<BQOperationsandServicingIssueAnalysisInitiateOutputModel> initiateOperationsandservicingissueanalysis(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQOperationsandServicingIssueAnalysisInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateOperationsandservicingissueanalysis(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("creditandfraudrelatedissueanalysis")
	@Analyse.Request
	public BianResponse<BQCreditandFraudRelatedIssueAnalysisRequestOutputModel> requestCreditandfraudrelatedissueanalysis(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCreditandFraudRelatedIssueAnalysisRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestCreditandfraudrelatedissueanalysis(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("operationsandservicingissueanalysis")
	@Analyse.Request
	public BianResponse<BQOperationsandServicingIssueAnalysisRequestOutputModel> requestOperationsandservicingissueanalysis(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQOperationsandServicingIssueAnalysisRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestOperationsandservicingissueanalysis(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Analyse.Request
	public BianResponse<CRCustomerCaseRootCauseAnalysisRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerCaseRootCauseAnalysisRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Analyse.Retrieve
	public BianResponse<CRCustomerCaseRootCauseAnalysisRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Analyse.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Analyse.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Analyse.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("creditandfraudrelatedissueanalysis")
	@Analyse.Retrieve
	public BianResponse<BQCreditandFraudRelatedIssueAnalysisRetrieveOutputModel> retrieveCreditandfraudrelatedissueanalysis(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCreditandfraudrelatedissueanalysis(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("operationsandservicingissueanalysis")
	@Analyse.Retrieve
	public BianResponse<BQOperationsandServicingIssueAnalysisRetrieveOutputModel> retrieveOperationsandservicingissueanalysis(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveOperationsandservicingissueanalysis(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Analyse.RetrieveSD
	public BianResponse<SDCaseRootCauseAnalysisRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Analyse.Update
	public BianResponse<CRCustomerCaseRootCauseAnalysisUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerCaseRootCauseAnalysisUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("creditandfraudrelatedissueanalysis")
	@Analyse.Update
	public BianResponse<BQCreditandFraudRelatedIssueAnalysisUpdateOutputModel> updateCreditandfraudrelatedissueanalysis(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCreditandFraudRelatedIssueAnalysisUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateCreditandfraudrelatedissueanalysis(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("operationsandservicingissueanalysis")
	@Analyse.Update
	public BianResponse<BQOperationsandServicingIssueAnalysisUpdateOutputModel> updateOperationsandservicingissueanalysis(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQOperationsandServicingIssueAnalysisUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateOperationsandservicingissueanalysis(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
