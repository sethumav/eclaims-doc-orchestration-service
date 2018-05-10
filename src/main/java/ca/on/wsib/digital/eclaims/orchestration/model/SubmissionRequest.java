package ca.on.wsib.digital.eclaims.orchestration.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Singular;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class SubmissionRequest {
    String claimNumber;

    String notes;

    @Singular
    List<Attachment> attachments;

    @JsonCreator
    public SubmissionRequest(
            @JsonProperty(value = "claimNumber") final String claimNumber,
            @JsonProperty(value = "notes") final String notes,
            @JsonProperty(value = "attachments", required = true) final List<Attachment> attachments) {
        this.claimNumber = claimNumber;
        this.notes = notes;
        this.attachments = attachments;
    }
}
