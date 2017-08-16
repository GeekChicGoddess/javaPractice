import sun.security.util.Length;

import java.util.Arrays;

/**
 * Created by melodytempleton on 8/16/17.
 */
public class recursion1 {

    public int countX(String str) {

        int length = str.length();
        if(length == 1){
            System.out.println("legth is one");
            if (str.equals("x")) return 1;
            return 0;
        }
        else{
            System.out.println("else");
            char [] strArray = str.toCharArray();
            System.out.println(strArray);
            int count = 0;

            if ( 'x'  == strArray[0]) {
                System.out.println("x == 0");
                count =1;
            }
            char [] newstrArray = Arrays.copyOfRange(strArray, 1, length);
            str = String.valueOf(newstrArray);
            System.out.println(str);
            return count + countX(str);

        }
    }
    public int countHi(String str) {
        int length = str.length();
        if (length == 0) return 0;
        if(length == 2){
            if (str.equals("hi")) return 1;
            return 0;
        }
        else{
            char [] strArray = str.toCharArray();
            int count = 0;

            char [] shortArray = Arrays.copyOfRange(strArray, 0, 2);
            String shortStr = String.valueOf(shortArray);
            System.out.println(shortArray);
            System.out.println(shortStr);

            if (shortStr.equals("hi")) {
                System.out.println("count 1");
                count =1;
            }

            char [] newstrArray = Arrays.copyOfRange(strArray, 1, length);
            str = String.valueOf(newstrArray);

            return count + countHi(str);


        }
    }


    public static void main(String[] args) {

        recursion1 rec = new recursion1();

//        System.out.println(rec.countX("ixhxiix"));

        System.out.println(rec.countHi("ihihihi"));
    }
}
