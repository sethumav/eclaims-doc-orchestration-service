package ca.on.wsib.digital.eclaims.orchestration.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Value;

@Value
public class GetFileResponse {

	byte[] content;
	FileMetadata fileMetaData;

	@JsonCreator
	public GetFileResponse(
			@JsonProperty("content") byte[] content,
			@JsonProperty("fileMetaData") FileMetadata fileMetaData)
			{
				this.content = content;
				this.fileMetaData = fileMetaData;
			}
}
