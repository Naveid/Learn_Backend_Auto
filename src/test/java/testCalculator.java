import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Scanner;

public class testCalculator {
    Calculator cal = new Calculator();

    @Test(groups = {"calc"})
    public void sumTest(){
        Assert.assertEquals(8,cal.sum(3,5),"failed");
    }
    @Test(groups = {"calc"})
    public void diffTest(){
        Assert.assertEquals(2,cal.diff(5,3),"failed");
    }
    @Test(groups = {"calc","nav"})
    public void mulTest(){
        Assert.assertEquals(15,cal.mul(3,5),"failed");
    }
    @Test(groups = {"calc"})
    public void divTest(){
        Assert.assertEquals(2,cal.div(10,5),"failed");
    }
    @Test(groups = {"calc"})
    public void modTest(){
        Assert.assertEquals(1,cal.mod(11,5),"failed");
    }







}
