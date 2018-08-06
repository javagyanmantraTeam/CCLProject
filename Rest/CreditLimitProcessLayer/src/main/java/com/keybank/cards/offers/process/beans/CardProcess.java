package com.keybank.cards.offers.process.beans;

public class CardProcess {
	private String cardNumber;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CardProcess [cardNumber=");
		builder.append(cardNumber);
		builder.append("]");
		return builder.toString();
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	

}
