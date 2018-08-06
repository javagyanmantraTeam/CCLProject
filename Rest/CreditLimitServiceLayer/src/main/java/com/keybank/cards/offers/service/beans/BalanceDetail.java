package com.keybank.cards.offers.service.beans;

public class BalanceDetail {

	private String currentLimit;
	private String eligibalAmount;
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BalanceDetail [currentLimit=");
		builder.append(currentLimit);
		builder.append(", eligibalAmount=");
		builder.append(eligibalAmount);
		builder.append("]");
		return builder.toString();
	}
	public String getCurrentLimit() {
		return currentLimit;
	}
	public void setCurrentLimit(String currentLimit) {
		this.currentLimit = currentLimit;
	}
	public String getEligibalAmount() {
		return eligibalAmount;
	}
	public void setEligibalAmount(String eligibalAmount) {
		this.eligibalAmount = eligibalAmount;
	}
	
}
