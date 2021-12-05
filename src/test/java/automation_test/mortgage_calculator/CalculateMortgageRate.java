package automation_test.mortgage_calculator;

import command_providers.ActOn;
import command_providers.AssertThat;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.NavigationBar;
import utlities.DateUtils;


public class CalculateMortgageRate {
    //We are declaring these IDs/Names/Xpaths from MortageCalculator so that if the values are changed we can quickly edit it here
    //instead of going into every line and updating the ids/names/xpaths.
//    private final By HomeValueInputField = By.id("homeval");
//    private final By DownPaymentInputField = By.id("downpayment");
//    private final By RadioButtonField = By.name("param[downpayment_type]");
//    private final By LoanAmountField = By.id("loanamt");
//    private final By InterestRateField = By.id("intrstsrate");
//    private final By LoanTermField = By.id("loanterm");
//    private final By StartMonthDropDown = By.name("param[start_month]");
//    private final By StartYearInPutField = By.id("start_year");
//    private final By PropertyTaxInputField = By.id("pptytax");
//    private final By PmiInputField = By.id("pmi");
//    private final By HoiInputField = By.id("hoi");
//    private final By HoaInputField = By.id("hoa");
//    private final By LoanTypeDropDown = By.name("param[milserve]");
//    private final By RefiOrBuyDropDown = By.name("param[refiorbuy]");
//    private final By CalculateButton = By.name("cal");
    // We can eliminate declaring the variable in the above method by using Page Object Model - NavigatorBar Class


    WebDriver driver;
    Select select;

    @BeforeMethod
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        // We can use ActOn to replace the two lines of code
//        driver.get("https://www.mortgagecalculator.org/");
//        driver.manage().window().maximize();
        ActOn.browser(driver).openBrowser("https://www.mortgagecalculator.org/");
    }

//    public void enterData() {
//        // Enter Home Value "300000"
//        // We used ActOn to replace the 2 lines of code
////        driver.findElement(HomeValueInputField).clear();
////        driver.findElement(HomeValueInputField).sendKeys("300000");
//        ActOn.element(driver, HomeValueInputField).setValues("300000");
//
//        //Enter downpayment"60000"
////        driver.findElement(DownPaymentInputField).clear();
////        driver.findElement(DownPaymentInputField).sendKeys("60000");
//        ActOn.element(driver, DownPaymentInputField).setValues("60000");
//
//        //Select the radio button $
//        //driver.findElement(By.name("param[downpayment_type]")).click();
//        //Can also be written this way.
//        //driver.findElement(RadioButtonField).click();
//        ActOn.element(driver, RadioButtonField).click();
//        //Getting radio button by xPath
//        //    driver.findElement(By.xpath("//*[@id='calc']//input[@name='param[downpayment_type]'][@value='money']")).click();
//
//        //Enter Loan Amount "240000"
//        //driver.findElement(By.id("loanamt")).clear();
//        //driver.findElement(By.id("loanamt")).sendKeys("240000");
//        //Can be written this way as well. Or use ActOn to cut the 2 lines below
////        driver.findElement(LoanAmountField).clear();
////        driver.findElement(LoanAmountField).sendKeys("240000");
//        ActOn.element(driver, LoanAmountField).setValues("240000");
//
//        //Enter the interest rate of 3%
//        //Can use ActOn to reduce the two lines of code
////        driver.findElement(InterestRateField).clear();
////        driver.findElement(InterestRateField).sendKeys("3");
//        ActOn.element(driver, InterestRateField).setValues("3");
//
//        //Enter loan term 30 years
////        driver.findElement(LoanTermField).clear();
////        driver.findElement(LoanTermField).sendKeys("30");
//        ActOn.element(driver, LoanTermField).setValues("30");
//
//        //This lets us replace "Dec" with variable month & 2021 with year
//        String date = DateUtils.returnNextMonth();
//        String[] dates = date.split("-");
//        String month = dates[0];
//        String year = dates[1];

//        //Select the month "Dec"
//        //Can use ActOn to get rid of the two lines of code
////        select = new Select(driver.findElement(StartMonthDropDown));
////        select.selectByVisibleText("Dec");
//        ActOn.element(driver, StartMonthDropDown).selectValue(month);
//
//        //Select the year "2021"
////        driver.findElement(StartYearinPutField).clear();
////        driver.findElement(StartYearinPutField).sendKeys("2021");
//        ActOn.element(driver, StartYearInPutField).setValues(year);
//
//        //Enter property tax "5000"
////        driver.findElement(PropertyTaxInputField).clear();
////        driver.findElement(PropertyTaxInputField).sendKeys("5000");
//        ActOn.element(driver, PropertyTaxInputField).setValues("5000");
//
//        //Enter PMI "0.5"
////        driver.findElement(PmiInputField).clear();
////        driver.findElement(PmiInputField).sendKeys("0.5");
//        ActOn.element(driver, PmiInputField).setValues("0.5");
//
//        //Enter Homeowner Insurance "1000"
////        driver.findElement(HoiInputField).clear();
////        driver.findElement(HoiInputField).sendKeys("1000");
//        ActOn.element(driver, HoiInputField).setValues("1000");
//
//        //Enter Monthly HOA "100"
////        driver.findElement(HoaInputField).clear();
////        driver.findElement(HoaInputField).sendKeys("100");
//        ActOn.element(driver, HoaInputField).setValues("100");
//
//        //Select "Conventional" Loan Type
//        //You can use ActOn to get rid of the below two lines and still select from the dropdown
////        select = new Select(driver.findElement(LoanTypeDropDown));
////        select.selectByVisibleText("FHA");
//        ActOn.element(driver, LoanTypeDropDown).selectValue("FHA");
//
//        //Select "Buy" option
////        select = new Select(driver.findElement(RefiOrBuyDropDown));
////        select.selectByVisibleText("Buy");
//        //You can use ActOn to get rid of the below two lines and still select from the dropdown
//        ActOn.element(driver, RefiOrBuyDropDown).selectValue("Buy");
//    }

    @Test

    public void calculateMonthlyPayment() {
        // This will allow you to generate the next month & year to pass below in the Page Object Model below
        //You don't need this if you hard code the month and year, but this is easier to get next month value
        String date = DateUtils.returnNextMonth();
        String[] dates = date.split("-");
        String month = dates[0];
        String year = dates[1];

        // By using Page Object Model we got rid of all the previous lines of code Above and Below.
        // The below code has all the functions and pulls on NavigatorBar Class for movement/inputs
        new NavigationBar(driver)
                .navigateToHome()
                .typeHomePrice("300000")
                .typeDownPayment("60000")
                .clickOnDownPaymentInDollar()
                .typeLoanAmount("240000")
                .typeInterestRate("3")
                .typeLoanTermYears("30")
                .selectMonth(month)
                .typeYear(year)
                .typePropertyTax("5000")
                .typePmi("0.5")
                .typeHoi("1000")
                .typeHoa("100")
                .selectLoanType("FHA")
                .selectBuyOrRefiOption("Buy")
                .clickOnCalculateButton()
                .validateTotalMonthlyPayment("1,611.85");
//
//
////        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        enterData();
//
//        //Click on Calculate Button
////        driver.findElement(CalculateButton).click();
//        ActOn.element(driver, CalculateButton).click();
//
//        //Validate that the Monthly payment is $1,611.85
//        String expectedTotalMonthlyPayment = "1,611.85";
//        //in the below after equal ='$%s' is a special wildcard that reads just the numerical value which is 1,611.85.
//        //The actual value is $1,611.85, so you write $%s
//        String formattedXpath = String.format("//h3[text()='$%s']",expectedTotalMonthlyPayment);
//        By monthlyPayment = By.xpath(formattedXpath);
//
////        boolean present = driver.findElement(By.xpath(formattedXpath)).isDisplayed();
////        // driver.findElement(By.xpath("//h3[text()='$1,611.85']")).isDisplayed();
////
////        // $701.18 - old notes
////        //  String total_monthly_payment = "$701.18";
////        //  boolean present = driver.findElements(By.xpath("//h3[text()='$1,611.85']")).isDisplayed();
////
////        //Validate Total monthly payment is generated correctly
////        Assert.assertTrue(present, "Total monthly payment is not presented");
////  By using ActOn we removed line 150, 155, 158
//        AssertThat.elementAssertions(driver, monthlyPayment).elementIsDisplayed();

    }

    @AfterMethod
    public void quitBrowser() {
      //  driver.quit();
        ActOn.browser(driver).close();
    }

}