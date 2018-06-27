package Hospital_buildings;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Add_buildingsTest {
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
	  driver.findElement(By.xpath("//span[contains(text(),'Hospital Buildings')]")).click();
  }
  @Test
  public void add_buildings() {
	  driver.findElement(By.xpath("//a[@href='/index.php/core/hospitallocation/create']")).click();
	  driver.findElement(By.xpath("//input[@id='Hospitallocation_buidingname']")).sendKeys("jyothi");
	  driver.findElement(By.xpath("//input[@id='Hospitallocation_buildingcode']")).sendKeys("0000");
	  driver.findElement(By.xpath("//input[@class='btn bg-teal']")).click();
  }

}
