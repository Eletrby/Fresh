package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {

    WebDriver driver = null;

    public SearchPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public WebElement firstproduct()
    {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/div/div/div[2]/div[4]/div[1]/a"));
    }

    public WebElement priceAfter(){
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div[1]/div[2]/div[1]/span[1]"));
    }

    public WebElement priceBefore(){
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div[1]/div[2]/div[1]/span[2]"));
    }


}
