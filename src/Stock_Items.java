import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;


public class Stock_Items {

	
	public static void main(String[] args) {
		 WebDriver Driver=new FirefoxDriver();
	      Driver.get("http://webapp.qedgetech.com");
	      Driver.manage().window().maximize();
	      Driver.findElement(By.id("btnreset")).click();
	      Driver.findElement(By.id("username")).sendKeys("admin");
	      Driver.findElement(By.name("password")).sendKeys("master");
	     
	      Driver.findElement(By.id("btnsubmit")).click();
	     Actions Act=new Actions(Driver);
	     Act.moveToElement(Driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
	     Driver.findElement(By.linkText("Stock Categories")).click();
	     Sleeper.sleepTightInSeconds(3);
	     Driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
	     Driver.findElement(By.id("x_Category_Name")).sendKeys("Pens");
	     Driver.findElement(By.id("btnAction")).click();
	     Sleeper.sleepTightInSeconds(3);
	     Driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
	     Sleeper.sleepTightInSeconds(3);
	     Driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
	    
	     Sleeper.sleepTightInSeconds(3);
	     Act.moveToElement(Driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
	     Sleeper.sleepTightInSeconds(3);
	     Driver.findElement(By.linkText("Unit of Measurement")).click();
	     Sleeper.sleepTightInSeconds(3);
	     Driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
	     Driver.findElement(By.id("x_UOM_ID")).sendKeys("U29");
	     Driver.findElement(By.id("x_UOM_Description")).sendKeys("Description");
	     Driver.findElement(By.id("btnAction")).click();
	     Sleeper.sleepTightInSeconds(3);
	     Driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
	     Sleeper.sleepTightInSeconds(3);
	     Driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
	     
	}

}
