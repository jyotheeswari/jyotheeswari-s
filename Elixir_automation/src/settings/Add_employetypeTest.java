package settings;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Add_employetypeTest {
	WebDriver driver;
  
  @BeforeTest
  public void browser() {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get(" http://demo.elixiraid.com/index.php");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@id='UserLogin_username']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@id='UserLogin_password']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@class='btn bg-teal btn-block']")).click();
	  driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[3]/a[1]")).click();
  }
  @Test(priority=0)
  public void emp() {
	  driver.findElement(By.xpath("//a[@href='/index.php/core/employeetype/create']")).click();
	  driver.findElement(By.xpath("//input[@id='Employeetype_employeetypename']")).sendKeys("ertyu");
	  driver.findElement(By.xpath("//input[@class='btn bg-teal']")).click();
	  
  }
@Test(priority=1)
public void test() {
	driver.findElement(By.xpath("//tr[@class='even']//td[@width='5%']//a[@class='glyphicon glyphicon-remove border-teal-700 text-teal-700']")).click();
	driver.switchTo().alert().accept();
	driver.findElement(By.xpath("//html//tr[1]/td[3]/a[1]")).click();
	driver.findElement(By.xpath("//input[@id='Employeetype_employeetypename']")).sendKeys("abcdfgh");
	driver.findElement(By.xpath("//input[@class='btn bg-teal']")).click();
}
}
