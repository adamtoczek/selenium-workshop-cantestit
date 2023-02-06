package GooglePOP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllResultsPage {
    WebDriver driver;
    @FindBy(css = "#rso>div:first-of-type div.g div.g h3")
    WebElement firstResult;

    public AllResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getFirstResultTitle() {
        return firstResult.getText();
    }
}
