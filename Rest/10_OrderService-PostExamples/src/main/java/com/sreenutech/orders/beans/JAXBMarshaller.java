package com.sreenutech.orders.beans;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import com.sreenutech.scema.req.OrderReqBean;

public class JAXBMarshaller {

	public static void main(String[] args) throws JAXBException {
	
		JAXBContext jcon = JAXBContext.newInstance(OrderReqBean.class);
		OrderReqBean req = new OrderReqBean();
		req.setOid("12121");
		req.setName("iphone");
		req.setType("mobile");
		jcon.createMarshaller().marshal(req, System.out);

	}

}
