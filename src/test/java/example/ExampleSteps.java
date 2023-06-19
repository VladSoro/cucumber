package example;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Instant;
import java.util.Set;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;
import static org.testng.AssertJUnit.assertTrue;

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
        WebElement WoltBtn = driver.findElement(By.id("lottie"));
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
        WebElement LoginBtn = driver.findElement(By.cssSelector(".sc-dde337d6-1 > .cb_TextButton_rootCss_r1vfusel"));
        LoginBtn.isDisplayed();
        LoginBtn.click();
    }

    @Then("I expect to see 'Create an account or log in' pop-up")
    public void iSeePopUp() throws InterruptedException {
        Thread.sleep(1000);
        WebElement LoginPopup = driver.findElement(By.cssSelector(".cb_IconButton_bg_b1nm3q3d"));
        LoginPopup.isDisplayed();
    }

    @When("I close pop-up")
    public void iClosePopUp() {
        WebElement LoginPopup = driver.findElement(By.cssSelector(".cb_IconButton_bg_b1nm3q3d"));
        LoginPopup.click();
    }


    @When("I click 'Sign up' button")
    public void iClickSignUpButton() {
        WebElement SignUpBtn = driver.findElement(By.cssSelector(".cb_Button_content_c1dloej8"));
        SignUpBtn.isDisplayed();
        SignUpBtn.click();
    }

    @When("I input my address")
    public void iInputMyAddress() throws InterruptedException {
        WebElement InputField = driver.findElement(By.id("front-page-input"));
        InputField.click();
        InputField.sendKeys("Fabijoniskiu g. 3b");
        InputField.sendKeys(Keys.ENTER);
    }


    @Then("I expect to see delivery page")
    public void iExpectToSeeDeliveryPage() throws InterruptedException {
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Thread.sleep(1000);
    }

    @When("I input 'Ugruzina by Azerai' in search field")
    public void iInputPlovasInSearchField() throws InterruptedException {
        WebElement SearchField = driver.findElement(By.cssSelector(".sc-87536c87-2"));
        SearchField.click();
        SearchField.sendKeys("Ugruzina by Azerai");
        SearchField.sendKeys(Keys.ENTER);
        Thread.sleep(1000);

    }

    @And("I select first restorant")
    public void iSelectFirstRestoran() {
        WebElement FirstRestoran = driver.findElement(By.xpath("//a/div/div/div/div/div[2]"));
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
    public void iClickOnTheDish() throws InterruptedException {
        WebElement PlovDish = driver.findElement(By.xpath("//h3[contains(.,\'Kharcho\')]"));
        PlovDish.isDisplayed();
        PlovDish.click();
        Thread.sleep(2000);
    }

    @Then("I expect to see order pop-op")
    public void iExpectToSeeOrderPopOp() {
        WebElement AddOrderBtn = driver.findElement(By.cssSelector(".sc-be417c56-5"));
        AddOrderBtn.isDisplayed();
        AddOrderBtn.isEnabled();
    }

    @When("I click 'Add order' button")
    public void iClickAddOrderButton() throws InterruptedException {
        WebElement AddOrderBtn = driver.findElement(By.cssSelector(".sc-be417c56-5"));
        AddOrderBtn.click();
        Thread.sleep(1000);
    }

    @Then("I expect to see shopping cart")
    public void iExpectToSeeShoppingCart() {
        WebElement ShopCard = driver.findElement(By.xpath("//div[3]/div/div[2]"));
        ShopCard.click();
    }

    @When("I click 'Discovery' button")
    public void iClickDiscoveryButton() {
        WebElement deliveryBtn = driver.findElement(By.xpath("//main[@id=\'mainContent\']/div[2]/div/div/div[2]/div/div/div/a/span"));
        deliveryBtn.click();
    }

    @When("I click 'Restaurants' button")
    public void iClickRestoranButton() {
        WebElement RestoranButton = driver.findElement(By.xpath("//main[@id=\'mainContent\']/div[2]/div/div/div[2]/div/div/div[2]/a/span"));
        RestoranButton.click();
    }

    @Then("I expect to see Restaurants page")
    public void iExpectToSeeRestaurantsPage() throws InterruptedException {
        String url = driver.getCurrentUrl();
        System.out.println(url);
        WebElement Restaurants = driver.findElement(By.linkText("Restoranai"));
        String ariaSelectedValue = Restaurants.getAttribute("aria-selected");
        if ("true".equals(ariaSelectedValue)) {
            System.out.println("aria-selected is true");
        } else {
            System.out.println("aria-selected is false");
        }

        Thread.sleep(3000);

    }

    @When("I click 'Stores' button")
    public void iClickStoresButton() {
        WebElement StoresButton = driver.findElement(By.xpath("//main[@id=\'mainContent\']/div[2]/div/div/div[2]/div/div/div[3]/a/span"));
        StoresButton.click();
        {
            WebElement StoresBtn = driver.findElement(By.cssSelector("div:nth-child(3) .sc-5c6f6a72-1"));
            if (!StoresBtn.isSelected()) {
                StoresBtn.click();
            }
        }
    }

    @Then("I expect to see Stores page")
    public void iExpectToSeeStoresPage() throws InterruptedException {
        String url = driver.getCurrentUrl();
        System.out.println(url);
        WebElement Restaurants = driver.findElement(By.xpath("//main[@id=\'mainContent\']/div[2]/div/div/div[2]/div/div/div[3]/a/span"));
        String ariaSelectedValue = Restaurants.getAttribute("aria-selected");
        if ("true".equals(ariaSelectedValue)) {
            System.out.println("aria-selected is true");
        } else {
            System.out.println("aria-selected is false");
        }

        Thread.sleep(3000);

    }

    @When("I click 'Sorted by Recommended' button")
    public void iClickSortedByRecommendedButton() throws InterruptedException {
        WebElement RecommendedButton = driver.findElement(By.cssSelector(".sc-630fc281-2"));
        RecommendedButton.isDisplayed();
        RecommendedButton.click();
    }

    @And("I click 'See all filters' button")
    public void iClickSeeAllFiltersButton() throws InterruptedException {
        WebElement SeeAllBtn = driver.findElement(By.cssSelector(".sc-61a1332a-1 > svg"));
        SeeAllBtn.isDisplayed();
        SeeAllBtn.click();
        Thread.sleep(3000);
    }

    @Then("I expect to see 'Filter categories' pop-up")
    public void iExpectToSeeFilterCategoriesPopUp() {
        WebElement PizzaBtn = driver.findElement(By.xpath("//label[contains(.,\'Pica\')]"));
        PizzaBtn.isDisplayed();
    }

    @When("I click 'Pizza' button")
    public void iClickPizzaButton() {
        WebElement PizzaBtn = driver.findElement(By.xpath("//label[contains(.,\'Pica\')]"));
        PizzaBtn.click();
    }

    @And("I click 'Apply' button")
    public void iClickApplyButton() {
        WebElement ApplyBtn = driver.findElement(By.xpath("//div[2]/button/div[3]"));
        ApplyBtn.click();
    }

    @Then("I expect see Restaurants near me with pizza")
    public void iExpectSeeRestaurantsNearMeWithPizza() throws InterruptedException {
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Thread.sleep(3000);
    }

    @When("I click 'Continue with Facebook' button")
    public void iClickContinueWithGoogleButton() throws InterruptedException {
        WebElement GoogleBtn = driver.findElement(By.cssSelector(".sc-752da1aa-5 .bRMAmn"));
        GoogleBtn.isDisplayed();
        Thread.sleep(3000);
    }

    @Then("switch window to facebook log in")
    public void switchWindowToFacebookLogIn() throws InterruptedException {
        driver.findElement(By.linkText("Facebook Login")).click();
        String url = driver.getCurrentUrl();

// Get all window handles
        Set<String> windowHandles = driver.getWindowHandles();

// Switch to the new window
        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
        }

// Locate and interact with the Facebook login elements
        driver.findElement(By.id("email")).sendKeys("your_email@example.com");
        driver.findElement(By.id("pass")).sendKeys("your_password");
        driver.findElement(By.name("login")).click();

// Switch back to the original window
        driver.switchTo().window(String);

    }

    @Then("I expect to see 'Filter' pop-up")
    public void iExpectToSeeFilterPopUp() {
        WebElement filterPopUp = driver.findElement(By.cssSelector(".sc-7ef78d82-0:nth-child(5) > .bRUnmo"));
        filterPopUp.isDisplayed();
    }


    @When("I select 'Health & beauty'")
    public void iSelectHealthBeauty() throws InterruptedException {
        WebElement filterPopUp = driver.findElement(By.xpath("//div[5]/label"));
        filterPopUp.click();
        Thread.sleep(2000);
    }

    @And("I select 'Apply' button")
    public void iSelectApplyButton() {
        WebElement ApplyBtn = driver.findElement(By.cssSelector(".sc-ebd616db-3"));
        ApplyBtn.click();
    }

    @Then("I expect see Stores near me pages")
    public void iExpectSeeStoresNearMePages() {
        String url = driver.getCurrentUrl();
        System.out.println(url);
    }
}
