package com.sreenutech.orders;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.sreenutech.orders.util.OrderServiceException;
import com.sreenutech.scema.req.OrderReqBean;
import com.sreenutech.scema.res.OrderResBean;
import com.sreenutech.scema.res.StatusBeans;

@Path("/orders")
public class OrderService {
	@Path("/getOrders")
	@POST
	@Produces("application/xml")
	@Consumes("application/xml")
	public OrderResBean getOrders(OrderReqBean req) throws OrderServiceException {
		OrderResBean resp = new OrderResBean();
			
		if( req != null  ){
			
			if( req.getOid() == null ){
				
				throw new OrderServiceException("200", "orderid invalid");
				
			}
			
			resp.setDesc("good");
			StatusBeans stBean = new StatusBeans();
			stBean.setStatucCode("000");
			stBean.setStatucMsg("success");
			
			resp.setStatus(stBean);
		}else{
			StatusBeans stBean = new StatusBeans();
			stBean.setStatucCode("100");
			stBean.setStatucMsg("order request is null");
			
			resp.setStatus(stBean);
		}
		
		
	
		
		return resp;
		
	}

}
