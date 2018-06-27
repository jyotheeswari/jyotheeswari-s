package settings;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Staff_importTest {
	WebDriver driver;
  @Test(priority=0)
  public void staff_import() throws  Exception {
	  driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[3]/a[1]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//a[@href='/index.php/site/staffimport']")).click();
	  driver.findElement(By.xpath("//input[@id='ContactForm_filea']")).click();
	  Runtime.getRuntime().exec("C:\\Users\\admin\\Desktop\\staff.exe");
	  driver.findElement(By.xpath("//input[@class='btn bg-teal']")).click();
	  
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
  public void download() {
	  driver.findElement(By.xpath("//a[@href='/img/staff_import.xlsx']")).click();
  }

}
