package ca.on.wsib.digital.eclaims.orchestration.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class SubmissionStatusMsg {
    String submissionId;
    String status;
    List<DocumentSubmissionStatus> documentSubmissionStatus;
    
	@JsonCreator
	public SubmissionStatusMsg(
			@JsonProperty("submissionId") String submissionId,
			@JsonProperty("status") String status,
			@JsonProperty(value = "documentSubmissionStatus", required = true) final List<DocumentSubmissionStatus> documentSubmissionStatus) {
		this.submissionId = submissionId;
    	this.status = status;
    	this.documentSubmissionStatus = documentSubmissionStatus;
	}
	
   
    
}
