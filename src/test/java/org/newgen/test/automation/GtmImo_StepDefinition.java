package org.newgen.test.automation;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GtmImo_StepDefinition extends GtmBaseClass {
	public GtmLoginPojo login;
	public GtmInitiatePojo initiate;
	public GtmImoPojo imo;
	
	@Given("User have to login with valid user id and password in omniapp URL")
	public void user_have_to_login_with_valid_user_id_and_password_in_omniapp_URL() throws IOException, InterruptedException {
		FileReader reader =new FileReader("C:\\Users\\ranjith.p\\eclipse-workspace\\NewgenTestAutomation2\\src\\test\\java\\org\\newgen\\test\\automation\\GtmTestData.properties");
		Properties prop =new Properties();
		prop.load(reader);
		chromeBrowser();
		windowsMax();
		urlLaunch(prop.getProperty("SearchTerm"));
		login=new GtmLoginPojo();
		sendkeys(login.getUsername(),prop.getProperty("userrname"));
		sendkeys(login.getPassword(),prop.getProperty("Password"));
		click(login.getLoginbutton());
		Thread.sleep(2000);
		driver.getTitle();
		String s1 = "OmniApp | Main";
		if (driver.getTitle()==s1) {
			System.out.println("done");
			
		}
		else {
			click(login.getYeslogin());
		}
	    
	}

	@When("User have to select process name and enter the workitem number need to process")
	public void user_have_to_select_process_name_and_enter_the_workitem_number_need_to_process() throws IOException {
		FileReader reader =new FileReader("C:\\Users\\ranjith.p\\eclipse-workspace\\NewgenTestAutomation2\\src\\test\\java\\org\\newgen\\test\\automation\\TestData1.properties");
		Properties prop =new Properties();
		prop.load(reader);
		implicitWait();
		initiate=new GtmInitiatePojo();
		frameToBeAvailableAndsSwitchToIt(initiate.getWorkitemframe(), 20);
		elementToBeClickable(initiate.getGtmdropdown(), 20);
		click(initiate.getGtmdropdown());
		defaultContent();
		click(initiate.getGtmoption());
		frameToBeAvailableAndsSwitchToIt(initiate.getWorkitemframe(), 20);
		mouseoverdoubleclick(initiate.getWorkitemno());
		sendkeys(initiate.getWorkitemno(), prop.getProperty("workitemno"));
		click(initiate.getSearchOk());
		defaultContent();
		frameToBeAvailableAndsSwitchToIt(initiate.getNewframe(), 20);
		click(initiate.getWorkitemresult());
		defaultContent();
		implicitWait();
	    numberOfWindowsToBe(2, 10);
		Set<String> window = driver.getWindowHandles();
		List<String> ly = new LinkedList<String>(window);
		driver.switchTo().window(ly.get(1));
		
	    
		
	    
	}

	@When("User have to click the GTM workitem in the my search queue")
	public void user_have_to_click_the_GTM_workitem_in_the_my_search_queue() throws IOException {
		System.out.println("User have selected workitem no in IMO stage and approved it");
	    
	}

	@When("User have to fill the required fields and click approve button")
	public void user_have_to_fill_the_required_fields_and_click_approve_button() throws AWTException, InterruptedException, IOException {
		imo=new GtmImoPojo();
		frameToBeAvailableAndsSwitchToIt(imo.getImoframe(), 20);
		sendkeys(imo.getGtmpsid(), "naveenm");
		tabButton();
		sendkeys(imo.getGtmimocomments1(), "test");
		Thread.sleep(1000);
		click(imo.getGtmimoapprove());
		screenShot("ImoApprove", ".png");
		Thread.sleep(1000);
		click(imo.getGtmapprovefirstok());
		
		
			
			}
	
	@When("User have to fill the required fields")
	public void user_have_to_fill_the_required_fields() throws AWTException, InterruptedException {
		imo=new GtmImoPojo();
		frameToBeAvailableAndsSwitchToIt(imo.getImoframe(), 20);
		selectByIndex(imo.getGtmimostatus(), 3);
		Thread.sleep(1000);
		tabButton();
		sendkeys(imo.getGtmmanagerassigned(), "naveenm - New User");
		tabButton();
		selectByIndex(imo.getGtmimpactedsystem(), 2);
		selectByIndex(imo.getGtmreleasestatus(), 1);
		sendkeys(imo.getGtmfinalstatus(), "test");
		sendkeys(imo.getGtmnewtemplate(), "test");
		sendkeys(imo.getGtminternalcomments(), "test");
	   
	}

	@Then("User have to Submit it")
	public void user_have_to_Submit_it() throws IOException, InterruptedException {
		imo=new GtmImoPojo();
		click(imo.getGtmbuttonsubmit());
		screenShot("ImoSubmit", ".png");
		Thread.sleep(1000);
		click(imo.getGtmapprovefirstok());
	    
	}
	
	@When("User have to be in end stage")
	public void user_have_to_be_in_end_stage() throws IOException {
		frameToBeAvailableAndsSwitchToIt(initiate.getInitatewindowframe(), 20);
		String currentTitle = currentTitle();
		System.out.println(currentTitle);
		String[] split = currentTitle.split(":");
		wi_num = split[0];
		screenShot("endstage",".png");
		System.out.println("User is in"+" "+ wi_num);
	}

}
