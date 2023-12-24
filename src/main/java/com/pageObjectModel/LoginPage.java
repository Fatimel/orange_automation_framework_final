package com.pageObjectModel;

import org.openqa.selenium.By;

public class LoginPage {
	
	//we will store all login related  xpath
	//Xpath is part of selenium --> Data type need to use is web element 
	//store Xpath using PF or POM concept:
	//PF ---> @ FindBy
	//POM ---> By()
	
	public  By user = By.xpath("//*[@ name= 'username']");
	public By password= By.xpath("//*[@ name=\"password\"]");
	public By loginBtn = By.xpath("//*[text()=' Login '] ");
   public By dropDown = By.xpath("//*[@ class='oxd-userdropdown-name']");
   public By logoutBtn = By.xpath("//*[text()='Logout']");
}
