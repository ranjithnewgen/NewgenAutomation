package org.newgen.test.automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GtmLoginPojo extends GtmBaseClass{
	
	public GtmLoginPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="oaloginform:userid")
	private WebElement username;
	
	@FindBy(id="oaloginform:password")
	private WebElement  password;
	
	@FindBy(id="oaloginform:loginbtn")
	private WebElement loginbutton;
	
	@FindBy(xpath="//label[contains(text(),'The specified user is already logged in on some other machine. Do you still want to continue?')]")
	private WebElement alreadylogin;
	
    @FindBy(xpath="//input[@id='oaloginform:contloginbtn']")
    private WebElement yeslogin;
    
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public WebElement getAlreadylogin() {
		return alreadylogin;
	}

	public WebElement getYeslogin() {
		return yeslogin;
	}
	
	}



