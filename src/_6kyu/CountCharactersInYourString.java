package _6kyu;

import java.util.HashMap;
import java.util.Map;

public class CountCharactersInYourString {
    public static void main(String[] args) {
        System.out.println(count(""));
    }

    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }
}

/*
public static Map<Character, Integer> count(String s) {
    Map<Character, Integer> M = new HashMap();
    for (char c : s.toCharArray())
        M.put(c, M.getOrDefault(c, 0) + 1);
    return M;
}
 */