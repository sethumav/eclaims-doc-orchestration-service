package ca.on.wsib.digital.eclaims.orchestration.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

@Value()
public class SubmissionResponse {
    String trackingNumber;

    @JsonCreator
    public SubmissionResponse(
            @JsonProperty("trackingNumber") String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }
}
