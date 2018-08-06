package com.keybank.cards.offers.dao.beans;

public class Card {
	private String cardNumber;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Card [cardNumber=");
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
