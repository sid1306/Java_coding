package com.hsbc;

import com.hsbc.model.Address;
import com.hsbc.model.Order;

public class Amazon {
	
	public static void main(String[] args) {
		Address address=new Address();
		address.setHouseNumber("D2-605");
		address.setPincode(1235);
		
		Order order =new Order(address,1000);
		
		
		
		//System.out.println(order.getPrice()));
	}
	
	
}
