package org.newgen.test.automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GtmLegalPojo extends GtmBaseClass {
public GtmLegalPojo() {
	PageFactory.initElements(driver, this);
	
}
@FindBy(xpath="(//input[@type='text'])[10]")
private WebElement getPsid;
@FindBy(xpath="(//textarea[@onmouseover='this.title=this.value'])[4]")
private WebElement getExecution;
@FindBy(xpath=("//button[@id='Btn_Save']"))
private WebElement getClick;
@FindBy(xpath="//button[@data-bb-handler='ok']")
private WebElement getSave;

@FindBy(xpath="//iframe[@id='ngformIframe']")
private WebElement frame1;

@FindBy(xpath="//button[@id='Btn_Approve']")
private WebElement legalapprove;

@FindBy(xpath="//button[@data-bb-handler='confirm']")
private WebElement confirmok;


public WebElement getConfirmok() {
	return confirmok;
}
public WebElement getlegalapprove() {
	return legalapprove;
}
public WebElement getFrame1() {
	return frame1;
}
public WebElement getGetPsid() {
return getPsid;
}
public WebElement getGetExecution() {
return getExecution;
}
public WebElement getGetClick() {
return getClick;
}
public WebElement getGetSave() {
return getSave;
}
}
