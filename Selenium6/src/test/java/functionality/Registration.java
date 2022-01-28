package functionality;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import object_repository.Elements;

public class Registration {

	@Test
	public void register() throws InterruptedException, AWTException, IOException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1= new ChromeDriver();
		d1.get("http://automationpractice.com/index.php");
		d1.manage().window().maximize();
		
		PageFactory.initElements(d1, Elements.class);
		Elements.login.click();
		Elements.email_create.sendKeys("santoshswain676@gmail.com");
		Elements.SubmitCreate.click();
		Thread.sleep(5000);
		Elements.id_gender.click();
		Elements.customer_firstname.sendKeys("Santosh");
		Elements.customer_lastname.sendKeys("Swain");
		Elements.passwd.sendKeys("Swain@1234");
		Select drop1=new Select(Elements.days);
		drop1.selectByValue("7");
		Select drop2= new Select(Elements.months);
		drop2.selectByValue("1");
		Select drop3= new Select(Elements.years);
		drop3.selectByValue("1998");
		Elements.newsletter.click();
		Elements.optin.click();
		Elements.company.sendKeys("HCL");
		Elements.address1.sendKeys("16 Malcom Dr");
		Elements.address2.sendKeys("Elkhart, Indiana(IN)");
		Elements.city.sendKeys("Elkhart");
		Select drop4= new Select(Elements.id_state);
		drop4.selectByValue("14");
		Elements.postcode.sendKeys("46517");
		Select drop5= new Select(Elements.id_country);
		drop5.selectByValue("21");
		Elements.phone.sendKeys("8458054676");
		Elements.phone_mobile.sendKeys("7787940747");
		Elements.alias.sendKeys("Bhubaneswar");
		Elements.submitAccount.click();
		
		
		Robot robot1=new Robot();
		Dimension sc_size=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect=new Rectangle(sc_size);
		BufferedImage Source=robot1.createScreenCapture(rect);
		File destination=new File("C:\\Users\\santo\\3D Objects\\Pictures\\Camera Roll\\screen4.jpg");
		ImageIO.write(Source, "jpg", destination);
		
		
	}
}
