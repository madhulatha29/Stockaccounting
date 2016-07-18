import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;


public class Suppliers {

	
	public static void main(String[] args) {
		 WebDriver Driver=new FirefoxDriver();
	      Driver.get("http://webapp.qedgetech.com");
	      Driver.manage().window().maximize();
	      Driver.findElement(By.id("btnreset")).click();
	      Driver.findElement(By.id("username")).sendKeys("admin");
	      Driver.findElement(By.name("password")).sendKeys("master");
	     
	      Driver.findElement(By.id("btnsubmit")).click();
	      Driver.findElement(By.linkText("Suppliers")).click();
	      Driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
	      Sleeper.sleepTightInSeconds(3);
	      Driver.findElement(By.id("x_Supplier_Name")).sendKeys("Madhu");
	      Driver.findElement(By.name("x_Address")).sendKeys("plot no-23,ameerpet");
	      Driver.findElement(By.id("x_City")).sendKeys("Hyderabad");
	      Driver.findElement(By.id("x_Country")).sendKeys("India");
	      Driver.findElement(By.xpath(".//*[@id='x_Contact_Person']")).sendKeys("9876890090");
	      Driver.findElement(By.id("x_Phone_Number")).sendKeys("9035677489");
	      Driver.findElement(By.id("x__Email")).sendKeys("abc@gmail.com");
	      Driver.findElement(By.id("x_Mobile_Number")).sendKeys("784567889");
	      Driver.findElement(By.id("x_Notes")).sendKeys("abc");
	      Driver.findElement(By.id("btnAction")).click();
	      Driver.findElement(By.xpath(".//*[@class='ajs-button btn btn-primary']")).click();
	      Sleeper.sleepTightInSeconds(3);
	      Driver.findElement(By.xpath(".//*[@class='ajs-button btn btn-primary']")).click();
	}

}
