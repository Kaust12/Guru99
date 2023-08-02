package StepDefination;

import java.util.List;

import BaseLayer.BaseClass;
import PageLayer.RegisterPageClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RegisterPageStepDef extends BaseClass{

	RegisterPageClass reg;

@Given("User open register page url on {string} browser")
public void user_open_register_page_url_on_browser(String browsername) {
   
	initializaton(browsername);
}

  List<List<String>> ls;
@Then("User enter Firstname lastname phone email")
public void user_enter_firstname_lastname_phone_email(DataTable dataTable) {
	ls=dataTable.asLists();
	 
	String Firstname =ls.get(0).get(0);
	String Lastname =ls.get(0).get(1);
	String Phonenum =ls.get(0).get(2);
	String email =ls.get(0).get(3);
	
	 reg=new RegisterPageClass();
	  reg.ContactinfoFunctionality(Firstname, Lastname, Phonenum, email);
	
	
}

@Then("user enters address city state pincode and country")
public void user_enters_address_city_state_pincode_and_country(DataTable dataTable) {
   
	ls=dataTable.asLists();
	 
	String ADDRESS =ls.get(0).get(0);
	String CITY =ls.get(0).get(1);
	String STATE =ls.get(0).get(2);
	String PINCODE =ls.get(0).get(3);
	String COUNTRY =ls.get(0).get(4);
	
	reg.mailingFunctionality(ADDRESS, CITY, STATE, PINCODE, COUNTRY);
}

@Then("User enter username and password and confirm password and click on submit button")
public void user_enter_username_and_password_and_confirm_password_and_click_on_submit_button(DataTable dataTable) {

	ls=dataTable.asLists();
	 
	String USERNAME =ls.get(0).get(0);
	String PASSWORD =ls.get(0).get(1);
	String CONFIRMPASS =ls.get(0).get(2);
	
	reg.userInfoFunctionality(USERNAME, PASSWORD, CONFIRMPASS);
	
}
	
	
}
