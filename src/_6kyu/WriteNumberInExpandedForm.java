package _6kyu;

public class WriteNumberInExpandedForm {
    public static void main(String[] args) {
        System.out.println(expandedForm(90010)); // "4000000 + 900000 + 80000 + 2000 + 300 + 40 + 2";
    }

    public static String expandedForm(int num) {
        if (num == 0) {
            return "0";
        }
        String number = String.valueOf(num);
        int len = number.length();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (number.charAt(i) != '0') {
                if (i != 0) result.append(" + ");
                result.append(number.charAt(i)).append("0".repeat(len - i - 1));
            }
        }
        return result.toString();
    }
}
