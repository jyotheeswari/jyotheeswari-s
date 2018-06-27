package Hospital_buildings;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class Add_floorTest {
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
  public void add_floor() {
	  driver.findElement(By.xpath("//a[@href='/index.php/core/buildingfloor/create']")).click();
	  driver.findElement(By.xpath("//input[@id='Buildingfloor_floorname']")).sendKeys("leap carrer ");
	  driver.findElement(By.xpath("//input[@id='Buildingfloor_floorccode']")).sendKeys("2331");
	  new Select(driver.findElement(By.xpath("//select[@id='Buildingfloor_hospitallocationid']"))).selectByVisibleText("jyothi");
	  driver.findElement(By.xpath("//input[@class='btn bg-teal']")).click();
  }

}
