package com.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pageObjectModel.LoginPage;
import com.util.BaseConfigHr;

public class Login {
	
	public static void getLoginFunction() throws Exception {
		//open the browser
				WebDriver driver = new ChromeDriver();
				//Go to the application link
				//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				BaseConfigHr obj1= new BaseConfigHr();
				
				driver.navigate().to(obj1.getBaseConfigHr("URL"));//1 cannot show URL
				//Maximized the browser
				driver.manage().window().maximize();
				//WAIT PAGE LAOD GUI 
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
				//Wait for HTML load
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				LoginPage pom = new LoginPage();
				
				//Valid user
				driver.findElement(pom.user).sendKeys(obj1.getBaseConfigHr("USER")); //2cannot show user
				//Valid password
				driver.findElement(pom.password).sendKeys(obj1.getBaseConfigHr("PASSWORD")); // 3 cannot show password, it's crime 
				//Click Login button 
				driver.findElement(pom.loginBtn).click(); // 4 cannot show the xpath
				//driver.findElement(By.xpath("//*[@type='submit']")).click(); // 4 cannot show the xpath
				//Logout button should be visible for successful Login
				driver.findElement(pom.dropDown).click(); // 4 cannot show the xpath
					
				//wait for Logout visible
				 WebElement Logout = driver.findElement(pom.logoutBtn);  // 4 cannot show the xpath
				 WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
				 wait.until(ExpectedConditions.visibilityOfAllElements(Logout));
				 //WebElement Logout=driver.findElement(By.xpath("(//*[@role='menuitem'])[4]"));
				
				 //Check Logout button is display or  not
				 Boolean LogOutFound = Logout.isDisplayed();
				System.out.println(LogOutFound);
				 
				//Close the browser
				driver.quit();
		
				//we need to create  config.proerties, it's a file where to hide URL, USER, PASSWORD
				//WE NEED TO CREATE A CLASS (PAGE FACTORY/ POM PAGE OBJECT MODEL) TO HIDE THE XPATH
	}

}
