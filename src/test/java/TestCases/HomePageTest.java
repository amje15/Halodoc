package TestCases;

import TestBase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.Passenger_detail_Page;
import pages.SearchPage;

public class HomePageTest extends TestBase {
    HomePage homepage;
    SearchPage searchpage;
    Passenger_detail_Page passenger_detail_page;

    HomePageTest(){
        super();
    }

    @BeforeClass
    public void Setup_Test(){
        initialise();
        homepage=new HomePage();

    }

    @Test(priority=1)
  @Parameters({"date","origin","destination"})
    public void Search_bus(String date,String origin,String destination) {
        homepage.EnterDate(date);
        homepage.Enter_Origin(origin);
        homepage.Enter_Destination(destination);
        homepage.Click_On_Submit();
    }

    @Test(priority=2)
    public void SelectBusTest() {
        searchpage = new SearchPage();
        searchpage.Get_each_Bus_cost();
        searchpage.ClickOnBus();
        searchpage.get_Availble_seats("4");


    }

    @Test(priority=3)
    @Parameters({"name","number","email"})
    public void Validate_PassengerDetail_Message(String name,String number,String email){
        passenger_detail_page=new Passenger_detail_Page();
        passenger_detail_page.Enter_Passenger_details(name,number,email);
        passenger_detail_page.CLick_On_Proceed_Button();
        Assert.assertTrue(passenger_detail_page.alert_messa().contains("Please select a payment method"));




    }
    }











