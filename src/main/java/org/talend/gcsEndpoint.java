package org.talend;

import org.apache.camel.Consumer;
import org.apache.camel.Processor;
import org.apache.camel.Producer;
import org.apache.camel.api.management.ManagedAttribute;
import org.apache.camel.impl.DefaultEndpoint;

/**
 * Represents a gcs endpoint.
 */
public class gcsEndpoint extends DefaultEndpoint {

	private String apiKey;
	private String apiKeySecret;
	private String bucket;
	private String url;
	private String filePath;
	private String fileName;
	private String contentType;

	public gcsEndpoint() {
	}

	public gcsEndpoint(String uri, gcsComponent component) {
		super(uri, component);
	}

	public gcsEndpoint(String endpointUri) {
		super(endpointUri);
	}

	public Producer createProducer() throws Exception {
		return new gcsProducer(this);
	}

	public Consumer createConsumer(Processor processor) throws Exception {
		return new gcsConsumer(this, processor);
	}

	public boolean isSingleton() {
		return true;
	}

	@ManagedAttribute(description = "Google API Key")
	public String getApiKey() {
		return apiKey;
	}

	@ManagedAttribute(description = "Google API Key")
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	@ManagedAttribute(description = "Google API Key Secret")
	public String getApiKeySecret() {
		return apiKeySecret;
	}

	@ManagedAttribute(description = "Google API Key Secret")
	public void setApiKeySecret(String apiKeySecret) {
		this.apiKeySecret = apiKeySecret;
	}

	@ManagedAttribute(description = "Google Storage Bucket")
	public String getBucket() {
		return bucket;
	}

	@ManagedAttribute(description = "Google Storage Bucket")
	public void setBucket(String bucket) {
		this.bucket = bucket;
	}

	@ManagedAttribute(description = "Google Storage API URL")
	public String getUrl() {
		return url;
	}

	@ManagedAttribute(description = "Google Storage API URL")
	public void setUrl(String url) {
		this.url = url;
	}

	@ManagedAttribute(description = "Path to the source file")
	public String getFilePath() {
		return filePath;
	}

	@ManagedAttribute(description = "Path to the source file")
	public void setFilePath(String filepath) {
		this.filePath = filepath;
	}

	@ManagedAttribute(description = "Source file name")
	public String getFileName() {
		return fileName;
	}

	@ManagedAttribute(description = "Source file name")
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@ManagedAttribute(description = "Source file content type")
	public String getContentType() {
		return contentType;
	}

	@ManagedAttribute(description = "Source file content type")
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

}
