package pages;

import TestBase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
    @FindBy(id = "ContentPlaceHolder1_txtDepartDate")
    WebElement Date_field;

    @FindBy(xpath="//a[@class='ui-datepicker-next ui-corner-all']/span")
    WebElement next_button_calender;

    @FindBy(id="txtOrigin")
    WebElement Origin_field;

    @FindBy(id="txtDestination")
    WebElement destination_field;

    @FindBy(id="btnBusSearchNew")
    WebElement search_button;

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    public void EnterDate(String date){
        Date_field.click();
        next_button_calender.click();
        driver.findElement(By.xpath("//table//tbody//tr/td/a[contains(text(),"+date+")]")).click();
    }

    public void Enter_Origin(String origin){
        Origin_field.sendKeys(origin);

    }

public void Enter_Destination(String destination){
    destination_field.sendKeys(destination);

}

public void Click_On_Submit(){
    search_button.click();
}





}
