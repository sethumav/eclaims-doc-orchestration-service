package ca.on.wsib.digital.eclaims.orchestration.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

@Value
public class FileMetadata {
    public static final String STAGED_STATUS = "staged";

    String claimNumber;
    String status;
    String filename;

    @JsonCreator
    public FileMetadata(
            @JsonProperty("claimNumber") String claimNumber,
            @JsonProperty("status") String status,
            @JsonProperty("filename") String filename) {
        this.claimNumber = claimNumber;
        this.status = status;
        this.filename = filename;
    }
}
