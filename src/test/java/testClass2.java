import org.testng.Assert;
import org.testng.annotations.Test;

public class testClass2 {
    Calculator cal = new Calculator();
    @Test(groups = {"sanity"})
    public void divTest(){
        Assert.assertEquals(2,cal.div(10,5),"failed");
    }
    @Test(groups = {"reg"})
    public void modTest(){
        Assert.assertEquals(1,cal.mod(11,5),"failed");
    }
}