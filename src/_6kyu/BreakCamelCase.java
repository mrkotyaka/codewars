package _6kyu;

public class BreakCamelCase {
    public static void main(String[] args) {
        System.out.println(camelCase("camelCasing"));
    }

    public static String camelCase(String input) {
        char[] charArray = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        if  (charArray.length <= 1) {
            return input;
        }
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isUpperCase(charArray[i])) {
                sb.append(" ");
            }
            sb.append(charArray[i]);
        }
        return sb.toString();
    }
}

/*
public static String camelCase(String input) {
        return input.replaceAll("([A-Z])", " $1");
  }
 */