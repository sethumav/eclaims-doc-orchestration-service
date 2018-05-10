package ca.on.wsib.digital.eclaims.orchestration.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Value;

@Value
public class SubmissionStatusMsg2 {
    @JsonProperty("subId")
    String submissionId;
    String status;
//    List<DocumentSubmissionStatus> documentSubmissionStatus
    DocumentSubmissionStatus documentSubmissionStatus;
    
    @JsonCreator

    public SubmissionStatusMsg2(
            @JsonProperty("subId") String submissionId,
            @JsonProperty("status") String status,
//            @JsonProperty(value = "documentSubmissionStatus", required = true) final List<DocumentSubmissionStatus> documentSubmissionStatus) {
            @JsonProperty(value = "documentSubmissionStatus", required = true) final DocumentSubmissionStatus documentSubmissionStatus) {
        this.submissionId = submissionId;
        this.status = status;
        this.documentSubmissionStatus=documentSubmissionStatus;
    }
}
