package org.newgen.test.automation;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.newgen.configuration.LoginConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.config.Config;

public class GtmStepDefinition extends GtmBaseClass{
	public GtmLoginPojo login;
	public GtmInitiatePojo initiate;
	

	@Given("User have to launch the URL")
	public void user_have_to_launch_the_URL() throws IOException {
		
		FileReader reader =new FileReader("C:\\Users\\ranjith.p\\eclipse-workspace\\NewgenTestAutomation2\\src\\test\\java\\org\\newgen\\test\\automation\\GtmTestData.properties");
		Properties prop =new Properties();
		prop.load(reader);
		chromeBrowser();
		windowsMax();
		urlLaunch(prop.getProperty("SearchTerm"));
		}

	@When("User have to enter valid credientials")
	public void user_have_to_enter_valid_credientials() throws IOException, Throwable {
		
		login=new GtmLoginPojo();
		FileReader reader =new FileReader("C:\\Users\\ranjith.p\\eclipse-workspace\\NewgenTestAutomation2\\src\\test\\java\\org\\newgen\\test\\automation\\GtmTestData.properties");
		Properties prop =new Properties();
		prop.load(reader);
		Thread.sleep(2000);
		sendkeys(login.getUsername(),prop.getProperty("UserName"));
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

	@Then("User should be in homepage")
	public void used_should_be_in_homepage() throws IOException {
		FileReader reader =new FileReader("C:\\Users\\ranjith.p\\eclipse-workspace\\NewgenTestAutomation2\\src\\test\\java\\org\\newgen\\test\\automation\\GtmTestData.properties");
		Properties prop =new Properties();
		prop.load(reader);
		System.out.println(prop.getProperty("homepage"));
	    
	}
	
	@Given("User have to click GTM Initiate option")
	public void user_have_to_click_GTM_Initiate_option() throws InterruptedException, IOException {
		implicitWait();
		initiate=new GtmInitiatePojo();
		frameToBeAvailableAndsSwitchToIt(initiate.getGTMFrame(), 20);
		elementToBeClickable(initiate.getPlusbutton(), 20);
		Thread.sleep(2000);
		click(initiate.getPlusbutton());
		defaultContent();
	    
	}
	@When("User have to get workitem no")
	public void user_have_to_get_workitem_no() throws Throwable {
		Thread.sleep(3000);
		numberOfWindowsToBe(2, 20);
		Set<String> allwindow = driver.getWindowHandles();
		List<String> li = new LinkedList<String>(allwindow);
		driver.switchTo().window(li.get(1));
		frameToBeAvailableAndsSwitchToIt(initiate.getInitatewindowframe(), 20);
		String currentTitle = currentTitle();
		System.out.println(currentTitle);
		String[] split = currentTitle.split(":");
		wi_num = split[1];
		String trim = wi_num.trim();
		System.out.println(trim);
		screenShot("workitemno", ".png");
		
		System.out.println(wi_num);
		writeProperty("C:\\Users\\ranjith.p\\eclipse-workspace\\NewgenTestAutomation2\\src\\test\\java\\org\\newgen\\test\\automation\\TestData1.properties", "workitemno", trim);
		
		
		}
	@When("User have to fill  mandatory fields")
	public void user_have_to_fill_mandatory_fields() throws IOException, InterruptedException {
		initiate=new GtmInitiatePojo();
		 implicitWait();
		 selectByIndex(initiate.getAffectedcountries(),"Japan");
		 selectByValue(initiate.getProductcategory(), "Trade");
		 selectByValue(initiate.getProductsubcategory(), "Open Account Finance");
		 selectByValue(initiate.getAffectedtemplate(), "Country Request");
		 selectByValue(initiate.getNewtemplate(), "New Template");
		 selectByValue(initiate.getClientsegment(), "BB");
		 selectByValue(initiate.getLanguageform(), "English Only");
		 selectByValue(initiate.getProductenhancement(),"Product Enhancement");
		 sendkeys(initiate.getInitiatecomment(), "test comment complites");
		 sendkeys(initiate.getTemplate(), "template");
		 screenShot("InitiateFields",".png");
		 Thread.sleep(2000);
		 click(initiate.getAtlastcheckbox());
	   
	}

	@When("User have to upload  document")
	public void user_have_to_upload_document() throws InterruptedException, IOException {
		implicitWait();
		initiate=new GtmInitiatePojo();
		click(initiate.getInitiatesubmit());
		click(initiate.getInitiateok());
		defaultContent();
		click(initiate.getInitiatedocuments());
		Thread.sleep(1000);
		click(initiate.getInitiateaddfrompc());
		Set<String> parent = driver.getWindowHandles();
		List<String> zi = new LinkedList<String>(parent);
		driver.switchTo().window(zi.get(2));
		sendkeys(initiate.getInitiatebrowsefrompc(),"C:\\Users\\ranjith.p\\Documents\\C6.pdf");
		initiate.getInitiateselectdocument();
		selectByIndex(initiate.getInitiateselectdocument(), "Final (Clean) Template in word");
		Thread.sleep(1000);
		click(initiate.getInitiateuploadok());
		Thread.sleep(3000);
		screenShot("DocumentUpload",".png");
		driver.close();
	    
	}

	@When("User have to submit  document and navigate to parent window")
	public void user_have_to_submit_document_and_navigate_to_parent_window() throws IOException {
		implicitWait();
		Set<String> parent = driver.getWindowHandles();
		List<String> zi = new LinkedList<String>(parent);
		driver.switchTo().window(zi.get(1));
		frameToBeAvailableAndsSwitchToIt(initiate.getInitatewindowframe(), 20);
		click(initiate.getInitiatesubmit());
		click(initiate.getInitiateok());
		
	}

	
	

}
