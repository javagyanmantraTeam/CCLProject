package com.sreenutech.rest.client;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.sreenutech.scema.req.OrderReqBean;
import com.sreenutech.scema.res.OrderResBean;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class JersyRestPostClient {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		//1. create the client Object
		Client client = Client.create();
		//2. Using client object get the webResource Object
		WebResource resource = client.resource("http://localhost:8888/10_OrderService-PostExamples/rest/orders/getOrders");
        //3. prepare the request object
		OrderReqBean req = new OrderReqBean();
		req.setOid("12121");
		req.setName("iphone");
		req.setType("mobile");
		
		//3. Using webResource Object invoke the service
		
		ClientResponse response = resource.type("application/xml").accept("application/xml").post(ClientResponse.class,req);
		
		//response in xml as string formate
		//String resp = response.getEntity(String.class);
		//response in object
		OrderResBean resp = response.getEntity(OrderResBean.class);
		System.out.println("response is :"+resp);
		System.out.println("response is :"+resp.getDesc());
		System.out.println("response is :"+resp.getStatus().getStatucCode());
		
				
		
		

	}

}
