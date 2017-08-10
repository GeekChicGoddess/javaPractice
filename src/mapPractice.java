import java.util.HashMap;
import java.util.Map;

/**
 * Created by melodytempleton on 8/9/17.
 */
public class mapPractice {

    public String wordAppend(String[] strings) {

        Map<String, Integer> map = new HashMap();
        String combined = "";

        for (String s : strings) {

            if (map.get(s)!=null) {
                combined += s;
                map.remove(s);
            }
            else {
                map.put(s, 1);
            }
        }

        return combined;

    }
}

//    public String[] allSwap(String[] strings) {
//
//        Map <Character, Integer> map = new HashMap();
//
//        String [] newStrings = new String [strings.length];
//
//        int index = 0;
//
//        for (String s : strings){
//
//            int prevIndex = 0;
//            char matchChar = s.charAt(0);
//
//            if (map.get(matchChar) != null){
//                prevIndex = map.get(matchChar);
//                String moveString = newStrings[prevIndex];
//                newStrings[prevIndex] = s;
//                newStrings[index] = moveString;
//                map.put(matchChar, index);
//            }
//            else{
//                map.put(matchChar, index);
//                newStrings[index] = s;
//            }
//            index ++;
//
//        }
//
//        return newStrings;
//
//    }

