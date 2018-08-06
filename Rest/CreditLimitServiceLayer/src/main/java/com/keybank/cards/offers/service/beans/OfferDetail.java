package com.keybank.cards.offers.service.beans;

public class OfferDetail {
	private String promocode;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OfferDetail [promocode=");
		builder.append(promocode);
		builder.append("]");
		return builder.toString();
	}

	public String getPromocode() {
		return promocode;
	}

	public void setPromocode(String promocode) {
		this.promocode = promocode;
	}
	

}
