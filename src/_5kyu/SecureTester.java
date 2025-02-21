package _5kyu;

public class SecureTester {
    public static void main(String[] args) {
        System.out.println(alphanumeric("1a9"));
    }

    public static boolean alphanumeric(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        String x = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!x.contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }
}
/*
public static boolean alphanumeric(String s) {
    return s.matches("[A-Za-z0-9]+");
    return s.matches("\\p{Alnum}+");
  }
 */