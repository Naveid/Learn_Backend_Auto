import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Scanner;

public class testCalculator {
    Calculator cal = new Calculator();

    @Test(groups = {"sanity"})
    public void sumTest() throws InterruptedException {
        Thread.sleep(10000);
        Assert.assertEquals(8,cal.sum(3,5),"failed");
        System.out.println("sanitytest sanity tc");
    }
    @Test(groups = {"smoke"})
    public void diffTest(){
        Assert.assertEquals(2,cal.diff(5,3),"failed");
    }
    @Test(groups = {"reg"})
    public void mulTest(){
        Assert.assertEquals(15,cal.mul(3,5),"failed");
        System.out.println("regtest reg tc");
    }
    @Test(groups = {"sanity"})
    public void divTest(){
        Assert.assertEquals(2,cal.div(10,5),"failed");
        System.out.println("sanitytest sanity tc");
    }
    @Test(groups = {"reg"})
    public void modTest(){
        Assert.assertEquals(1,cal.mod(11,5),"failed");
        System.out.println("regtest reg tc");
    }
//    int i =0;
//    public void createissue(int i){
//        System.out.println(i);
//        System.out.println("hello");
//    }
}
