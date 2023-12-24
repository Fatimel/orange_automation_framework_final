package com.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseConfig {

	public void getConfig( String value) throws IOException{
		//file config path
		String filepath = "./config.properties";
		// Convert file(note path) into stream --> java dev create class :FileInputStream   class, it wiil convert ant file to stream 
		FileInputStream fis = new FileInputStream(filepath);
		
		// To Read any note or config  file ==> java dev said to use class: Properties
		Properties pro = new Properties();
		pro.load(fis);
		
		//get each value
		Object eachValue=  pro.get(value);
		System.out.println(eachValue);
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BaseConfig obj = new BaseConfig();
		obj.getConfig("USER");
		
		
	}
}
