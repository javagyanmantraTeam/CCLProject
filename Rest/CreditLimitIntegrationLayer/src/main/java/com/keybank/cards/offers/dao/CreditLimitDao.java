package com.keybank.cards.offers.dao;

import com.keybank.cards.offers.dao.beans.CreditLimitDaoVerifyReq;
import com.keybank.cards.offers.dao.beans.CreditLimitDaoVerifyResp;

public interface CreditLimitDao {
	CreditLimitDaoVerifyResp varifyPromoCode(CreditLimitDaoVerifyReq reqBean);

}
