package com.keybank.cards.offers.service.beans;

public class ServiceDetail {
	private String serviceName;
	private String apiName;
	private String version;
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ServiceDetail [serviceName=");
		builder.append(serviceName);
		builder.append(", apiName=");
		builder.append(apiName);
		builder.append(", version=");
		builder.append(version);
		builder.append("]");
		return builder.toString();
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getApiName() {
		return apiName;
	}
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}

	
}
