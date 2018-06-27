package Events;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class Add_eventTest {
	WebDriver driver;
  @Test
  public void add_event() throws Exception {
	  driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[12]/a[1]")).click();
	  Thread.sleep(2000);
	 driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[12]/ul[1]/li[2]/a[1]")).click();
	  driver.findElement(By.xpath("")).sendKeys("jyoooo");
	  driver.findElement(By.xpath("//input[@id='Event_event_start']")).click();
	  driver.findElement(By.xpath("//a[@class='ui-state-default'][contains(text(),'15')]")).click();
	  driver.findElement(By.xpath("//button[@type='button'][contains(text(),'Done')]")).click();
	 // driver.findElement(By.xpath("//input[@id='Event_event_end']")).click();
	//  driver.findElement(By.xpath("//a[@class='ui-state-default'][contains(text(),'23')]")).click();
	//  new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"))).selectByVisibleText("Jan");
	  
	//  new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"))).selectByVisibleText("2018");
	  //driver.findElement(By.xpath("//button[@type='button'][contains(text(),'Done')]")).click();
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

}
