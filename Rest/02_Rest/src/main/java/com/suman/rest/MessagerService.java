package com.suman.rest;

import java.util.ArrayList;
import java.util.List;

public class MessagerService {
	
	public List<Message> getAllMessage(){
		Message message1=new Message("101","suman","kkkk","pppp");
		Message message2=new Message("101","suman","kkkk","pppp");
		List<Message> messList=new ArrayList<Message>();
		messList.add(message1);
		messList.add(message2);
		return messList;
	}

}
