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
import org.testng.annotations.Test;

import object_repository.Elements;

public class login {
	
	@Test 
	public void login_fn() throws IOException, AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1= new ChromeDriver();
		d1.get("http://automationpractice.com/index.php");
		d1.manage().window().maximize();
		
		PageFactory.initElements(d1, Elements.class);
		Elements.login.click();
		Elements.email.sendKeys("santoshswain676@gmail.com");
		Elements.passwd.sendKeys("Swain@1234");
		Elements.SubmitLogin.click();
		Elements.search_query_top.sendKeys("dress");
		Elements.submit_search.click();
		Elements.Dress.click();
		Elements.AddToCart.click();
		
		
	Robot robot1=new Robot();
	Dimension sc_size=Toolkit.getDefaultToolkit().getScreenSize();
	Rectangle rect=new Rectangle(sc_size);
	BufferedImage Source=robot1.createScreenCapture(rect);
	File destination=new File("C:\\Users\\santo\\3D Objects\\Pictures\\Camera Roll\\screen5.jpg");
	ImageIO.write(Source, "jpg", destination);
 }

}
