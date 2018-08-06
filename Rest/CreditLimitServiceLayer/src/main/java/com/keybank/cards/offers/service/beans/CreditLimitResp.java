package com.keybank.cards.offers.service.beans;

public class CreditLimitResp {

	private StatusBlock statusBlock;
	private CardDetail cardDetail;
	private BalanceDetail balanceDetail;
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CreditLimitResp [statusBlock=");
		builder.append(statusBlock);
		builder.append(", cardDetail=");
		builder.append(cardDetail);
		builder.append(", balanceDetail=");
		builder.append(balanceDetail);
		builder.append("]");
		return builder.toString();
	}
	public StatusBlock getStatusBlock() {
		return statusBlock;
	}
	public void setStatusBlock(StatusBlock statusBlock) {
		this.statusBlock = statusBlock;
	}
	public CardDetail getCardDetail() {
		return cardDetail;
	}
	public void setCardDetail(CardDetail cardDetail) {
		this.cardDetail = cardDetail;
	}
	public BalanceDetail getBalanceDetail() {
		return balanceDetail;
	}
	public void setBalanceDetail(BalanceDetail balanceDetail) {
		this.balanceDetail = balanceDetail;
	}
	
}
