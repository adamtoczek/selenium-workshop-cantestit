package GooglePOP;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MainPage {
    WebDriver driver;
    @FindBy(name = "q")
    WebElement searchInput;

    @FindBy(css = "button[data-ved]>div[role]")
    List<WebElement> gdprButtons;

    public static void open(WebDriver driver) {
        driver.get("https://www.google.com/");
    }

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void searchFor(String text) {
        searchInput.sendKeys(text+ Keys.ENTER);
    }

    public void skipGDPR() {
        WebElement declineBtn = gdprButtons.get(2);
        declineBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.invisibilityOf(declineBtn));
    }
}
