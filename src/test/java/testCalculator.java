import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Scanner;

public class testCalculator {
    Calculator cal = new Calculator();

    @Test(groups = {"pos","all"})
    public void sumTest(){
        Assert.assertEquals(8,cal.sum(3,5),"failed");
    }
    @Test(groups = {"pos","all"})
    public void diffTest(){
        Assert.assertEquals(2,cal.diff(5,3),"failed");
    }
    @Test(groups = {"neg","all"})
    public void mulTest(){
        Assert.assertEquals(15,cal.mul(3,5),"failed");
    }
    @Test(groups = {"neg","all"})
    public void divTest(){
        Assert.assertEquals(2,cal.div(10,5),"failed");
    }
    @Test(groups = {"neg","all"})
    public void modTest(){
        Assert.assertEquals(1,cal.mod(11,5),"failed");
    }







}
