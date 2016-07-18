import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;


public class Adminlogin {

	
	public static void main(String[] args) 
	{
		
      WebDriver Driver=new FirefoxDriver();
      Driver.get("http://webapp.qedgetech.com");
      Driver.manage().window().maximize();
      Driver.findElement(By.id("btnreset")).click();
      Driver.findElement(By.id("username")).sendKeys("admin");
      Driver.findElement(By.name("password")).sendKeys("master");
      Driver.findElement(By.id("ewLoginOptions")).click();
      Driver.findElement(By.id("type3")).click();
      Sleeper.sleepTightInSeconds(3);
      Driver.findElement(By.id("btnsubmit")).click();
	}

}
