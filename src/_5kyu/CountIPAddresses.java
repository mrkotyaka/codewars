package _5kyu;

import java.util.Arrays;

public class CountIPAddresses {
    public static void main(String[] args) {
        System.out.println(4294967295L);
        System.out.println((1l << 32l) - 1l);
        System.out.println(ipsBetween("0.0.0.0", "255.255.255.255")); // 50,
//long x = (255*255*255*255)+(255*255*255)+(255*255)+255;
//long x = 4294967296L;
//        System.out.println( x);
//        System.out.println( 256*256*256*256L);
//        System.out.println( (256*256*256*255L)+(256*256*255)+(256*255)+256L);
//        System.out.println( (10*256*256*255L)+(256*256*255)+(256*255)+0);
//        System.out.println( (10*256*256*255L)+(256*256*255)+(256*255)+50);
    }

    public static long ipsBetween(String start, String end) {
        int[] ipStart = new int[4];
        int[] ipEnd = new int[4];
        for (int i = 0; i < 4; i++) {
            ipStart[i] = Integer.parseInt(start.split("\\.")[i]);
            ipEnd[i] = Integer.parseInt(end.split("\\.")[i]);
        }

        return ((ipEnd[0] * 256 * 256 * 256L) + (ipEnd[1] * 256 * 256L) + (ipEnd[2] * 256L) + ipEnd[3])
                - ((ipStart[0] * 256 * 256 * 256L) + (ipStart[1] * 256 * 256L) + (ipStart[2] * 256L) + ipStart[3]);

//        System.out.println(Arrays.toString(ipStart));
//        System.out.println(Arrays.toString(ipEnd));

//        long countIP;
//        long ipS = (ipStart[3]*256*256*255L)+(ipStart[2]*256*255L)+(ipStart[1]*255L)+ipStart[0];
//        long ipE = (ipEnd[3]*256*256*255L)+(ipEnd[2]*256*255L)+(ipEnd[1]*255L)+ipEnd[0];

//        System.out.println(ipS);
//        System.out.println(ipE);

//        return countIP;
    }
}

/*
public class CountIPAddresses {

	public static long ipsBetween(String start, String end) {
		return convertToLong(end) - convertToLong(start);
	}

  private static long convertToLong(String ip) {
    long res = 0;
    for (String s : ip.split("[.]") )
      res = res * 256 + Long.parseLong(s);
    return res;
  }
}
 */