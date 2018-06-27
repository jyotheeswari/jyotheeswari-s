package settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import com.sun.org.apache.bcel.internal.generic.Select;

public class Hospital_registrationTest {
	WebDriver driver;
  @Test(priority=0)
  public void register() throws Exception {
	  
	  driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[3]/a[1]")).click();
	  driver.findElement(By.xpath("//a[@href='/index.php/core/hospitalregistration/create']")).click();
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_hospital_code']")).clear();
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_hospital_code']")).sendKeys("12345");
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_hospitalname']")).clear();
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_hospitalname']")).sendKeys(" hospital");
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_address']")).clear();
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_address']")).sendKeys("1-74 krish");
	  new Select(driver.findElement(By.xpath("//select[@id='Hospitalregistration_yearofestablishment']"))).selectByVisibleText("2011");
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_country']")).clear();
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_country']")).sendKeys("India");
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_state']")).clear();
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_state']")).sendKeys("AP");
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_phone']")).clear();
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_phone']")).sendKeys("7997617555");
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_email']")).clear();
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_email']")).sendKeys("jyo.surampalli90@gmail.com");
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_fax']")).clear();
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_fax']")).sendKeys("1234578");
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_noofbuildings']")).clear();
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_noofbuildings']")).sendKeys("5");
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_contactperson']")).clear();
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_contactperson']")).sendKeys("jyothisuram");
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_promotedby']")).clear();
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_promotedby']")).sendKeys("luckyjyo");
	  
	 
  }
  @BeforeTest
  public void browser() {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get(" http://demo.elixiraid.com/index.php");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@id='UserLogin_username']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@id='UserLogin_password']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@class='btn bg-teal btn-block']")).click();
	 
  }
  @Test(priority=1)
  public void upload() throws Exception {
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[6]/div[2]/div[1]/input[2]")).click();
	  Runtime.getRuntime().exec("C:\\Users\\admin\\Desktop\\upload.exe");
	  driver.findElement(By.xpath("//button[@class='btn bg-teal']")).click();
	  
	  
  }
  
}
