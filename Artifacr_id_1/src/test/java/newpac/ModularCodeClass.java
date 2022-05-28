package newpac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ModularCodeClass {
	static String Browser;
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		setBrowser();
		setBrowserConfig();
		runTest();

	}
	public static void setBrowser() {
		Browser="Chrome";

	}
	public static void setBrowserConfig(){
		String projectPathString = System.getProperty("user.dir");
		if(Browser.contains("Chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPathString+"//drivers//chromedriver//chromedriver.exe");
			driver = new ChromeDriver();
		}	

		if(Browser.contains("Firefox")){
			System.setProperty("webdriver.gecko.driver", projectPathString+"//drivers//geckodriver//geckodriver.exe");
			driver= new FirefoxDriver();
		}
	}
	public static void runTest() throws InterruptedException {
		String baseUrl="https://entqaawsm.etenvbiz.com/backend/login";
		//navigate URL
		driver.navigate().to(baseUrl);
		String orignalwindow= driver.getWindowHandle();

		//minimize window

		driver.manage().window().maximize();
		//driver.findElement(By.linkText(null)).click();

		//driver.findElement(By.id("adminloginform-email")).sendKeys("lahoreqa@theentertainerme.com");
		WebElement textbox= driver.findElement(By.id("adminloginform-email"));
		textbox.sendKeys("usmanuat@scargil.guru");
		Thread.sleep(3000);
		WebElement textbox1= driver.findElement(By.id("adminloginform-password"));
		textbox1.sendKeys("Qwerty123");
		Thread.sleep(3000);
		driver.findElement(By.className("btn")).sendKeys(Keys.RETURN);	
		Thread.sleep(3000);
		String baseUrl1 = "https://entqaawsm.etenvbiz.com/backend/wlkeys/index";
		driver.navigate().to(baseUrl1);
		/*	
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		 */
		
		//driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(3000);
		driver.switchTo().window(orignalwindow);
			
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		System.out.println("Congradulation you are successful to automate the application!");
		//driver.close();
		//driver.quit();
	}

}
