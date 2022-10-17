package com.ozkan;

import java.io.File;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

public class app {

	public static void main(String[] args) {
		ObjectMapper mapper  = new ObjectMapper();
		 
		try {
			
			Student student = mapper.readValue(new File("data/simple-student.json"), Student.class);
			System.out.println(student.getId());
			System.out.println(student.getFirstName());
			System.out.println(student.getLastName());
			
			
			Address tempAddress = student.getAddress();
			System.out.println("Address is :" +tempAddress.getCity() + " " +tempAddress.getPostalCode()+ " "
					+tempAddress.getCountry());
			
			for(String tempLang : student.getLanguages()) {
				System.out.println(tempLang);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
