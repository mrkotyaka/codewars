package _5kyu;

import java.util.*;

public class MergedStringChecker {
    public static void main(String[] args) {
        System.out.println(isMerge("codewars", "code", "wars"));
    }

    public static boolean isMerge(String s, String l, String r) {
        if (s.length() != l.length() + r.length()) return false;
        if (s.length() == 0) return true;
        if (l.length() == 0) return s.equals(r);
        if (r.length() == 0) return s.equals(l);
        if (s.charAt(0) == l.charAt(0) && isMerge(s.substring(1), l.substring(1), r)) return true;
        if (s.charAt(0) == r.charAt(0) && isMerge(s.substring(1), l, r.substring(1))) return true;
        return false;
    }
//        Stack<Character> stack1 = new Stack<>(new char[part1.toCharArray()]);
//        Stack<Character> stack2 = new Stack<>();
//        List<Character> list = new ArrayList<>();
//        part1.chars().forEach(stack1::push);
//        for (int i = 0; i < s.length(); i++) {
//            if (stack1.empty()){
//                break;
//            }
//            if (String.valueOf(s.charAt(i)).equals(stack1.peek())) {
//                list.add(stack1.pop());
////                list.add(i,String.valueOf(s.charAt(i)));
//            }
//        }
//        part2.chars().forEach(stack1::push);
//
//        for (int i = 0; i < s.length(); i++) {
//            if (stack2.empty()){
//                break;
//            }
//            if (String.valueOf(s.charAt(i)) == stack2.peek()) {
//                stack2.pop();
//                list.add(i,String.valueOf(s.charAt(i)));
//            }
//        }
//        String result = "";
//        for (int i = 0; i < list.size(); i++) {
//            result += list.get(i);
//        }
//        return s.equals(result);

//        int j1 = 0, j2 = 0;
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = j1; j < part1.length(); j++) {
//                if (s.charAt(i) == part1.charAt(j)) {
//                    s = s.replace(String.valueOf(s.charAt(i)), "");
//                    i--;
//                    j1 = j;
//                    part1 = part1.replace(String.valueOf(part1.charAt(j)), "");
//                    break;
//                }
//            }
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = j2; j < part2.length(); j++) {
//                if (s.charAt(i) == part2.charAt(j)) {
//                    s = s.replace(String.valueOf(s.charAt(i)), "");
//                    i--;
//                    j2 = j;
//                    part2 = part2.replace(String.valueOf(part2.charAt(j)), "");
//                    break;
//                }
//            }
//            if (s.isEmpty()) {
//                return true;
//            }
//        }
//        System.out.println(s);
//        System.out.println(part2);
//        return false;
//
//        Map<Character, String> map = new HashMap<>();
//        char[] text = s.toCharArray();
//        char[] soursePart1 = part1.toCharArray();
//        char[] soursePart2 = part2.toCharArray();
//        int x1 = 0;
//        int x2 = 0;
//        for (int i = 0; i < text.length; i++) {
//            for (int j = x1; j < soursePart1.length; j++) {
//                if (text[i] == soursePart1[j]) {
//                    map.put(text[i], "soursePart1 " + j);
//                    x1 = j + 1;
//                    break;
//                }
//            }
//            if (!map.containsKey(text[i])) {
//                for (int j = x2; j < soursePart2.length; j++) {
//                    if (text[i] == soursePart2[j]) {
//                        map.put(text[i], "soursePart2 " + j);
//                        x2 = j + 1;
//                    }
//                }
//            }
//        }
//        return map.size() == text.length;
}

