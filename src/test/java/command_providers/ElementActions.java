package command_providers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ElementActions {
    private By locator;
    private WebDriver driver;

    public ElementActions(WebDriver driver, By locator) {
        this.driver = driver;
        this.locator = locator;
    }

    public WebElement getElement() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement element = null;
        try{
            element = driver.findElement(locator);
        } catch (Exception e) {
            System.out.println("Element Exception for the locatior: " + locator + " and exception is: " + e);
        }
        return element;
    }

    public  ElementActions click() {
        getElement().click();
        return this;
    }

    public ElementActions setValues(String value) {
        getElement().clear();
        getElement().sendKeys(value);
        return this;
    }

    public ElementActions selectValue(String value) {
        Select select = new Select(getElement());
        select.selectByVisibleText(value);
        return this;
    }

    public ElementActions mouseHover() {
        Actions actions = new Actions(driver);
        actions.moveToElement(getElement()).perform();
        return this;
    }

    public String getTextValue() {
        return getElement().getText(); }

}
