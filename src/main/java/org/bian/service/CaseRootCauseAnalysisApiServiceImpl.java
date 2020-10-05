/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CaseRootCauseAnalysisApiServiceImpl implements CaseRootCauseAnalysisApiService {

	public SDCaseRootCauseAnalysisActivateOutputModel activate(SDCaseRootCauseAnalysisActivateInputModel request){
		return JsonReader.read("activate-SDCaseRootCauseAnalysisActivateOutputModel.json",new TypeReference<SDCaseRootCauseAnalysisActivateOutputModel>(){});
	}
	
	public SDCaseRootCauseAnalysisConfigureOutputModel configure(String sdReferenceId, SDCaseRootCauseAnalysisConfigureInputModel request){
		return JsonReader.read("configure-SDCaseRootCauseAnalysisConfigureOutputModel.json",new TypeReference<SDCaseRootCauseAnalysisConfigureOutputModel>(){});
	}
	
	public BQCreditandFraudRelatedIssueAnalysisExecuteOutputModel executeCreditandfraudrelatedissueanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCreditandFraudRelatedIssueAnalysisExecuteInputModel request){
		return JsonReader.read("execute-BQCreditandFraudRelatedIssueAnalysisExecuteOutputModel.json",new TypeReference<BQCreditandFraudRelatedIssueAnalysisExecuteOutputModel>(){});
	}
	
	public BQOperationsandServicingIssueAnalysisExecuteOutputModel executeOperationsandservicingissueanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOperationsandServicingIssueAnalysisExecuteInputModel request){
		return JsonReader.read("execute-BQOperationsandServicingIssueAnalysisExecuteOutputModel.json",new TypeReference<BQOperationsandServicingIssueAnalysisExecuteOutputModel>(){});
	}
	
	public CRCustomerCaseRootCauseAnalysisExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCustomerCaseRootCauseAnalysisExecuteInputModel request){
		return JsonReader.read("execute-CRCustomerCaseRootCauseAnalysisExecuteOutputModel.json",new TypeReference<CRCustomerCaseRootCauseAnalysisExecuteOutputModel>(){});
	}
	
	public SDCaseRootCauseAnalysisFeedbackOutputModel feedback(String sdReferenceId, SDCaseRootCauseAnalysisFeedbackInputModel request){
		return JsonReader.read("feedback-SDCaseRootCauseAnalysisFeedbackOutputModel.json",new TypeReference<SDCaseRootCauseAnalysisFeedbackOutputModel>(){});
	}
	
	public CRCustomerCaseRootCauseAnalysisInitiateOutputModel initiate(String sdReferenceId, CRCustomerCaseRootCauseAnalysisInitiateInputModel request){
		return JsonReader.read("initiate-CRCustomerCaseRootCauseAnalysisInitiateOutputModel.json",new TypeReference<CRCustomerCaseRootCauseAnalysisInitiateOutputModel>(){});
	}
	
	public BQCreditandFraudRelatedIssueAnalysisInitiateOutputModel initiateCreditandfraudrelatedissueanalysis(String sdReferenceId, String crReferenceId, BQCreditandFraudRelatedIssueAnalysisInitiateInputModel request){
		return JsonReader.read("initiate-BQCreditandFraudRelatedIssueAnalysisInitiateOutputModel.json",new TypeReference<BQCreditandFraudRelatedIssueAnalysisInitiateOutputModel>(){});
	}
	
	public BQOperationsandServicingIssueAnalysisInitiateOutputModel initiateOperationsandservicingissueanalysis(String sdReferenceId, String crReferenceId, BQOperationsandServicingIssueAnalysisInitiateInputModel request){
		return JsonReader.read("initiate-BQOperationsandServicingIssueAnalysisInitiateOutputModel.json",new TypeReference<BQOperationsandServicingIssueAnalysisInitiateOutputModel>(){});
	}
	
	public BQCreditandFraudRelatedIssueAnalysisRequestOutputModel requestCreditandfraudrelatedissueanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCreditandFraudRelatedIssueAnalysisRequestInputModel request){
		return JsonReader.read("request-BQCreditandFraudRelatedIssueAnalysisRequestOutputModel.json",new TypeReference<BQCreditandFraudRelatedIssueAnalysisRequestOutputModel>(){});
	}
	
	public BQOperationsandServicingIssueAnalysisRequestOutputModel requestOperationsandservicingissueanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOperationsandServicingIssueAnalysisRequestInputModel request){
		return JsonReader.read("request-BQOperationsandServicingIssueAnalysisRequestOutputModel.json",new TypeReference<BQOperationsandServicingIssueAnalysisRequestOutputModel>(){});
	}
	
	public CRCustomerCaseRootCauseAnalysisRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerCaseRootCauseAnalysisRequestInputModel request){
		return JsonReader.read("request-CRCustomerCaseRootCauseAnalysisRequestOutputModel.json",new TypeReference<CRCustomerCaseRootCauseAnalysisRequestOutputModel>(){});
	}
	
	public CRCustomerCaseRootCauseAnalysisRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCustomerCaseRootCauseAnalysisRetrieveOutputModel.json",new TypeReference<CRCustomerCaseRootCauseAnalysisRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQCreditandFraudRelatedIssueAnalysisRetrieveOutputModel retrieveCreditandfraudrelatedissueanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCreditandFraudRelatedIssueAnalysisRetrieveOutputModel.json",new TypeReference<BQCreditandFraudRelatedIssueAnalysisRetrieveOutputModel>(){});
	}
	
	public BQOperationsandServicingIssueAnalysisRetrieveOutputModel retrieveOperationsandservicingissueanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQOperationsandServicingIssueAnalysisRetrieveOutputModel.json",new TypeReference<BQOperationsandServicingIssueAnalysisRetrieveOutputModel>(){});
	}
	
	public SDCaseRootCauseAnalysisRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCaseRootCauseAnalysisRetrieveOutputModel.json",new TypeReference<SDCaseRootCauseAnalysisRetrieveOutputModel>(){});
	}
	
	public CRCustomerCaseRootCauseAnalysisUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerCaseRootCauseAnalysisUpdateInputModel request){
		return JsonReader.read("update-CRCustomerCaseRootCauseAnalysisUpdateOutputModel.json",new TypeReference<CRCustomerCaseRootCauseAnalysisUpdateOutputModel>(){});
	}
	
	public BQCreditandFraudRelatedIssueAnalysisUpdateOutputModel updateCreditandfraudrelatedissueanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCreditandFraudRelatedIssueAnalysisUpdateInputModel request){
		return JsonReader.read("update-BQCreditandFraudRelatedIssueAnalysisUpdateOutputModel.json",new TypeReference<BQCreditandFraudRelatedIssueAnalysisUpdateOutputModel>(){});
	}
	
	public BQOperationsandServicingIssueAnalysisUpdateOutputModel updateOperationsandservicingissueanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOperationsandServicingIssueAnalysisUpdateInputModel request){
		return JsonReader.read("update-BQOperationsandServicingIssueAnalysisUpdateOutputModel.json",new TypeReference<BQOperationsandServicingIssueAnalysisUpdateOutputModel>(){});
	}
	
}
