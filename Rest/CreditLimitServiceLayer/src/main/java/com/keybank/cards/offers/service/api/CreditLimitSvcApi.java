package com.keybank.cards.offers.service.api;

import com.keybank.cards.offers.service.beans.CreditLimitSvcVerifyRespBeans;
import com.keybank.cards.offers.service.beans.CreditLimitSvcVeriyReqBeans;

public interface CreditLimitSvcApi {
	
	CreditLimitSvcVerifyRespBeans varifyPromoCode(CreditLimitSvcVeriyReqBeans reqBean);

}
