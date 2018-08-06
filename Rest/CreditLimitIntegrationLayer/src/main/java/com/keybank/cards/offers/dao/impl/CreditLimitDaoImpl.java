package com.keybank.cards.offers.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.keybank.cards.offers.dao.CreditLimitDao;
import com.keybank.cards.offers.dao.beans.Card;
import com.keybank.cards.offers.dao.beans.CardDAO;
import com.keybank.cards.offers.dao.beans.CreditLimitDaoVerifyReq;
import com.keybank.cards.offers.dao.beans.CreditLimitDaoVerifyResp;

public class CreditLimitDaoImpl implements CreditLimitDao {

	public CreditLimitDaoVerifyResp varifyPromoCode(CreditLimitDaoVerifyReq reqBean) {

		System.out.println("Dao enter");
		reqBean.getChannelId();
		reqBean.getClientId();
		reqBean.getReqId();

		CreditLimitDaoVerifyResp daoResp=new CreditLimitDaoVerifyResp();
		CardDAO cardDAO =new CardDAO();
		Card card=new Card();
		card.
		List<CardDAO> cardDAOs=new ArrayList<CardDAO>();
		cardDAOs.add(cardDAO);
		cardDAOs.add(cardDAO1);
		cardDAOs.add(cardDAO2);
		daoResp.setCardDAO(cardDAOs);
		daoResp.setCurrentLimit(100000);
		daoResp.setEligibalAmount(500000);
		daoResp.setRespCode("respCode---00000");
		daoResp.setRespMessage("respMessage--sucess");
		System.out.println("Dao exit");
		return daoResp;
	}

}
