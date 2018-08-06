package com.keybank.cards.offers.process.impl;

import java.util.ArrayList;
import java.util.List;

import com.keybank.cards.offers.dao.CreditLimitDao;
import com.keybank.cards.offers.dao.beans.CardDAO;
import com.keybank.cards.offers.dao.beans.CreditLimitDaoVerifyReq;
import com.keybank.cards.offers.dao.beans.CreditLimitDaoVerifyResp;
import com.keybank.cards.offers.dao.impl.CreditLimitDaoImpl;
import com.keybank.cards.offers.process.CreditLimitProcess;
import com.keybank.cards.offers.process.beans.CardProcess;
import com.keybank.cards.offers.process.beans.CreditLimitProcessVerifyReqBeans;
import com.keybank.cards.offers.process.beans.CreditLimitVerifyProcessRespBeans;

public class CreditLimitProcessImpl implements CreditLimitProcess{

	public CreditLimitVerifyProcessRespBeans varifyPromoCode(CreditLimitProcessVerifyReqBeans reqBean) {
	
		System.out.println("enter into process");
		//1.get the request from service
		//2.process the request from dao
		CreditLimitDaoVerifyReq daoReq=new CreditLimitDaoVerifyReq();
		daoReq.setChannelId(reqBean.getChannelId());
		daoReq.setClientId(reqBean.getClientId());
		daoReq.setReqId(reqBean.getReqId());
		
		//3.call dao
		CreditLimitDao creditLimitDao=new CreditLimitDaoImpl();
		
		CreditLimitDaoVerifyResp daoResp = creditLimitDao.varifyPromoCode(daoReq);
		CardProcess cardDAO=new CardProcess();
		//5.prepare the process response
		CreditLimitVerifyProcessRespBeans processResp=new CreditLimitVerifyProcessRespBeans();
		
		processResp.setCurrentLimit(daoResp.getCurrentLimit());
		processResp.setEligibalAmount(daoResp.getEligibalAmount());
		processResp.setRespCode(daoResp.getRespCode());
		processResp.setRespMessage(daoResp.getRespMessage());
	
		List<CardDAO> cardProcess=daoResp.g
		
		cardDAO.setCardNumber("98765432146578");
		CardDAO cardDAO1=new CardDAO();
		cardDAO1.setCardNumber("98765432146578");
		
		
		 String listCardDAO = daoResp.getCardDAO().iterator().next().getCardNumber();
		listCardDAO.add(cardDAO);
		listCardDAO.add(cardDAO1);
		processResp.setCardProcess(cardProcess);
		System.out.println("exit into process");
		
		return processResp;
	}

}
