package org.newgen.test.automation;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GtmInitiatePojo extends GtmBaseClass {
	public GtmInitiatePojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id ="queueList")
	private WebElement GTMFrame;
	
	@FindBy(xpath ="//label[@title='GTM Initiate']")
	private WebElement GTMInitiate;
	
	@FindBy(xpath ="//iframe[@id='iframe_Int3002']")
	private WebElement workitemframe;
	
	@FindBy(name ="Affected_Countries")
	private WebElement affectedcountries;
	
	@FindBy(name ="product_category")
	private WebElement productcategory;
	
	@FindBy(name ="product_sub_category")
	private WebElement productsubcategory;
	
	@FindBy(name ="Affected_template")
	private WebElement affectedtemplate;
	
	@FindBy(name ="Requested_for")
	private WebElement newtemplate;
	
	@FindBy(name ="Client_segment")
	private WebElement clientsegment;
	
	@FindBy(name ="language_form")
	private WebElement languageform;
	
	@FindBy(name ="Rationale")
	private WebElement productenhancement;
	
	@FindBy(name ="Explanation")
	private WebElement initiatecomment;
	
	@FindBy(id ="Template_name")
	private WebElement template;
	
	public WebElement getInitiatecomment() {
		return initiatecomment;
	}

	public WebElement getNewtemplate() {
		return newtemplate;
	}

	

	public WebElement getAffectedcountries() {
		return affectedcountries;
	}

	public WebElement getProductcategory() {
		return productcategory;
	}

	public WebElement getProductsubcategory() {
		return productsubcategory;
	}

	public WebElement getAffectedtemplate() {
		return affectedtemplate;
	}

	public WebElement getClientsegment() {
		return clientsegment;
	}

	public WebElement getLanguageform() {
		return languageform;
	}

	public WebElement getProductenhancement() {
		return productenhancement;
	}

	public WebElement getTemplate() {
		return template;
	}
	@FindBy(xpath ="(//span[@mid='wlf:processlistopt'])[2]")
	private WebElement gtmdropdown;
	
	@FindBy(xpath ="//span[@title='GTM']")
	private WebElement gtmoption;
	
	@FindBy(xpath ="//iframe[@id='iframe_Int42']")
	private WebElement newframe;
	
	@FindBy(xpath ="//iframe[@id='ngformIframe']")
	private WebElement initatewindowframe;
	
	@FindBy(xpath ="//button[text()=' Submit']")
	private WebElement initiatesubmit;
	
	@FindBy(xpath ="//div[text()='Please attach Final (Clean) Template in word']")
	private WebElement initiatecheckbox;
	
	@FindBy(xpath ="//button[text()='OK']")
	private WebElement initiateok;
	
	@FindBy(xpath ="//div[@id='Documents']")
	private WebElement initiatedocuments;
	
	@FindBy(xpath ="//label[@id='wdesk:idoc']")
	private WebElement initiateaddfrompc;
	
	@FindBy(id ="browsefromPC")
	private WebElement initiatebrowsefrompc;
	
	@FindBy(xpath ="//select[@id='importForm:fileListDataTable:0:dtDocListMenu']")
	private WebElement initiateselectdocument;
	
	@FindBy(xpath ="//label[@id='importForm:BtnOk']")
	private WebElement initiateuploadok;
	
	@FindBy(xpath ="//input[@id='wlf:cmdBtn']")
	private WebElement searchOk;
	
	@FindBy(xpath ="//label[@for='Acknowledge']")
	private WebElement atlastcheckbox;
	
	@FindBy(xpath ="//label[contains(text(),'imported successfully')]")
	private WebElement docsuccessmsg;
	
		
	public WebElement getDocsuccessmsg() {
		return docsuccessmsg;
	}

	public WebElement getAtlastcheckbox() {
		return atlastcheckbox;
	}

	public WebElement getSearchOk() {
		return searchOk;
	}

	public WebElement getInitiatesubmit() {
		return initiatesubmit;
	}

	public WebElement getInitiatecheckbox() {
		return initiatecheckbox;
	}

	public WebElement getInitiateok() {
		return initiateok;
	}

	public WebElement getInitiatedocuments() {
		return initiatedocuments;
	}

	public WebElement getInitiateaddfrompc() {
		return initiateaddfrompc;
	}

	public WebElement getInitiatebrowsefrompc() {
		return initiatebrowsefrompc;
	}

	public WebElement getInitiateselectdocument() {
		return initiateselectdocument;
	}

	public WebElement getInitiateuploadok() {
		return initiateuploadok;
	}

	public WebElement getInitatewindowframe() {
		return initatewindowframe;
	}
	@FindBy(id ="wlf:NewShow")
	private WebElement newbutton;
	
	@FindBy(xpath ="//input[@id='wlf:Prefix']")
	private WebElement workitemno;
	

	@FindBy(xpath ="//img[@id='preferenceForm:queueListDataTable:15:introductionQueue']")
	private WebElement plusbutton;
	
	public WebElement getPlusbutton() {
		return plusbutton;
	}
	
	@FindBy(id ="wlf:cmdBtn")
	private WebElement workitemnoclick;
	
	@FindBy(xpath ="//label[@id='wlf:pnlResult_0_pn']")
	private WebElement workitemresult;
	
	public WebElement getWorkitemno() {
		return workitemno;
	}

	public WebElement getWorkitemnoclick() {
		return workitemnoclick;
	}

	public WebElement getWorkitemresult() {
		return workitemresult;
	}

	public WebElement getNewbutton() {
		return newbutton;
	}

	public WebElement getNewframe() {
		return newframe;
	}
	
	public WebElement getWorkitemframe() {
		return workitemframe;
	}

	public WebElement getGtmdropdown() {
		return gtmdropdown;
	}

	public WebElement getGtmoption() {
		return gtmoption;
	}

	public WebElement getGTMFrame() {
		return GTMFrame;
	}

	public WebElement getGTMInitiate() {
		return GTMInitiate;
	}
	
	
	
}
