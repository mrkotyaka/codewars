package _5kyu;

public class FirstNonRepeatingLetter {
    public static void main(String[] args) {
        System.out.println(firstNonRepeatingLetter("moon-men"));
    }

    public static String firstNonRepeatingLetter(String s) {
        if  (s == null || s.isEmpty()) {
            return "";
        }
        if  (s.length() == 1) {
            return s;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.toLowerCase().charAt(i);
            String chIs = String.valueOf(s.charAt(i));
            int cnt = 0;
            for (int j = 0; j < s.length(); j++) {
                if (ch == s.toLowerCase().charAt(j) && i != j) {
                    cnt++;
                    break;
                }
            }
            if (cnt == 0) {
                return chIs;
            }
        }
        return "";
    }
}

/*
public static String firstNonRepeatingLetter(String s){
    for (String str : s.split("")) {
      if (s.toUpperCase().indexOf(str.toUpperCase()) == s.toUpperCase().lastIndexOf(str.toUpperCase())) return str;
     }
    return "";
  }
 */