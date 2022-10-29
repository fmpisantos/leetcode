package src.classes;

import java.util.HashMap;
import java.util.Map;

public class LenghtOfLongestSubstring {
        public static int lengthOfLongestSubstring(String s) {
            Map<Integer, Integer> positions = new HashMap<>();
            int helper;
            int max = 0;
            int letter;
            int lastFound = 0;
            for( int i = 0; i < s.length(); i++ ){
                letter = s.charAt(i) - 'a';
                if(!positions.containsKey(letter))
                    helper = lastFound;
                else {
                    helper = positions.get(letter);
                    helper = Math.max(helper,lastFound);
                    lastFound = helper;
                }
                if( max < i + 1 - helper )
                    max = i + 1 - helper;
                positions.put(letter, i + 1);
            }
            return max;
        }
}
