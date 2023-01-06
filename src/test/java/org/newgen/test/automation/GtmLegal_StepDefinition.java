package org.newgen.test.automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GtmLegal_StepDefinition extends GtmBaseClass {
	public GtmLoginPojo login;
	public GtmInitiatePojo initiate;
	public GtmLegalPojo legal;
	@Given("Legal User have to launch the URL")
	public void legal_User_have_to_launch_the_URL() throws IOException {
		FileReader reader =new FileReader("C:\\Users\\ranjith.p\\eclipse-workspace\\NewgenTestAutomation2\\src\\test\\java\\org\\newgen\\test\\automation\\GtmTestData.properties");
		Properties prop =new Properties();
		prop.load(reader);
		chromeBrowser();
		windowsMax();
		urlLaunch(prop.getProperty("SearchTerm"));
	}

	@When("Legal User have to enter valid credientials")
	public void legal_User_have_to_enter_valid_credientials() throws IOException, InterruptedException {

		login=new GtmLoginPojo();
		FileReader reader =new FileReader("C:\\Users\\ranjith.p\\eclipse-workspace\\NewgenTestAutomation2\\src\\test\\java\\org\\newgen\\test\\automation\\GtmTestData.properties");
		Properties prop =new Properties();
		prop.load(reader);
		sendkeys(login.getUsername(),prop.getProperty("userrname"));
		sendkeys(login.getPassword(),prop.getProperty("Password"));
		click(login.getLoginbutton());
		Thread.sleep(2000);
		driver.getTitle();
		String s1 = "OmniApp | Main";
		if (driver.getTitle().equalsIgnoreCase(s1)) {
			System.out.println("done");
			
		}
		else {
			click(login.getYeslogin());
		}
	}

	@Then("Legal User should be in homepage")
	public void legal_User_should_be_in_homepage() {
		System.out.println("done");
		//System.out.println(GtmBaseClass.wi_num);
	}

	@Given("Legal User have to select process as GTM")
	public void legal_User_have_to_select_process_as_GTM() {
		implicitWait();
		 initiate=new GtmInitiatePojo();
		frameToBeAvailableAndsSwitchToIt(initiate.getWorkitemframe(), 20);
		elementToBeClickable(initiate.getGtmdropdown(), 20);
		click(initiate.getGtmdropdown());
		defaultContent();
	    click(initiate.getGtmoption());
	}

	@When("Legal User have to enter workitem no and navigate to Legal stage")
	public void legal_User_have_to_enter_workitem_no_and_navigate_to_Legal_stage() throws IOException, InterruptedException, AWTException {
		implicitWait();
		FileReader reader =new FileReader("C:\\Users\\ranjith.p\\eclipse-workspace\\NewgenTestAutomation2\\src\\test\\java\\org\\newgen\\test\\automation\\TestData1.properties");
		Properties prop =new Properties();
		prop.load(reader);
		implicitWait();
	    initiate=new GtmInitiatePojo();
		frameToBeAvailableAndsSwitchToIt(initiate.getWorkitemframe(), 20);
		mouseoverdoubleclick(initiate.getWorkitemno());
		sendkeys(initiate.getWorkitemno(), prop.getProperty("workitemno"));
		click(initiate.getSearchOk());
		defaultContent();
		frameToBeAvailableAndsSwitchToIt(initiate.getNewframe(), 20);
		click(initiate.getWorkitemresult());
	    numberOfWindowsToBe(2, 10);
		Set<String> window = driver.getWindowHandles();
		List<String> ly = new LinkedList<String>(window);
		driver.switchTo().window(ly.get(1));
	}

	@When("Legal User have to enter mandatory fields")
	public void legal_User_have_to_enter_mandatory_fields() throws AWTException, InterruptedException {
		implicitWait();
		legal=new GtmLegalPojo();
		frameToBeAvailableAndsSwitchToIt(legal.getFrame1(), 20);
		Thread.sleep(1000);
		sendkeys(legal.getGetPsid(), "naveenm");
		keyPressEnter();
		sendkeys(legal.getGetExecution(), "ok");
		
		
	   
	}

	@Then("Legal User have to save and click ok")
	public void legal_User_have_to_save_and_click_ok() throws IOException, InterruptedException {
		implicitWait();
		legal=new GtmLegalPojo();
		click(legal.getlegalapprove());
		screenShot("LegalApprove", ".png");
		Thread.sleep(1000);
		click(legal.getConfirmok()); 
	}


}
