import org.codehaus.groovy.runtime.powerassert.SourceText;
import org.openqa.selenium.*;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;


public class Sel {
    private WebDriver driver;
    @Test(groups={"uitest"})
    public void testEasy() {
        driver.get("http://demo.guru99.com/test/guru99home/");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Demo Guru99 Page"));

    }
    @Test(groups={"uitest"})
    public void hcom() throws InterruptedException {
        driver.manage().window().setSize(new Dimension(1600,900));
        driver.get("https://www.staging1-hotels.com/");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 4);
        WebElement abc = driver.findElement(By.xpath("//*[@id=\"qf-0q-destination\"]"));
        abc.sendKeys("lond");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("citysqm-asi0-s0")));
        WebElement def = driver.findElement(By.id("citysqm-asi0-s0"));
        def.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"hds-marquee\"]/div[2]/div[1]/div/form/div[4]/button")));
        WebElement kkk = driver.findElement(By.xpath("//*[@id=\"hds-marquee\"]/div[2]/div[1]/div/form/div[4]/button"));
        kkk.click();
        Thread.sleep(2000);
        System.out.println(driver.getCurrentUrl());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"enhanced-sort\"]/li[5]/a")));
        WebElement priceLink=driver.findElement(By.xpath("//*[@id=\"enhanced-sort\"]/li[5]/a"));
        priceLink.click();
        WebElement bestval=driver.findElement(By.xpath("//*[@id=\"sort-submenu-price\"]/li[1]/a"));
        String bestvalText=bestval.getText();
        if(bestvalText.contains("Best")|| bestvalText.contains("Lowest")){
            bestval.click();
            System.out.println(bestvalText+" clicked");
        }
        System.out.println(bestvalText);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"enhanced-sort\"]/li[5]/a")));

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
