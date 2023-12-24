package com.util;

import java.io.FileInputStream;
import java.util.Properties;

public class BaseConfigHr {
	
	public String getBaseConfigHr(String value) throws Exception{
		// get config file path 
		 String filePath ="./confighr.properties";
		
		// convert config file to stream by using class FileInputStream
		FileInputStream fils = new FileInputStream(filePath);
		
		//read any configfile by using properties class
		
		Properties pro = new Properties();
		pro.load(fils);
		
		// get ech value
		String eachValue = pro.get(value).toString();
		System.out.println(eachValue);
		return eachValue;
		
	}
	
	public static void main(String[] args) throws Exception {
		BaseConfigHr obj1= new BaseConfigHr();
		obj1.getBaseConfigHr("PASSWORD");
		
	}


}
