package newpac;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.beust.jcommander.Strings;

public class Democlass {

	public static void main(String[] args) {
		
		loginclass();
	}
	public static void loginclass() {
			
		//Set Property for chrome_driver
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Artifacr_id_1\\drivers\\chromedriver\\chromedriver.exe");
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+ "//drivers//chromedriver//chromedriver.exe");
		
		//WebDriver object
		WebDriver driver=new ChromeDriver();
		
		//driver.get("http://google.com");
		String baseUrl="https://www.theentertainerme.com/backend/login";
		//navigate URL
		driver.navigate().to(baseUrl);
		
		//minimize window
		
		driver.manage().window().maximize();
		//driver.findElement(By.linkText(null)).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.findElement(By.id("adminloginform-email")).sendKeys("lahoreqa@theentertainerme.com");
		WebElement textbox= driver.findElement(By.id("adminloginform-email"));
		textbox.sendKeys("lahoreqa@theentertainerme.com");
		WebElement textbox1= driver.findElement(By.id("adminloginform-password"));
		textbox1.sendKeys("qaScargillLahore786");
		//driver.findElement(By.className("btn")).click();
		driver.findElement(By.className("btn")).sendKeys(Keys.RETURN);
		
		//List<WebElement> ListOfElements= driver.findElements(By.xpath("//input"));
		//int count = ListOfElements.size();
		//System.out.println("Count no of elemnts " + count);
		
		//
		String baseUrl1 = "https://www.theentertainerme.com/backend/wlkeys/index";
		driver.navigate().to(baseUrl1);
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		
		//scroll the web page code-scroll down
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,5000)", "");
//		driver.close();
		
		//Thread.sleep(3000);
		//scroll up
		//js.executeScript("window.scrollBy(0,-5000)", "");
		}
		

		
	}

