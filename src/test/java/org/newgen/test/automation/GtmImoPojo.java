package org.newgen.test.automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GtmImoPojo extends GtmBaseClass {
	public GtmImoPojo() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='GTM_Manager_PSID']")
	private WebElement gtmpsid;
	
	@FindBy(xpath="//iframe[@id='ngformIframe']")
	private WebElement imoframe;
	
	public WebElement getImoframe() {
		return imoframe;
	}

	@FindBy(xpath="//textarea[@id='Legal_approver_comments']")
	private WebElement gtmimocomments;
	
	@FindBy(id="Btn_Approve")
	private WebElement gtmimoapprove;
	
	@FindBy(id="Btn_Escalate")
	private WebElement gtmimoexclate;
	
	@FindBy(xpath="//select[@id='GTM_status']")
	private WebElement gtmimostatus;
 
	@FindBy(xpath="//input[@id='GTM_manager_assigned']")
	private WebElement gtmmanagerassigned;
	
	@FindBy(xpath="//select[@name='impacted_systems']")
	private WebElement gtmimpactedsystem;
	
	@FindBy(xpath="//select[@id='release_status']")
	private WebElement gtmreleasestatus;
	
	@FindBy(xpath="//input[@id='FinalTemplatename']")
	private WebElement gtmfinalstatus;
	
	@FindBy(xpath="//textarea[@id='link_to_new_template']")
	private WebElement gtmnewtemplate;
	
	@FindBy(xpath="//textarea[@id='internal_comments']")
	private WebElement gtminternalcomments;
	
	@FindBy(xpath="//button[@id='Btn_Submit']")
	private WebElement gtmbuttonsubmit;
	
	@FindBy(xpath="//button[@class='btn buttonStyle']")
	private WebElement gtmok;
	
	@FindBy(xpath="//textarea[@id='GTM_IMO_comments']")
	private WebElement gtmimocomments1;
	
	public WebElement getGtmimocomments1() {
		return gtmimocomments1;
	}

	@FindBy(xpath="//button[@data-bb-handler='confirm']")
	private WebElement gtmapprovefirstok;
	

	public WebElement getGtmapprovefirstok() {
		return gtmapprovefirstok;
	}

	public WebElement getGtmpsid() {
		return gtmpsid;
	}

	public WebElement getGtmimocomments() {
		return gtmimocomments;
	}

	public WebElement getGtmimoapprove() {
		return gtmimoapprove;
	}

	public WebElement getGtmimoexclate() {
		return gtmimoexclate;
	}

	public WebElement getGtmimostatus() {
		return gtmimostatus;
	}

	public WebElement getGtmmanagerassigned() {
		return gtmmanagerassigned;
	}

	public WebElement getGtmimpactedsystem() {
		return gtmimpactedsystem;
	}

	public WebElement getGtmreleasestatus() {
		return gtmreleasestatus;
	}

	public WebElement getGtmfinalstatus() {
		return gtmfinalstatus;
	}

	public WebElement getGtmnewtemplate() {
		return gtmnewtemplate;
	}

	public WebElement getGtminternalcomments() {
		return gtminternalcomments;
	}

	public WebElement getGtmbuttonsubmit() {
		return gtmbuttonsubmit;
	}

	public WebElement getGtmok() {
		return gtmok;
	}
}
