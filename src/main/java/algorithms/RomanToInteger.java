package algorithms;

import java.lang.Character;
import java.lang.Integer;
import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();

        //construct char map
        charMap.put('I', 1);
        charMap.put('V', 5);
        charMap.put('X', 10);
        charMap.put('L', 50);
        charMap.put('C', 100);
        charMap.put('D', 500);
        charMap.put('M', 1000);

        char[] romanChar = s.toCharArray();
        int result = 0;

        for (int i = 0; i < romanChar.length; ++i) {
            if (i < romanChar.length - 1 && charMap.get(romanChar[i + 1]) > charMap.get(romanChar[i])) {
                result += charMap.get(romanChar[i + 1]) - charMap.get(romanChar[i]);
                i++;
            }
            else
                result += charMap.get(romanChar[i]);
        }

        return result;
    }
}
