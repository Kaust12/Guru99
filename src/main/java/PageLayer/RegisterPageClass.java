package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static UtilityLayer.UtilsClass.*;

import BaseLayer.BaseClass;

public class RegisterPageClass extends BaseClass{

	@FindBy(name="firstName")
    private WebElement fname;
    
    @FindBy(name="lastName")
    private WebElement lname;
    
    @FindBy(name="phone")
    private WebElement phone; 
    
    @FindBy(name="userName")
    private WebElement email;
    
    @FindBy(name="address1")
    private WebElement addr;
    
    @FindBy(name="city")
    private WebElement City;
    
    @FindBy(name="state")
    private WebElement State;
    
    @FindBy(name="postalCode")
    private WebElement PostalCode;
    
    @FindBy(name="country")
    private WebElement Country;
    
    @FindBy(name="email")
    private WebElement Username ;
    
    @FindBy(name="password")
    private WebElement Password ;
    
    @FindBy(name="confirmPassword")
    private WebElement confirmpass;
    
    @FindBy(name="submit")
    private WebElement SumbitBtn;
    
     
    public RegisterPageClass()
    {
    	PageFactory.initElements(driver,this);
    }
    
    public void ContactinfoFunctionality(String Fname,String Lname,String Phone,String Email)
    {
    	sendKey(fname,Fname);
    	sendKey(lname,Lname);
    	sendKey(phone,Phone);
        sendKey(email,Email);
    }
    
    public void mailingFunctionality(String Addr,String cty,String state,String pin,String cntry)
    {
    	sendKey(addr,Addr);
    	sendKey(City,cty);
    	sendKey(State,state);
        sendKey(PostalCode,pin);
        selectByVisibleText(Country,cntry);
    }
    
    public void userInfoFunctionality(String uname,String Pass,String Cpass)
    {
    	sendKey(Username,uname);
    	sendKey(Password,Pass);
    	sendKey(confirmpass,Cpass);
    	click(SumbitBtn);
        
    }
    
    
}
