package com.sreenutech.rest.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.sreenutech.scema.req.OrderReqBean;
import com.sreenutech.scema.res.OrderResBean;

public class SpringOrderServicePostClient {

	public static void main(String[] args) {
		
		/*RestTemplate template = new RestTemplate();
		String uri ="http://localhost:8888/10_OrderService-PostExamples/rest/orders/getOrders";
		OrderReqBean req = new OrderReqBean();
		req.setOid("12121");
		req.setName("iphone");
		req.setType("mobile");
		
		
		
		OrderResBean resp = template.postForObject(uri, req, OrderResBean.class);
		System.out.println("response is :"+resp);
		System.out.println("response is :"+resp.getDesc());
		System.out.println("response is :"+resp.getStatus().getStatucCode());
		
		ResponseEntity<OrderResBean> response = template.postForEntity(uri, req, OrderResBean.class);
		
		OrderResBean svcResp = response.getBody();*/
		
		RestTemplate template = new RestTemplate();
		
		List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
		// Add the Jackson Message converter
		messageConverters.add(new Jaxb2RootElementHttpMessageConverter());
		template.setMessageConverters(messageConverters);
		
		String uri ="http://localhost:2015/10_OrderService-PostExamples/rest/orders/getOrders";
		OrderReqBean req = new OrderReqBean();
		req.setOid("12121");
		req.setName("iphone");
		req.setType("mobile");

		
		MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
		headers.add("Content-Type", "application/xml");
		
		HttpEntity<OrderReqBean> requestEntity = new HttpEntity<OrderReqBean>(req, headers);
		ResponseEntity<OrderResBean> serviceresp = template.exchange(uri, HttpMethod.POST, requestEntity, OrderResBean.class);
		System.out.println(serviceresp.getBody());
		System.out.println(serviceresp.getBody().getDesc());
		System.out.println(serviceresp.getBody().getStatus().getStatucCode());
	}

}
