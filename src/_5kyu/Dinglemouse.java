package _5kyu;

import java.util.*;

public class Dinglemouse {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(whoEatsWho("fox,bug,chicken,grass,sheep")));
    }

    private static Set<String> emptySet = Collections.EMPTY_SET;
    private static Map<String, Set<String>> eaters = new HashMap<String, Set<String>>();

    static {
        eaters.put("antelope", new HashSet<String>(Arrays.asList("grass")));
        eaters.put("big-fish", new HashSet<String>(Arrays.asList("little-fish")));
        eaters.put("bug", new HashSet<String>(Arrays.asList("leaves")));
        eaters.put("bear", new HashSet<String>(Arrays.asList("big-fish", "bug", "chicken", "cow", "leaves", "sheep")));
        eaters.put("chicken", new HashSet<String>(Arrays.asList("bug")));
        eaters.put("cow", new HashSet<String>(Arrays.asList("grass")));
        eaters.put("fox", new HashSet<String>(Arrays.asList("chicken", "sheep")));
        eaters.put("giraffe", new HashSet<String>(Arrays.asList("leaves")));
        eaters.put("lion", new HashSet<String>(Arrays.asList("antelope", "cow")));
        eaters.put("panda", new HashSet<String>(Arrays.asList("leaves")));
        eaters.put("sheep", new HashSet<String>(Arrays.asList("grass")));
    }

    public static String[] whoEatsWho(final String zoo) {
        List<String> zooLst = new ArrayList<String>(Arrays.asList(zoo.split(","))),
                ansLst = new ArrayList<String>(Arrays.asList(zoo));

        for (int n = 0; n < zooLst.size(); n++) {
            while (n > 0 && eaters.getOrDefault(zooLst.get(n), emptySet).contains(zooLst.get(n - 1)))
                ansLst.add(String.format("%s eats %s", zooLst.get(n--), zooLst.remove(n--)));

            while (n >= 0 && n != zooLst.size() - 1 && eaters.getOrDefault(zooLst.get(n), emptySet).contains(zooLst.get(n + 1)))
                ansLst.add(String.format("%s eats %s", zooLst.get(n), zooLst.remove(n + 1)));
        }
        ansLst.add(String.join(",", zooLst));
        return ansLst.toArray(new String[0]);
    }

}