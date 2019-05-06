import java.io.FileInputStream;
import java.util.Scanner;

public class Calculator {
    public int getnumber() {
        int number;
        System.out.println("numbr");
        Scanner abc = new Scanner(System.in);


        try{
           number = abc.nextInt();

        }catch (NumberFormatException e){
            System.out.println("Please Enter Numeric Details");
            return getnumber();
        }
        return number;

    }

    public int sum(int fno,int sno){
        try {
            return fno + sno;
        }
        catch (Exception e){e.printStackTrace();
        return 0;
        }
        finally {
           // System.out.println("Finally Executed");
            }

    }

    public int diff(int fno,int sno){
        try {
            return fno - sno;
        }
        catch (Exception e){e.printStackTrace();
            return 0;
        }
        finally {
            //System.out.println("Finally Executed");
            }

    }
    public int mul(int fno,int sno){
        try {
            return fno * sno;
        }
        catch (Exception e){e.printStackTrace();
            return 0;
        }
        finally {
           // System.out.println("Finally Executed");
            }

    }
    public int div(int fno,int sno){
        try {
            return fno / sno;
        }
        catch (Exception e){e.printStackTrace();
            return 0;
        }
        finally {
           // System.out.println("Finally Executed");
           }

    }
    public int mod(int fno,int sno){
        try {
            return fno % sno;
        }
        catch (Exception e){e.printStackTrace();
            return 0;
        }
        finally {
          //  System.out.println("Finally Executed");
            }

    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));;
    }
}
