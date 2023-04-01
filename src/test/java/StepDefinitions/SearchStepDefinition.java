package StepDefinitions;

import POM.HomePage;
import POM.SearchPage;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.io.FileNotFoundException;

import static StepDefinitions.Hooks.driver;


public class SearchStepDefinition {

    HomePage home = new HomePage(driver);

    SearchPage search = new SearchPage(driver);


    @And("user enter name of product at search box")
    public void searchOnProduct() throws InterruptedException {
        Thread.sleep(3000);
        home.searchBox().click();
        home.searchBox().sendKeys("Fresh Ice Box 8 liter");
    }

    @And("user click on search")
    public void clickSearchButton()
    {
        home.searchBox().sendKeys(Keys.ENTER);
    }

    @Then("user could see the product displayed")
    public void productIsDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        boolean expectedResult = search.firstproduct().isDisplayed();
        Assert.assertEquals(expectedResult, true);
    }
    @And("user select first product")
    public void selectproduct(){
        search.firstproduct().click();
    }
    @And("user check the price after discount")
    public void displaypriceAfter() throws InterruptedException {
        Thread.sleep(4000);
        boolean expectedResult = search.priceAfter().isDisplayed();
        Assert.assertEquals(expectedResult, true);
    }
    @And("user check the price before discount")
    public void displaypriceBefore(){
        boolean expectedResult = search.priceBefore().isDisplayed();
        Assert.assertEquals(expectedResult, true);
    }
    @And("user add three item to cart")
    public void addtocart() throws InterruptedException {
        home.searchBox().click();
        home.searchBox().sendKeys("Fresh Ice Box 8 liter");
        home.searchBox().sendKeys(Keys.ENTER);
        Thread.sleep(4000);
        home.addtocard().click();
        Thread.sleep(5000);
        home.closecart().click();
        home.plustocard().click();
        home.plustocard().click();

    }
    @And("user can remove item from cart")
    public void Removecart() throws InterruptedException {
        home.cartPageButton().click();
        Thread.sleep(1000);
        home.removeitem().click();
    }


}
