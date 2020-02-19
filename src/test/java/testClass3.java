import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class testClass3 {
    Student stu = new Student();

@Test(groups={"sanity"})
public void divTest() {
    Map<Student, Integer> mapStudent = new HashMap<>();
    stu.Student("naveid",12);
    mapStudent.put(stu,12);
    stu.Student("naveid",12);
    Assert.assertEquals(12, mapStudent.get(stu).intValue(), "Failed");
    Assert.assertEquals(12, stu.getAge(), "Failed");
    System.out.println("in class3 sanity Student test");
    System.out.println(stu.toString());
}

}
