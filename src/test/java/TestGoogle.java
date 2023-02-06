import GooglePOP.AllResultsPage;
import GooglePOP.MainPage;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class TestGoogle extends BaseTest {
    @Test
    public void verifyGoogleResults() {
        MainPage.open(driver);
        MainPage mp = new MainPage(driver);

        mp.skipGDPR();
        mp.searchFor("Cantestit");

        AllResultsPage aResults = new AllResultsPage(driver);
        assertTrue(aResults.getFirstResultTitle().contains("CanTest IT"));
    }
}
