import java.util.Arrays;

/**
 * Created by melodytempleton on 6/14/17.
 */
public class StringPermutations {


    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        StringPermutations permutation = new StringPermutations();
        permutation.permute(str, 0, n - 1);

        System.out.println(permutation.countX("rr"));
    }

    /**
     * permutation function
     *
     * @param str string to calculate permutation for
     * @param l   starting index
     * @param r   end index
     */
    private void permute(String str, int l, int r) {
        if (l == r)
            System.out.println(str);
        else {
            for (int i = l; i <= r; i++) {
                // first time through, no swap, sticking with first letter
                str = swap(str, l, i);
                // run permute for the rest after first (won't start returning until it gets to the end)
                permute(str, l + 1, r);
                // swap back so we start fresh with next i
                str = swap(str, l, i);
            }
        }
    }

    /**
     * Swap Characters at position
     *
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }


    public int countX(String str) {

        int length = str.length();
        if (length == 1) {
            if (str.equals("x")) return 1;
            return 0;
        }

        char[] strArray = str.toCharArray();
        int count = 0;


        if ('x' == strArray[0]) {count = 1;
        System.out.println("inside");}
        char[] charArray  = Arrays.copyOfRange(strArray, 1, length - 1);
        str = String.valueOf(charArray);

        return count + countX(str);

    }



}