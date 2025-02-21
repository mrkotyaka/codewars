package _5kyu;

public class RgbToHex {
    public static void main(String[] args) {

        System.out.printf("%02X%02X%02X%n", 20, 255, 125);

        System.out.println(rgb(-20, 275, 125)); //00 FF 7D
    }


    public static String rgb(int r, int g, int b) {
        String Rgb = Integer.toHexString(r);
        String rGb = Integer.toHexString(g);
        String rgB = Integer.toHexString(b);
        if (r < 0) {
            Rgb = "00";
        }  else if (r > 255) {
            Rgb = "FF";
        }
        if (g < 0) {
            rGb = "00";
        }  else if (g > 255) {
            rGb = "FF";
        }
        if (b < 0) {
            rgB = "00";
        }  else if (b > 255) {
            rgB = "FF";
        }
        if (Integer.toHexString(r).length() < 2) {
            Rgb = "0" + Rgb;
        }
        if (Integer.toHexString(g).length() < 2) {
            rGb = "0" + rGb;
        }
        if (Integer.toHexString(b).length() < 2) {
            rgB = "0" + rgB;
        }
        return (Rgb + rGb + rgB).toUpperCase();

//        "%010d"

//        String hex = String.format("0%s", Integer.toHexString(r));
//        System.out.println(hex);
//        return hex;
//        return ("" + Integer.toHexString(r) + Integer.toHexString(g) + Integer.toHexString(b)).toUpperCase();
    }
}


/*
public static String rgb(int r, int g, int b) {
        return String.format("%02X%02X%02X", verify(r), verify(g), verify(b));
    }

    private static int verify(int i) {
        return i > 0 ? Math.min(255, i) : 0;
    }
 */