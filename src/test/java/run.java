public class run {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.print("Enter First Number:- ");
        int FirstNumber =  cal.getnumber();
        System.out.print("Enter second Number:- ");
        int SecondNumber = cal.getnumber();
        System.out.print("Enter expected Result:-");
        int Result = cal.getnumber();
        System.out.println(cal.sum(5,7));
    }
}
