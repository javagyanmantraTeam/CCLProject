package com.sreenutech.orders.util;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.sreenutech.scema.res.OrderResBean;
import com.sreenutech.scema.res.StatusBeans;

@Provider
public class OrderServiceExceptionHanlder implements ExceptionMapper<OrderServiceException> {

	public Response toResponse(OrderServiceException exception) {
		System.out.println("Entered into ExceptionMapper");
		OrderResBean resp = new OrderResBean();
		StatusBeans stBean = new StatusBeans();
		stBean.setStatucCode(exception.getStatusCode());
		stBean.setStatucMsg(exception.getStatusMSg());
		resp.setStatus(stBean);
		return Response.status(400).entity(resp).build();
	}

}
