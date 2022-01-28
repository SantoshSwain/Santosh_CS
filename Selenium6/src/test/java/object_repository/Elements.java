package object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Elements {
	
	@FindBy(className="login")
	public static WebElement login;

	@FindBy(id="email_create")
	public static WebElement email_create;
	
	@FindBy(id="SubmitCreate")
	public static WebElement SubmitCreate;
	
	@FindBy(name="id_gender")
	public static WebElement id_gender;
	
	@FindBy(id="customer_firstname")
	public static WebElement customer_firstname;
	
	@FindBy(id="customer_lastname")
	public static WebElement customer_lastname;
	
	@FindBy(name="passwd")
	public static WebElement passwd;
	
	@FindBy(id="days")
	public static WebElement days;
	
	@FindBy(id="months")
	public static WebElement months;
	
	@FindBy(id="years")
	public static WebElement years;
	
	@FindBy(id="newsletter")
	public static WebElement newsletter;
	
	@FindBy(id="optin")
	public static WebElement optin;
	
	@FindBy(name="firstname")
	public static WebElement firstname;
	
	@FindBy(name="lastname")
	public static WebElement lastname;
	
	@FindBy(name="company")
	public static WebElement company;
	
	@FindBy(name="address1")
	public static WebElement address1;
	
	@FindBy(name="address2")
	public static WebElement address2;
	
	@FindBy(name="city")
	public static WebElement city;
	
	@FindBy(name="id_state")
	public static WebElement id_state;
	
	@FindBy(name="postcode")
	public static WebElement postcode;
	
	@FindBy(name="id_country")
	public static WebElement id_country;
	
	@FindBy(id="phone")
	public static WebElement phone;
	
	@FindBy(id="phone_mobile")
	public static WebElement phone_mobile;
	
	@FindBy(id="alias")
	public static WebElement alias;
	
	@FindBy(id="submitAccount")
	public static WebElement submitAccount;
	
	@FindBy(id="email")
	public static WebElement email;
	
	@FindBy(id="SubmitLogin")
	public static WebElement SubmitLogin;
	
	@FindBy(id="search_query_top")
	public static WebElement search_query_top;
	
	@FindBy(name="submit_search")
	public static WebElement submit_search;
	
	@FindBy(className="availability")
	public static WebElement availability;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")
	public static WebElement Dress;
	
	@FindBy(xpath="//*[@id=\"add_to_cart\"]/button/span")
	public static WebElement AddToCart;
	
}
