import org.codehaus.groovy.runtime.powerassert.SourceText;
import sun.tools.tree.CharExpression;

import java.util.*;

public class StringPractice {

    public String reverseWord(String input) {
        int head = 0;
        StringBuilder output = new StringBuilder();
        String[] SplitInput = input.split(" ");
        for (int i = 0; i < SplitInput.length; i++) {
            System.out.println(SplitInput[i]);
            //for (int k=SplitInput[i].length();k==0;k--){
            int k = SplitInput[i].length();
            while (k != 0) {
                output.append(SplitInput[i].charAt(k - 1));
                --k;
            }
            output.append(" ");

        }
        return output.toString();
    }

    public void hello(int[] arr, int n) {

    }

    public void abc(){
        String abc = "aaasdaasssdd";
        int first =0;
        int last=0;
        int counter = 0;
        ArrayList<String> abcs= new ArrayList<>();

        for (int i =0;i<abc.length()-1;i++) {
            if (Character.toString(abc.charAt(i)).equals(Character.toString(abc.charAt(i + 1)))){
                last=last+1;
            }else{
                last=last+1;
                abcs.add (abc.substring(first,last));
               counter++;
               first=i+1;
               last=i+1;
            }

        }
        for(int a=0;a<abcs.size();a++){
            System.out.println(abcs.get(a));
        }

    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        HashMap<String, Integer> abc = new HashMap<>();
        Stack<Integer> S = new Stack<>();
        String text = "Geeksforgeeks";
        String letter = "o";

        StringPractice obj = new StringPractice();
        //int[] abcd = {1,2,3,7,5};
        obj.abc();

        // System.out.println(obj.reverseWord(text));
        //System.out.println("Letter searched " + letter+"-->"+ obj.countInstance(text,letter)+" occurances");
        //System.out.println(obj.removeDuplicates(text));
       // obj.search(abcd, abcd.length, 3);
       // System.out.println(obj.sumwithargs(2, 5, 7, 8, 9, 10));
        //obj.subarraySum(abcd,abcd.length,5);
    }

    private Integer countInstance(String text, String letter) {
        HashMap<String, Integer> abc = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            String input = (Character.toString(text.charAt(i)));
            if (abc.get(input) == null) {

                abc.put(input, 1);
            } else abc.put(input, abc.get(input) + 1);

        }
        return abc.get(letter);

    }

    public String removeDuplicates(String str) {

        StringBuffer stbuff = new StringBuffer();
        ArrayList<String> abc = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        Queue<Integer> n = new LinkedList<>();
        HashMap<String, Integer> bc = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            String letter = Character.toString(str.charAt(i));
            if (!letter.equals(" ")) {


                if (!abc.contains(letter.toLowerCase()) && !abc.contains(letter.toUpperCase())) {
                    abc.add(letter);
                    stbuff.append(letter);
                }
            }
        }

        return stbuff.toString();
    }

    int search(int arr[], int N, int X) {
        int l = 0;
        for (int i = 0; i < N - 1; i++) {
            if (arr[i] == X) {
                return i;
            }
        }
        return l;
    }

    int sumwithargs(int... args) {
        int sum = 0;
        if (args.length != 0) {
            for (int i : args) {
                sum = sum + i;
            }
        }
        return sum;
    }


    public ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int l = 0;
        int r = 0;
        int sum = arr[r];
        ArrayList<Integer> abc = new ArrayList<>();

        while (r < n) {
            if (sum == s) {
                for (int k = l; k <= r; k++) {
                    abc.add(arr[k]);
                    System.out.println(arr[k]);
                }
                return abc;
            }
            if (sum < s) {
                r = r+1;
                sum = sum + arr[r];

            }
            if (sum > s) {
                sum = sum - arr[l];
                l = l+1;
            }
        }
        abc.add(-1);
        return abc;

    }

    public String abc(String k){
        StringBuilder ab = new StringBuilder();
        for (int i=k.length()-1;i>=0;i++){

            ab.append(Character.toString(k.charAt(i)));
        }
return ab.toString();
}
    }