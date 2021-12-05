package automation_test.mortgage_calculator;

import command_providers.ActOn;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.NavigationBar;
import page_objects.RealApr;


public class CalculateRealAprRate {
        //Not needed since we changed to Object Page Model with RealApr Class
//        private final By RatesLink = By.linkText("Rates");
//        private final By RealAprLink = By.linkText("Real APR");
//        private final By CalculatorTab = By.xpath("//label[text()='Calculator']");
//        private final By HomePriceInputField = By.name("HomeValue");
//        private final By DownPaymentInDollar = By.name("DownPaymentSel");
//        private final By DownPaymentInputField = By.name("DownPayment");
//        private final By InterestRateInputField = By.name("Interest");
//        private final By CalculateRateButton = By.name("calculate");
//        private final By ActualAprRate = By.xpath("//*[@id='analysisDiv']/table[1]/tbody/tr[6]/td[1]//strong[text()='Actual APR:']/../../td[2]/strong[text()='3.130%']");


        WebDriver driver;

        @BeforeMethod
        public void openBrowser() {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
//                driver.get("https://www.mortgagecalculator.org/");
//                driver.manage().window().maximize();
                ActOn.browser(driver).openBrowser("https://www.mortgagecalculator.org/");
        }

        @Test
        public void calculateRealApr() {
                new NavigationBar(driver)
                        .mouseHoverToRates()
                        .navigateToRealApr()
                        .waitForPageToLoad()
                        .typeHomePrice("200000")
                        .clickDownPaymentInDollar()
                        .typeDownPayment("15000")
                        .typeInterestRate("3")
                        .clickOnCalculateButton()
                        .validateRealAprRate("3.130%");
        }


                @AfterMethod
                public void closeBrowser() {
                        ActOn.browser(driver).close();
                        // Closing the tab
                        //       driver.close();
                }
        }

