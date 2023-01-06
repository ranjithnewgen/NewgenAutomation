package org.newgen.test.automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GtmBaseClass {
public static WebDriver driver;
public static String wi_num= "";
	
	// Browser launch
		public static WebDriver chromeBrowser() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			return driver;

		}

		// Url launch
		public static void urlLaunch(String url) {
			driver.get(url);

		}

		// Window maximize
		public static void windowsMax() {
			try {
				driver.manage().window().maximize();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		// Get Title
		public static String currentTitle() {
			String title = driver.getTitle();
			return title;

		}

		// SendKeys
		public static void sendkeys(WebElement e, String a) {

			e.sendKeys(a);
		}
		
		//Click
		public static void click(WebElement e) {
			e.click();
			
		}
		
		//Frames By String
		public static void frameString(String value) {
			driver.switchTo().frame(value);
			
		}
		
		//Frames By Index
		public static void farmeIndex(int index) {
			driver.switchTo().frame(index);

		}
		
		//Frames By WebElement
		public static void frameWebelement(WebElement web) {
			driver.switchTo().frame(web);
		}
		
		//Default Content
		public static void defaultContent() {
			driver.switchTo().defaultContent();
			
		}
		
	   
		//Refresh By Navigate
		public static void  navigateRefresh() {
			driver.navigate().refresh();
			
		}
		
		//Select By Value
		public static void selectByValue(WebElement e,String a) {
			Select sel=new Select(e);
			sel.selectByValue(a);
			
		}
		
		//Select By Index
		public static void selectByIndex(WebElement e,int a) {
			Select sel=new Select(e);
			sel.selectByIndex(a);
			
		}
		
		//Select By VisibleText
			public static void selectByIndex(WebElement e,String a) {
				Select sel=new Select(e);
				sel.selectByVisibleText(a);
				
			}
			
	   //Implicit Wait
			public static void implicitWait() {
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				
			}
		
			//To Get Text From The Element
			public static String getTextFromElement(WebElement e) {
				String text = e.getText();
				return text;
				
				
				
			}
			
			//Close
			public static void close() {
				driver.close();
				
			}
			
			//Exit
			public static void exit() {
				driver.quit();
			
			}
			
			
			//Fluent Wait
			public static void fluentWait(int sec, int sec1, WebElement exp) {
				FluentWait<WebDriver> f =new FluentWait<WebDriver>(driver)
						.withTimeout(Duration.ofSeconds(sec)).pollingEvery(Duration.ofSeconds(sec1)).ignoring(Exception.class);
				        f.until(ExpectedConditions.elementToBeClickable(exp));
				
				
			}
			
			//Explicit Wait(elementToBeClickable)
			
			public static void elementToBeClickable(WebElement web,int sec) {
				WebDriverWait wait = new WebDriverWait(driver, sec);
				wait.until(ExpectedConditions.elementToBeClickable(web));
				
			}
			

			//Explicit Wait(frameToBeAvailableAndsSwitchToIt)
			
					public static void frameToBeAvailableAndsSwitchToIt(WebElement web,int sec) {
						WebDriverWait wait = new WebDriverWait(driver, sec);
						wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(web));
						
					}
					
					//Explicit Wait(numberOfWindowsToBe)
					
					public static void numberOfWindowsToBe(int no,int sec) {
						WebDriverWait wait = new WebDriverWait(driver, sec);
						wait.until(ExpectedConditions.numberOfWindowsToBe(no));
						
					}
					
	              //Explicit Wait(elementToBeSelected)
					
					public static void elementToBeSelected(WebElement web,int sec) {
						WebDriverWait wait = new WebDriverWait(driver, sec);
						wait.until(ExpectedConditions.elementToBeSelected(web));
						
					}
					
	            //Explicit Wait(visibilityOfElementLocated)
					
					public static void visibilityOfElementLocated(WebElement web,int sec) {
						WebDriverWait wait = new WebDriverWait(driver, sec);
						wait.until(ExpectedConditions.visibilityOfElementLocated(null));
						
					}
					
	           //Explicit Wait(alertIsPresent)
					
					public static void alertIsPresent(int sec) {
						WebDriverWait wait = new WebDriverWait(driver, sec);
						wait.until(ExpectedConditions.alertIsPresent());
						
					}
					
					
			//Mouse Over (click)
					
					public static void mouseclick(WebElement web) {
						Actions acn	=new Actions(driver);
						acn.click(web);
						
						
					}
					
           //Mouse Over (clickAndHold)
					
					public static void clickAndHold(WebElement web) {
						Actions acn	=new Actions(driver);
						acn.clickAndHold(web).build().perform();
						
						
					}			
					
          //Mouse Over (moveToElement)
					
					public static void moveToElement(WebElement web) {
						Actions acn	=new Actions(driver);
						acn.moveToElement(web).build().perform();
						
						
					}		
					
          //Mouse Over (dragAndDrop)
					
					public static void dragAndDrop(WebElement web,WebElement ele) {
						Actions acn	=new Actions(driver);
						acn.dragAndDrop(web, ele).build().perform();
						
						
					}	
					
          //Mouse Over (contextClick)
					
					public static void contextClick(WebElement web) {
						Actions acn	=new Actions(driver);
						acn.contextClick(web).build().perform();
						
						
					}	
					
					
			          //Mouse Over (release	)
								
								public static void release(WebElement web) {
									Actions acn	=new Actions(driver);
									acn.release(web).build().perform();
									
									
								}
								
                           //Switch to alert and accept
								
								public static void switchToAlertAndAccept() {
									Alert alert = driver.switchTo().alert();
									alert.accept();
									
									
								}
								
                          //Switch to alert and dismiss
								
								public static void switchToAlertAndDismiss() {
									Alert alert = driver.switchTo().alert();
									alert.dismiss();
									
									
								}
								
								 //Robot Class(Enter)
								
								public static void keyPressEnter() throws AWTException {
									Robot rt=new Robot();
									rt.keyPress(KeyEvent.VK_ENTER);
									rt.keyRelease(KeyEvent.VK_ENTER);
									
								}
								
                               //Robot Class(down button)
								
								public static void downButton() throws AWTException {
									Robot rt=new Robot();
									rt.keyPress(KeyEvent.VK_DOWN);
									rt.keyRelease(KeyEvent.VK_DOWN);
									
								}
								
                              //Robot Class(up button)
								
								public static void upButton() throws AWTException {
									Robot rt=new Robot();
									rt.keyPress(KeyEvent.VK_UP);
									rt.keyRelease(KeyEvent.VK_UP);
									
								}
								
                            //Robot Class(shift button)
								
								public static void shiftButton() throws AWTException {
									Robot rt=new Robot();
									rt.keyPress(KeyEvent.VK_SHIFT);
									rt.keyRelease(KeyEvent.VK_SHIFT);
									
								}
								
                             //Robot Class(alt button)
								
								public static void altButton() throws AWTException {
									Robot rt=new Robot();
									rt.keyPress(KeyEvent.VK_ALT);
									rt.keyRelease(KeyEvent.VK_ALT);
									
								}
								
                               //Robot Class(tab button)
								
								public static void tabButton() throws AWTException {
									Robot rt=new Robot();
									rt.keyPress(KeyEvent.VK_TAB);
									rt.keyRelease(KeyEvent.VK_TAB);
									
								}
								
								//Mouse Over (doubleclick)
								
								public static void mouseoverdoubleclick(WebElement e) {
									Actions acn	=new Actions(driver);
									acn.doubleClick(e).perform();
									
								}
								
								//Take Screenshot

								public static void screenShot(String fileName, String extension) throws IOException {
									TakesScreenshot tks = (TakesScreenshot) driver;
								File temp = tks.getScreenshotAs(OutputType.FILE);
								
						        String timestamp = new SimpleDateFormat("yyyy/MM/dd_hh_mm_ss").format(new Date());
				                File perm = new File("C:\\Users\\ranjith.p\\eclipse-workspace\\NewgenTestAutomation2\\target\\Screenshot\\" + fileName+" "+timestamp+extension);
				                FileUtils.copyFile(temp, perm);

								}
								
								public static void writeProperty(String filename,String key,String value) {
						            File f = new File(filename);
						            try {
						                FileInputStream fin = new FileInputStream(f);
						                FileOutputStream fo = new FileOutputStream(f);
						                Properties p = new Properties();
						                p.load(fin);
						                p.setProperty(key,value);
						                p.store(fo,"write a value");
						            } catch (Exception e) {

						                e.printStackTrace();
						            }
						            
						           
						            }
								 public static void writeValueUsingReader(String filename,String key,String value) {
						                File f = new File(filename);
						                try {
						                    FileReader read = new FileReader(f);
						                    FileWriter write = new FileWriter(f);
						                    Properties p = new Properties();
						                    p.load(read);
						                    p.setProperty(key, value);
						                    p.store(write, "write a value");
						                } catch (Exception e) {

						                    e.printStackTrace();
						                }

						     

						        }
								
								
									
									
								}
								
							
                        


