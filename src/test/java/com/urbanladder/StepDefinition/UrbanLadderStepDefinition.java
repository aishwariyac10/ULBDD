package com.urbanladder.StepDefinition;

import org.openqa.selenium.WebDriver;

import com.urbanladder.ReusableComponents.ReusableMethods;
import com.urbanladder.ReusableComponents.WebDriverHelper;
import com.urbanladder.pageobject.CheckoutPage;
import com.urbanladder.pageobject.Footer;
import com.urbanladder.pageobject.GiftCardsPage;
import com.urbanladder.pageobject.Header;
import com.urbanladder.pageobject.LoginPage;
import com.urbanladder.pageobject.ProductPage;
import com.urbanladder.pageobject.SearchPage;
import com.urbanladder.pageobject.SignUpPage;
import com.urbanladder.pageobject.StorePage;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UrbanLadderStepDefinition {
	//VARIABLES
	WebDriver driver;
	String title;
	Boolean flag;
	
	//BACKGROUND
	@Given("^A windows system$")
    public void a_windows_system() throws Throwable {
		System.out.println("Starting Pre-Test Setup");
    }
	
    @When("^I initialize Browser$")
    public void i_initialize_browser() throws Throwable {
    	driver = WebDriverHelper.initializeDriver();
    }
    
    @And("^enter URL$")
    public void enter_url() throws Throwable {
    	ReusableMethods.getURL(driver);
    }
    
    @Then("^WebPage should be Open$")
    public void webpage_should_be_open() throws Throwable {
    	title = ReusableMethods.getTitle(driver);
    	System.out.println(title);
    }
    //-----------------------------------------------------------------
    
  //SIGN UP
    @Given("^user is on Home page$")
    public void user_is_on_home_page() throws Throwable {
    	flag = Header.getHomePage(driver);
    }

    @When("^user clicks on sign up$")
    public void user_clicks_on_sign_up() throws Throwable {
    	flag = Header.getWishList(driver);
    }

    @And("^user enters email and password and hits the Sign Up button$")
    public void user_enters_email_and_password_and_hits_the_sign_up_button() throws Throwable {
    	flag = SignUpPage.getSignUp(driver);
    }

    @Then("^redirect to LoginPage$")
    public void redirect_to_LoginPage() throws Throwable {
    	flag = SignUpPage.clickLogin(driver);
    }
    
    //-----------------------------------------------------------
    
    //LOGIN PAGE
    @Given("^user is on LoginPage$")
    public void user_is_on_loginpage() throws Throwable {
       flag = Header.getLoginPage(driver);
    }

    @When("^user enters email and password and hits the Log In button$")
    public void user_enters_email_and_password_and_hits_the_log_in_button() throws Throwable {
       flag = LoginPage.getLogin(driver);
    }

    @Then("^redirect to Home page$")
    public void redirect_to_home_page() throws Throwable {
       
    }
    //-----------------------------------------------------------------
    
    //HEADER HELP
    @When("^user clicks on Help from the header$")
    public void user_clicks_on_Help_from_the_header() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	flag = Header.getHelp(driver);
    }

    @Then("^direct to FAQ page$")
    public void direct_to_FAQ_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	title = ReusableMethods.getTitle(driver);
    	System.out.println(title);
    }
    //-------------------------------------------------------------------
    
    //HEADER LISTS
    @When("^user hover over Sale and clicks on Deals of the Week$")
    public void user_hover_over_Sale_and_clicks_on_Deals_of_the_Week() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        flag = Header.getSale(driver);
    }

    @Then("^direct to Deals of the Week page$")
    public void direct_to_Deals_of_the_Week_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        title = ReusableMethods.getTitle(driver);
        System.out.println(title);
    }

    @When("^user hover over Living and clicks on Sofa Set$")
    public void user_hover_over_Living_and_clicks_on_Sofa_Set() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        flag = Header.getLiving(driver);
    }

    @Then("^direct to Sofa Set page$")
    public void direct_to_Sofa_Set_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	title = ReusableMethods.getTitle(driver);
        System.out.println(title);
    }

    @When("^user hover over Bedroom and clicks on Beds$")
    public void user_hover_over_Bedroom_and_clicks_on_Beds() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        flag = Header.getBedroom(driver);
    }

    @Then("^direct to Beds page$")
    public void direct_to_Beds_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	title = ReusableMethods.getTitle(driver);
        System.out.println(title);
    }
    //---------------------------------------------------------------------
    
    //SEARCH BOX
    @When("^user types for (.+) in searchbox and clicks Search$")
    public void user_types_for_in_searchbox_and_clicks_Search(String product) throws Throwable {
        flag = SearchPage.search(driver, product);
    }

    @Then("^direct to search results page$")
    public void direct_to_search_results_page() throws Throwable {
        title = ReusableMethods.getTitle(driver);
        System.out.println(title);
    }
    //----------------------------------------------------------------------
    
    //SELECT PRODUCT
    @Given("^user is on Search Page$")
    public void user_is_on_search_page() throws Throwable {
    	flag = Header.getLoginPage(driver);
    	flag = LoginPage.getLogin(driver);
        flag = SearchPage.search(driver, "Sofa");
    }

    @When("^clicks on the product$")
    public void clicks_on_the_product() throws Throwable {
        flag = SearchPage.getProduct(driver);
    }
    
    @Then("^open the product page$")
    public void open_the_product_page() throws Throwable {
        title = ReusableMethods.getTitle(driver);
    }
    
    @And("^the name, price, pin and delivery date is displayed$")
    public void the_name_price_pin_and_delivery_date_is_displayed() throws Throwable {
        flag = ProductPage.getProductName(driver);
        flag = ProductPage.getPrice(driver);
        flag = ProductPage.getPincode(driver);
        flag = ProductPage.getDeliveryDate(driver);
    }

    @When("^user clicks on Add to cart button$")
    public void user_clicks_on_add_to_cart_button() throws Throwable {
        flag = ProductPage.getAddToCart(driver);
    }

    @Then("^display the cart$")
    public void display_the_cart() throws Throwable {
        title = ReusableMethods.getTitle(driver);
        System.out.println(title);
    }
    //------------------------------------------------------------------
    
    //CHECKOUT
    @Given("^user is on Cart$")
    public void user_is_on_cart() throws Throwable {
    	flag = Header.getLoginPage(driver);
    	flag = LoginPage.getLogin(driver);
    	flag = Header.getCart(driver);
    }

    @When("^user clicks on Checkout button$")
    public void user_clicks_on_checkout_button() throws Throwable {
        CheckoutPage.getClickCheckout(driver);
    }

    @And("^enters Details$")
    public void enters_details() throws Throwable {
        CheckoutPage.getDetails(driver);
    }

    @And("^Clicks Save$")
    public void clicks_save() throws Throwable {
        CheckoutPage.getSave(driver);  
    }

    @Then("^display the payment page$")
    public void display_the_payment_page() throws Throwable {
        title = ReusableMethods.getTitle(driver);
        System.out.println(title);
    }
    //------------------------------------------------------------
    
    //STORES
    @When("^user clicks on Stores button from header$")
    public void user_clicks_on_stores_button_from_header() throws Throwable {
        flag = Header.getStoreButton(driver);
    }

    @When("^user clicks on a particular location$")
    public void user_clicks_on_a_particular_location() throws Throwable {
        flag = StorePage.getStores(driver);
    }

    @Then("^display the Stores page$")
    public void display_the_stores_page() throws Throwable {
        title = ReusableMethods.getTitle(driver);
    }

    @Then("^print the address$")
    public void print_the_address() throws Throwable {
        flag = StorePage.getStoreAddress(driver);
    }
    //----------------------------------------------------------
    
    //GIFT CARDS
    @When("^user clicks on Gift Cards button from header$")
    public void user_clicks_on_gift_cards_button_from_header() throws Throwable {
        flag = Header.getGiftButton(driver);
    }

    @Then("^display the Gift Cards page$")
    public void display_the_gift_cards_page() throws Throwable {
        flag = GiftCardsPage.verifyTitle(driver);
    }
    //----------------------------------------------------------
    
    //APP DOWNLOAD
    @When("^user clicks on Download app button for (.+)$")
    public void user_clicks_on_download_app_button_for(String store) throws Throwable {
        if(store.equals("apple")) {
        	flag = Footer.getAppStore(driver);
        }
        else if(store.equals("google")) {
        	flag = Footer.getPlayStore(driver);
        }
    }

    @Then("^direct to the download page$")
    public void direct_to_the_download_page() throws Throwable {
        
    }
    
    @After
    public void quit() {
    	try {
    	driver.quit();
    	}
    	catch(Exception e) {
    		System.out.println("Window Already Closed");
    	}
    }




}
