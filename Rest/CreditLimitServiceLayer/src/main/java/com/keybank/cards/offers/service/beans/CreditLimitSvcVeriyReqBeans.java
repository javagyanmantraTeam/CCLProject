package com.keybank.cards.offers.service.beans;

public class CreditLimitSvcVeriyReqBeans {
	private ClientContext clientContext;
	private OfferDetail offerDetail;
	private ServiceDetail serviceDetail;
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CreditLimitSvcVeriyReqBeans [clientContext=");
		builder.append(clientContext);
		builder.append(", offerDetail=");
		builder.append(offerDetail);
		builder.append(", serviceDetail=");
		builder.append(serviceDetail);
		builder.append("]");
		return builder.toString();
	}
	public ClientContext getClientContext() {
		return clientContext;
	}
	public void setClientContext(ClientContext clientContext) {
		this.clientContext = clientContext;
	}
	public OfferDetail getOfferDetail() {
		return offerDetail;
	}
	public void setOfferDetail(OfferDetail offerDetail) {
		this.offerDetail = offerDetail;
	}
	public ServiceDetail getServiceDetail() {
		return serviceDetail;
	}
	public void setServiceDetail(ServiceDetail serviceDetail) {
		this.serviceDetail = serviceDetail;
	}
	

}
