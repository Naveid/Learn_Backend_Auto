import org.codehaus.groovy.runtime.powerassert.SourceText;
import org.openqa.selenium.*;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;


public class Sel {
     private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"qf-0q-destination\"]")
    WebElement locationTextBox;
    @FindBy(id = "citysqm-asi0-s0")
    WebElement priceDropDown;
    @FindBy(xpath="//*[@id=\"hds-marquee\"]/div[2]/div[1]/div/form/div[4]/button")
    WebElement landingSubmit;
    @FindBy(xpath="//*[@id=\"enhanced-sort\"]/li[5]/a")
    WebElement sAPriceSortDropdown;
    @FindBy(xpath="//*[@id=\"sort-submenu-price\"]/li[1]/a")
    WebElement sAPriceSortList;



    @Test(groups={"uitest"})
    public void testEasy() {
        driver.get("http://demo.guru99.com/test/guru99home/");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Demo Guru99 Page"));

    }
    @Test(groups={"uitest"})
    public void hcom() throws InterruptedException {
      //  Hcompage abc = new Hcompage(driver);         This to be used if we want to use page factory elements from another class having page elements
        PageFactory.initElements(driver,this);
        driver.manage().window().setSize(new Dimension(1600,900));
        driver.get("https://www.staging1-hotels.com/");
       // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 4);
        locationTextBox.sendKeys("lond");
        wait.until(ExpectedConditions.elementToBeClickable(priceDropDown));
        priceDropDown.click();
        wait.until(ExpectedConditions.elementToBeClickable(landingSubmit));
        landingSubmit.click();
        wait.until(ExpectedConditions.elementToBeClickable(sAPriceSortDropdown));
        sAPriceSortDropdown.click();
        String bestvalText=sAPriceSortList.getText();
        if(bestvalText.contains("Best")|| bestvalText.contains("Lowest")){
            sAPriceSortList.click();
            System.out.println(bestvalText+" clicked");
        }
        System.out.println(bestvalText);

        wait.until(ExpectedConditions.elementToBeClickable(sAPriceSortDropdown));

    }
    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
    }
    @AfterTest
    public void afterTest() {
        if(!driver.toString().contains("(null)"))
        driver.quit();
    }
}
