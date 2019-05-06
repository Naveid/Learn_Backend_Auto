import org.testng.Assert;
import org.testng.annotations.Test;

public class testClass1 {
    Calculator cal = new Calculator();
    @Test(groups = {"reg"})
    public void sumTest(){
        Assert.assertEquals(8,cal.sum(3,5),"failed");
        System.out.println("in class1");
    }
    @Test(groups = {"sanity"})
    public void diffTest(){
        Assert.assertEquals(2,cal.diff(5,3),"failed");
        System.out.println("in class1");
        System.out.println("sanitytest2");
    }
    @Test(groups = {"reg"})
    public void mulTest(){
        Assert.assertEquals(15,cal.mul(3,5),"failed");
        System.out.println("in class1");
    }

}
