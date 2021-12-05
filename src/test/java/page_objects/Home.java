package page_objects;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Home {
    private final By HomeValueInputField = By.id("homeval");
    private final By DownPaymentInputField = By.id("downpayment");
    private final By RadioButtonField = By.name("param[downpayment_type]");
    private final By LoanAmountField = By.id("loanamt");
    private final By InterestRateField = By.id("intrstsrate");
    private final By LoanTermField = By.id("loanterm");
    private final By StartMonthDropDown = By.name("param[start_month]");
    private final By StartYearInPutField = By.id("start_year");
    private final By PropertyTaxInputField = By.id("pptytax");
    private final By PmiInputField = By.id("pmi");
    private final By HoiInputField = By.id("hoi");
    private final By HoaInputField = By.id("hoa");
    private final By LoanTypeDropDown = By.name("param[milserve]");
    private final By RefiOrBuyDropDown = By.name("param[refiorbuy]");
    private final By CalculateButton = By.name("cal");

    private static final Logger LOGGER = LogManager.getLogger(Home.class);

    public WebDriver driver;

    public Home(WebDriver driver) {
        this.driver = driver;
    }

    public Home typeHomePrice(String value) {
        LOGGER.debug("Typing the home price: " + value);
        ActOn.element(driver, HomeValueInputField).setValues("300000");
        return this;
    }

    public Home typeDownPayment(String value) {
        LOGGER.debug("Typing the down payment: " + value);
        return this;
    }

    public Home clickOnDownPaymentInDollar() {
        LOGGER.debug("click on the $ radio button");
        ActOn.element(driver, RadioButtonField).click();
        return this;
    }

    public Home typeLoanAmount(String value) {
        LOGGER.debug("Typing the loan amount: " + value);
        ActOn.element(driver, LoanAmountField).setValues(value);
        return this;
    }

    public Home typeInterestRate(String value) {
        LOGGER.debug("Typing the interest rate: " + value);
        ActOn.element(driver, InterestRateField).setValues(value);
        return this;
    }

    public Home typeLoanTermYears(String value) {
        LOGGER.debug("Typing the loan terms: " + value);
        ActOn.element(driver, LoanTermField).setValues(value);
        return this;
    }

    public Home selectMonth( String month) {
        LOGGER.debug("Selecting the start month: " + month);
        ActOn.element(driver, StartMonthDropDown).selectValue(month);
        return this;
    }

    public Home typeYear(String year) {
        LOGGER.debug("Selecting the start year: " + year);
        ActOn.element(driver, StartYearInPutField).setValues(year);
        return this;
    }

    public Home typePropertyTax(String value) {
        LOGGER.debug("Selecting the start month: " + value);
        ActOn.element(driver, PropertyTaxInputField).setValues(value);
        return this;
    }

    public Home typePmi(String value) {
        LOGGER.debug("Typing the PMI: " + value);
        ActOn.element(driver, PmiInputField).setValues(value);
        return this;
    }

    public Home typeHoi(String value) {
        LOGGER.debug("Typing the HOI: " + value);
        ActOn.element(driver, HoaInputField).setValues(value);
        return this;
    }

    public Home typeHoa(String value) {
        LOGGER.debug("Typing the HOA: " + value);
        ActOn.element(driver, HoaInputField).setValues(value);
        return this;
    }

    public Home selectLoanType(String value) {
        LOGGER.debug("Selecting the Loan Type: " + value);
        ActOn.element(driver, LoanTypeDropDown).selectValue(value);
        return this;
    }

    public Home selectBuyOrRefiOption(String value) {
        LOGGER.debug("Selecting the Buy or Refi option: " + value);
        ActOn.element(driver, RefiOrBuyDropDown).selectValue(value);
        return this;
    }

    public Home clickOnCalculateButton() {
        LOGGER.debug("Clicking on Calculate Button");
        ActOn.element(driver, CalculateButton).click();
        return this;
    }

    public Home validateTotalMonthlyPayment(String expectedTotalMonthlyPayment) {
        String formattedXpath = String.format("//h3[text()='$%s']",expectedTotalMonthlyPayment);
        By monthlyPayment = By.xpath(formattedXpath);

        LOGGER.debug("Validate that the total monthly payment is: " + expectedTotalMonthlyPayment);
        AssertThat.elementAssertions(driver, monthlyPayment).elementIsDisplayed();
        return this;
    }


}
