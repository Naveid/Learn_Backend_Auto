import org.testng.Assert;
import org.testng.annotations.Test;

public class testClass1 {
    Calculator cal = new Calculator();
    @Test(groups = {"reg"})
    public void sumTest(){
        Assert.assertEquals(8,cal.sum(3,5),"failed");
        System.out.println("in class1 reg");
    }
    @Test(groups = {"sanity"})
    public void diffTest() throws InterruptedException {
        Assert.assertEquals(2,cal.diff(5,3),"failed");
        Thread.sleep(100);
        System.out.println("in class1");
        System.out.println("sanitytest from TestClass 1");
    }
    @Test(groups = {"reg"})
    public void mulTest(){
        Assert.assertEquals(15,cal.mul(3,5),"failed");
        System.out.println("in class1 reg");
    }

}
