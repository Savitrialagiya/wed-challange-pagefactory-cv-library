package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "jobSearch")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"Tester", "Harrow", "up to 5 miles", "30000", "50000", "Per annum", "Permanent", "Permanent Tester jobs in Harrow on the Hill"},
                {"Tester", "Edgware", "up to 5 miles", "40000", "50000", "Per annum", "Permanent", "Permanent Tester jobs in Edgware"},
                {"Test Engineer", "Kingswood", "up to 10 miles", "30000", "40000", "Per annum", "Permanent", "Permanent Test Engineer jobs in Kingswood"},
                {"Test Manager", "Newport", "up to 10 miles", "60000", "70000", "Per annum", "Permanent", "Permanent Test Manager jobs in Newport"},
                {"Accountant", "Hammersmith", "up to 15 miles", "50000", "60000", "Per annum", "Permanent", "Permanent Accountant jobs in Hammersmith"},
                {"Finance Assistant", "King's Cross", "up to 5 miles", "30000", "40000", "Per annum", "Permanent", "Permanent Finance Assistant jobs in King's Cross"}
        };
        return data;
    }
}
