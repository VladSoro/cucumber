package example;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleSteps {

    WebDriver driver = new ChromeDriver();

    @After
    public void tearDown() {
        driver.quit();
    }


    @Given("I open wolt homepage")
    public void iAmOnTheWoltHomePage() {
        System.setProperty("webdriver.chrome.driver", "D:\\qa\\chromedriver.exe");
        driver.get("https://wolt.com/lt/ltu");
        driver.manage().window().setSize(new Dimension(1526, 814));
    }


    @When("I see cookie banner")
    public void iSeeCookieBanner() {
        driver.findElement(By.xpath("//html/body/div[5]/div/div/div/button[2]")).isDisplayed();
    }

    @Then("I click 'Accept' button")
    public void iShouldSeeAcceptBtn() throws InterruptedException {
        WebElement AcceptButton = driver.findElement(By.xpath("//html/body/div[5]/div/div/div/button[2]"));
        AcceptButton.click();
        Thread.sleep(1000);
        WebElement WoltBtn =driver.findElement(By.id("lottie"));
        WoltBtn.click();
    }

    @Given("I open wolt homepage and accept cookie")
    public void iAmOnTheWoltHomePageAndAcceptCookie() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\qa\\chromedriver.exe");
        driver.get("https://wolt.com/lt/ltu");
        driver.manage().window().setSize(new Dimension(1526, 814));
        WebElement AcceptButton = driver.findElement(By.xpath("//html/body/div[5]/div/div/div/button[2]"));
        AcceptButton.click();
        Thread.sleep(1000);
    }

    @When("I click wolt banner")
    public void iClickWoltBanner() throws InterruptedException {
        WebElement WoltBtn = driver.findElement(By.cssSelector("#lottie > svg"));
        WoltBtn.isDisplayed();
        WoltBtn.click();
        Thread.sleep(1000);
    }

    @And("I see Home page")
    public void iSeeHomePage() throws InterruptedException {
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Thread.sleep(1000);
    }

    @Then("I expect to see main page")
    public void iSeeMainPage() throws InterruptedException {
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Thread.sleep(1000);
    }

    @When("I click Log in button")
    public void iClickLogInButton() {
        WebElement LoginBtn = driver.findElement(By.cssSelector(".sc-eda0895a-3"));
        LoginBtn.isDisplayed();
        LoginBtn.click();
    }

    @Then("I see 'Create an account or log in' pop-up")
    public void iSeePopUp() throws InterruptedException {
        Thread.sleep(1000);
        WebElement LoginPopup = driver.findElement(By.cssSelector(".sc-b8df2b91-0 > svg"));
        LoginPopup.isDisplayed();
    }

    @When("I close pop-up")
    public void iClosePopUp() {
        WebElement LoginPopup = driver.findElement(By.cssSelector(".sc-b8df2b91-0 > svg"));
        LoginPopup.click();
    }


    @When("I click 'Sign up' button")
    public void iClickSignUpButton() {
        WebElement SignUpBtn = driver.findElement(By.cssSelector(".fHmvvV"));
        SignUpBtn.isDisplayed();
        SignUpBtn.click();
    }

    @When("I input my address")
    public void iInputMyAddress() {
        WebElement InputField = driver.findElement(By.id("front-page-input"));
        InputField.click();
        InputField.sendKeys("Fabijoniskiu g. 3b");
    }

    @And("click 'Enter' button")
    public void clickEnterButton() throws InterruptedException {
        WebElement InputField = driver.findElement(By.id("front-page-input"));
        InputField.sendKeys(Keys.ENTER);
    }

    @Then("I expect to see delivery page")
    public void iExpectToSeeDeliveryPage() throws InterruptedException {
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Thread.sleep(1000);
    }

    @When("I input 'Plovas' in search field")
    public void iInputPlovasInSearchField() throws InterruptedException {
        WebElement SearchField = driver.findElement(By.cssSelector(".sc-87536c87-2"));
        SearchField.click();
        SearchField.sendKeys("plovas");
        SearchField.sendKeys(Keys.ENTER);
        Thread.sleep(1000);

    }

    @And("I select first restorant")
    public void iSelectFirstRestoran() {
        WebElement FirstRestoran = driver.findElement(By.cssSelector(".sc-c6b178e0-0:nth-child(1) .sc-36a7e468-1"));
        FirstRestoran.isDisplayed();
        FirstRestoran.click();
    }

    @Then("I expect to see restaurant menu")
    public void iExpectToSeeRestaurantMenu() throws InterruptedException {
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Thread.sleep(1000);
    }


    @When("I click on the dish")
    public void iClickOnTheDish() {
        WebElement PlovDish = driver.findElement(By.cssSelector(".sc-843d6ebd-1:nth-child(5) .sc-b4dd416a-0:nth-child(2) .sc-979c4fba-1"));
        PlovDish.isDisplayed();
        PlovDish.click();
    }

    @Then("I expect to see order pop-op")
    public void iExpectToSeeOrderPopOp() {
        WebElement AddOrderBtn = driver.findElement(By.cssSelector(".sc-843d6ebd-1:nth-child(1) .sc-b4dd416a-0:nth-child(1) .sc-979c4fba-0"));
        AddOrderBtn.isDisplayed();
        AddOrderBtn.isEnabled();
    }

    @When("I click 'Add order' button")
    public void iClickAddOrderButton() throws InterruptedException {
        WebElement AddOrderBtn = driver.findElement(By.cssSelector(".sc-be417c56-5 > span:nth-child(1)"));
        AddOrderBtn.click();
        Thread.sleep(1000);
    }

    @Then("I expect to see shopping cart")
    public void iExpectToSeeShoppingCart() {
        WebElement ShopCard = driver.findElement(By.cssSelector(".gDxbyT .sc-5f688af-7"));
        ShopCard.click();
    }
}
