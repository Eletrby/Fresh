package POM;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;





public class HomePage {

    WebDriver driver = null;
    Actions action;



    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        action = new Actions(driver);
    }





    public String getURL()
    {
        String url = driver.getCurrentUrl();
        return url;
    }


    public WebElement searchBox()
    {
        return driver.findElement(By.id("searchInput"));
    }
//

    public WebElement searchButton()
    {
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div/div[1]/div[2]/button"));
    }


    public WebElement addtocard(){
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/div/div/div[2]/div[4]/div[2]/div[2]/div[1]/button"));
    }
    public WebElement cartPageButton(){

        return driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div/div[2]/div[1]/div[1]/button"));
    }
    public WebElement plustocard(){
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/div/div/div[2]/div[4]/div[2]/div[2]/div[1]/div/div/button[2]"));
     }

     public WebElement closecart(){
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div[2]/button"));
     }
     public WebElement removeitem(){
        return driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div/div[2]/div[2]/div[2]/div[2]/div/div[3]/button"));
     }
}
