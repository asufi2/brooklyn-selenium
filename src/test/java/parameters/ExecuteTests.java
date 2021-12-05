package parameters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExecuteTests {
    @Test(dataProvider = "MultipleValues", dataProviderClass = DataProviderClass.class)
    public void readMultipleValues(String name, String state, int zipCode) {
        System.out.println("Name is: " + name);
        System.out.println("State is: " + state);
        System.out.println("Zip Code is: " + zipCode);
    }

    @DataProvider (name = "RealAprRates")
    public Object[][] storeRealAprRates() {
        return new Object[][] {
                {"200000", "15000", "3", "3.130%"}
        };
    }
}
