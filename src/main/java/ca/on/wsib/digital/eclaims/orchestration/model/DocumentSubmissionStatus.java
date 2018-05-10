package ca.on.wsib.digital.eclaims.orchestration.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import ca.on.wsib.digital.eclaims.orchestration.model.Attachment.AttachmentBuilder;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class DocumentSubmissionStatus {

	String fileEndpoint;
	String gwDocId;
	
	@JsonCreator
	public DocumentSubmissionStatus(
			@JsonProperty("fileEndpoint") String fileEndpoint,
			@JsonProperty("gwDocId") String gwDocId) {
		this.fileEndpoint = fileEndpoint;
		this.gwDocId = gwDocId;
	}
}
