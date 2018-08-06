package com.keybank.cards.offers.service.beans;

public class CreditLimitSvcVerifyRespBeans {
	private CreditLimitResp creditLimitResp;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CreditLimitSvcVerifyRespBeans [creditLimitResp=");
		builder.append(creditLimitResp);
		builder.append("]");
		return builder.toString();
	}

	public CreditLimitResp getCreditLimitResp() {
		return creditLimitResp;
	}

	public void setCreditLimitResp(CreditLimitResp creditLimitResp) {
		this.creditLimitResp = creditLimitResp;
	}
	

}
