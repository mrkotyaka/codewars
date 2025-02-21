package _5kyu;

public class PigLatin {
    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool !")); // igPay atinlay siay oolcay
    }

    public static String pigIt(String str) {
        String[]  words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.length() ==1 && !Character.isLetter(word.charAt(0))) {
                sb.append(" ").append(word);
                break;
            }
            String firstLetter = word.substring(0, 1);
            word = word.substring(1);
            word += firstLetter + "ay";
            sb.append(" ").append(word);

        }
        return sb.toString().trim();
    }
}

/*
public static String pigIt(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }
 */