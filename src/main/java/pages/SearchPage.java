package pages;

import TestBase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class SearchPage extends TestBase {

    public void Get_each_Bus_cost() {
        WebElement adult_rate = driver.findElement(By.xpath("//table//tbody//tr//td[5]/div/div[contains(text(),'RM')]"));
        List bus_adult_cost = driver.findElements(By.xpath("//table//tbody//tr//td[5]/div/div[contains(text(),'RM')]"));

        for (int i = 0; i < bus_adult_cost.size() - 1; i++) {
            String[] rate_split = adult_rate.getText().split(" ");
            String rate = rate_split[1];
            Double.parseDouble(rate);
        }

    }

    public void ClickOnBus() {
        driver.findElement(By.xpath("//*[@id='subtab1']/table/tbody/tr[1]/td[6]/a")).click();
    }

    public void get_Availble_seats(String no_of_seats) {
        List seats = driver.findElements(By.xpath("//td//div[@class='seat_available']"));
        int seats_available = seats.size();
        if(seats_available>=6){
            for(int i=0;i<=Integer.parseInt(no_of_seats);i++){
                driver.findElement(By.xpath("//td["+no_of_seats+"]//div[@class='seat_available'][text()='"+no_of_seats+"']")).click();
            }

        }else if(seats_available<6){
            for(int i=1;i<seats.size();i++){
                driver.findElement(By.xpath("//td["+i+"]//div[@class='seat_available'][text()='"+i+"']")).click();


            }

        }

    }
}
