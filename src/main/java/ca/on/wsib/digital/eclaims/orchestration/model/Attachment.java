package ca.on.wsib.digital.eclaims.orchestration.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Attachment {
    String type;
    String file;

    @JsonCreator
    public Attachment(@JsonProperty("type") final String type,
                      @JsonProperty("file") final String file) {
        this.type = type;
        this.file = file;
    }
}
