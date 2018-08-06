package com.keybank.cards.offers.dao.beans;

public class CreditLimitDaoVerifyReq {
	private String clientId;
	private String channelId;
	private String reqId;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CreditLimitDaoVerifyReq [clientId=");
		builder.append(clientId);
		builder.append(", channelId=");
		builder.append(channelId);
		builder.append(", reqId=");
		builder.append(reqId);
		builder.append("]");
		return builder.toString();
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public String getReqId() {
		return reqId;
	}
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}
	
	

}
