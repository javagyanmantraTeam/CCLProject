package com.keybank.cards.offers.service.impl;

import java.util.List;

import javax.jws.WebService;

import org.example.creditlimitservice.CreditLimitService;
import org.keybank.creditlimitreq.CreditLimitReqType;
import org.keybank.creditlimitreq.OfferDetailType;
import org.keybank.creditlimitserviceres.BalanceDetailType;
import org.keybank.creditlimitserviceres.CardDetailType;
import org.keybank.creditlimitserviceres.CardType;
import org.keybank.creditlimitserviceres.CreditLimitServiceResType;
import org.keybank.creditlimitserviceres.StatusBlockType;
@WebService(endpointInterface="com.keybank.cards.offers.service.impl.CreditLimitService")
public class CreditLimitServiceImpl implements CreditLimitService{

	public CreditLimitServiceResType verifyPromoCode(CreditLimitReqType parameters) {
		CreditLimitServiceResType resp=new CreditLimitServiceResType();
		
		StatusBlockType stBlock=new StatusBlockType();
		stBlock.setRespCode("0000");
		stBlock.setRespMessage("sucess");
		
		CardDetailType cdType=new CardDetailType();
		List<CardType> cardList=cdType.getCard();
		CardType cardType=new CardType();
		cardType.setCardNum("7889456123658");
		cardList.add(cardType);
		CardType cardType1=new CardType();
		cardType1.setCardNum("7889456123658");
		cardList.add(cardType1);
		CardType cardType2=new CardType();
		cardType2.setCardNum("7889456123658");
		cardList.add(cardType2);
		CardType cardType3=new CardType();
		cardType3.setCardNum("7889456123658");
		cardList.add(cardType3);
		
		OfferDetailType ofDType=new OfferDetailType();
		ofDType.setPromocode("7894563214");
		
		BalanceDetailType balType=new BalanceDetailType();
		balType.setCurrentLimit(10000);
		balType.setEligibalAmount(50000);
		
		resp.setBalanceDetail(balType);
		resp.setCardDetail(cdType);
		resp.setStatusBlock(stBlock);

		
		return resp;
	}

}
