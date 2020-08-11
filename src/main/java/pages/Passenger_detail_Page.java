package pages;

import TestBase.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Passenger_detail_Page extends TestBase {

    @FindBy(id="ContentPlaceHolder1_txtName")
    WebElement Namefield;

    @FindBy(id="ContentPlaceHolder1_txtPhone")
    WebElement phone_Number_Field;

    @FindBy(id="ContentPlaceHolder1_txtEmail")
    WebElement email_field;

    @FindBy(id="ContentPlaceHolder1_txtEmail1")
    WebElement ReEnter_email;

    @FindBy(id="ContentPlaceHolder1_btnProceedPayment")
    WebElement proceed_button;

    public Passenger_detail_Page(){
        PageFactory.initElements(driver,this);
    }

    public void Enter_Passenger_details(String name,String number,String email){
        Namefield.sendKeys();
        phone_Number_Field.sendKeys();
        email_field.sendKeys();
        ReEnter_email.sendKeys();



    }

    public void CLick_On_Proceed_Button(){
        proceed_button.click();
        }

public String alert_messa(){Alert alert=driver.switchTo().alert(); return alert.getText();
}



}
