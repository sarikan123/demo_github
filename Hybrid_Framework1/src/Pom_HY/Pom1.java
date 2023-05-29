package Pom_HY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Script.Base_Page;

public class Pom1 extends Base_Page {
	@FindBy(id="email")
	private WebElement un;
	
	@FindBy(id="pass")
	private WebElement pwd;
	
	@FindBy(name="login")
	private WebElement btn;
	
	//Initialization
	
	public  Pom1(WebDriver driver) {
	
	
	
		super(driver);
	}
	
	public void username1(String passun)
	{
		un.sendKeys(passun);
	}
	
	public void password2(String passpwd)
	{
		pwd.sendKeys(passpwd);
	}
	
	public void login()
	{
		btn.click();
	}

	
		// TODO Auto-generated method stub
		
	}


		
		
	
	


