import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hcompage {

    @FindBy(xpath = "//*[@id=\"qf-0q-destination\"]")
    WebElement locationTextBox;
    @FindBy(id = "citysqm-asi0-s0")
    WebElement priceDropDown;
    private WebDriver driver;
    public Hcompage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

}
