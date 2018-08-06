package com.keybank.cards.offers.process;

import com.keybank.cards.offers.process.beans.CreditLimitProcessVerifyReqBeans;
import com.keybank.cards.offers.process.beans.CreditLimitVerifyProcessRespBeans;

public interface CreditLimitProcess {

	CreditLimitVerifyProcessRespBeans varifyPromoCode(CreditLimitProcessVerifyReqBeans reqBean);
}
