package NetmedsStage.logintest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 

public class nmstest1 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "e:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=(WebDriver) new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://s1-meds.netmeds.com");
		driver.findElement(By.className("logged")).click();
		//driver.findElement(By.id("loginfirst_mobileno")).sendKeys("9840222580");
		driver.findElement(By.id("loginfirst_mobileno")).sendKeys("9840222580");
		driver.findElement(By.className("btn-signpass")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("login_received_pwd")).sendKeys("test1234");
		driver.findElement(By.className("btn-login")).click();
		driver.findElement(By.className("btn-login")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("asomex");
		//driver.findElement(By.cssSelector(input-text algolia-search-input aa-input)).
		Thread.sleep(1000);
		driver.findElement(By.className("iconSearch")).click();
		driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div/div/ol/li[2]/div/div/div[5]/form/div[1]/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div[4]/a/div/span")).click();
		Thread.sleep(6000);
		//driver.findElement(By.xpath("/html/body/app-root/app-layout/div/main/app-shopping-cart/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/button")).click();
		driver.findElement(By.xpath("//button[@class='btn-checkout btn btn_to_checkout']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='extcheckbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn-checkout btn btn_to_checkout m-0']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='addchangeweb col-md-4 text-right p-0']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='newadd']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-invalid']")).sendKeys("600080");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-touched']")).sendKeys("Aashik");
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='street']")).sendKeys("reddy street korattur");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='landmark']")).sendKeys("KLR clinic");
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@id='mobile_no']")).sendKeys("9840222580");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='addressmodal']")).click();
		//driver.navigate().refresh();
		//Robot robot = new Robot();
		//robot.keyPress(KeyEvent.VK_F5);
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[@class='btn-checkout btn btn_to_checkout m-0']")).click();
		//driver.findElement(By.xpath("//input[@id='nms_cod']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@class='nmsmstrpayradio']")).click();
		driver.findElement(By.xpath("//button[@class='btn-checkout btn btn_to_checkout m-0']")).click();
		
		}

}
