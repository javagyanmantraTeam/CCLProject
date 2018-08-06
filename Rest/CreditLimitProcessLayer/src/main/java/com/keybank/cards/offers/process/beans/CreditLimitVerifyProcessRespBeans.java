package com.keybank.cards.offers.process.beans;

import java.util.List;


public class CreditLimitVerifyProcessRespBeans {
	
	private String respCode;
	private String respMessage;
	private double currentLimit;
	private double eligibalAmount;
	private List<CardProcess> cardProcess;
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CreditLimitVerifyProcessRespBeans [respCode=");
		builder.append(respCode);
		builder.append(", respMessage=");
		builder.append(respMessage);
		builder.append(", currentLimit=");
		builder.append(currentLimit);
		builder.append(", eligibalAmount=");
		builder.append(eligibalAmount);
		builder.append(", cardProcess=");
		builder.append(cardProcess);
		builder.append("]");
		return builder.toString();
	}
	public String getRespCode() {
		return respCode;
	}
	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}
	public String getRespMessage() {
		return respMessage;
	}
	public void setRespMessage(String respMessage) {
		this.respMessage = respMessage;
	}
	public double getCurrentLimit() {
		return currentLimit;
	}
	public void setCurrentLimit(double currentLimit) {
		this.currentLimit = currentLimit;
	}
	public double getEligibalAmount() {
		return eligibalAmount;
	}
	public void setEligibalAmount(double eligibalAmount) {
		this.eligibalAmount = eligibalAmount;
	}
	public List<CardProcess> getCardProcess() {
		return cardProcess;
	}
	public void setCardProcess(List<CardProcess> cardProcess) {
		this.cardProcess = cardProcess;
	}
	
	
}
