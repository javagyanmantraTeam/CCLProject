package com.keybank.cards.offers.dao.beans;

import java.util.List;

public class CardDAO {
	private List<Card> card;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CardDAO [card=");
		builder.append(card);
		builder.append("]");
		return builder.toString();
	}

	public List<Card> getCard() {
		return card;
	}

	public void setCard(List<Card> card) {
		this.card = card;
	}
	
	
	

}
