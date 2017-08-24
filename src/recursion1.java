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
    public String changePi(String str) {
        int length = str.length();
        if (length == 0) return "";
        if (length == 1) return str;
        if(length == 2){
            if (str.equals("pi")) return "3.14";
            return str;
        }
        char [] strArray = str.toCharArray();

        char [] shortArray = Arrays.copyOfRange(strArray, 0, 2);
        String shortStr = String.valueOf(shortArray);
        System.out.println("1 shortStr "  + shortStr);

        if (shortStr.equals("pi")){
            shortStr = "3.14";
            char [] newstrArray = Arrays.copyOfRange(strArray, 2, length);
            str = String.valueOf(newstrArray);
            System.out.println("2 str " + str);
        }
        else{
            char [] newstrArray = Arrays.copyOfRange(strArray, 1, length);
            str = String.valueOf(newstrArray);
            shortArray = Arrays.copyOfRange(strArray, 0, 1);
            shortStr = String.valueOf(shortArray);
            System.out.println("3 boht " + shortStr + " " +str);

        }

        return shortStr + changePi(str);
    }


    public String parenBit(String str) {

        char[] charArray = str.toCharArray();

        String paranStr = "";
        System.out.println(str);
        System.out.println(charArray[charArray.length-1]);

        if(charArray[charArray.length-1] == '('){
            if(charArray[0] == ')'){
                return ")";
            }
            else {
                paranStr = String.valueOf(charArray[0]);
                charArray = Arrays.copyOfRange(charArray, 1, charArray.length);
            }
        }

        else if (charArray[0] == '('){
            str = str + "(";
            charArray = str.toCharArray();
            charArray =  Arrays.copyOfRange(charArray, 1, charArray.length);
            paranStr= "(";
        }
        else {
            charArray =  Arrays.copyOfRange(charArray, 1, charArray.length);
        }
        str = String.valueOf(charArray);


        return  paranStr + parenBit(str) ;
    }
    public boolean nestParen(String str) {
        if (str.length() == 0) return true;
        if (str.length() == 1) return false;
        char[] charArray = str.toCharArray();
        System.out.println(str);
        System.out.println(charArray[0]);
        System.out.println(charArray[charArray.length-1]);
        if((charArray[0] == '(') && (charArray[charArray.length-1] == ')')){
            System.out.println("running");
            if (charArray.length == 2) return true;
            else {
                charArray = Arrays.copyOfRange(charArray, 1, charArray.length-1);
                str = String.valueOf(charArray);
                System.out.println(str);
                return nestParen(str);
            }
        }
        else {return false;}

    }
    public int strCount(String str, String sub) {
        int subLen = sub.length();
        if (str.length() < subLen) return 0;
        char[] charArray = str.toCharArray();
        char[] subChar =  Arrays.copyOfRange(charArray, 0, 1);
        if (subLen > 1) {
            subChar = Arrays.copyOfRange(charArray, 0, subLen);
        }
        String subStr = String.valueOf(subChar);
        int count = 0;

        System.out.println(subStr);
        System.out.println(str);
        if(subStr.equals(sub)) {
            count = 1;
            if (subLen == 1) {
                charArray = Arrays.copyOfRange(charArray, 1, charArray.length);}
            else{
                charArray = Arrays.copyOfRange(charArray, subLen, charArray.length);
            }
        }
        else {
            charArray = Arrays.copyOfRange(charArray, 1, charArray.length);
        }

        str = String.valueOf(charArray);

        return count + strCount(str, sub);
    }



    public static void main(String[] args) {

        recursion1 rec = new recursion1();

//        System.out.println(rec.countX("ixhxiix"));

//        System.out.println(rec.countHi("ihihihi"));
//        System.out.println(rec.changePi("ipipipi"));
//        System.out.println(rec.parenBit("ipi(sdsd)i"));
//        System.out.println(rec.nestParen("(())"));
        System.out.println(rec.strCount("iiiijj", "ii"));
    }
}
