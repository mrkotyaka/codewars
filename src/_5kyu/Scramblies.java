package _5kyu;

import java.util.Map;
import java.util.HashMap;

public class Scramblies {

    public static void main(String[] args) {

        System.out.println("qod " + scramble("qod", "o")); //, true);
        System.out.println("rkqodlw " + scramble("rkqodlw", "world")); //, true);
        System.out.println("scedewaraaooqqyt " + scramble("cedewaraaossoqqyt", "codewars")); //,true);
        System.out.println("katas " + scramble("katas", "steak")); //,false);
        System.out.println("scriptjavx " + scramble("scriptjavx", "javascript")); //,false);
        System.out.println("scriptingjava " + scramble("scriptingjava", "javascript")); //,true);
        System.out.println("scriptsjava " + scramble("scriptsjava", "javascripts")); //,true);
        System.out.println("javscripts " + scramble("javscripts", "javascript")); //,false);
        System.out.println("aabbcamaomsccdd " + scramble("aabbcamaomsccdd", "commas")); //,true);
        System.out.println("commas " + scramble("commas", "commas")); //,true);
        System.out.println("sammoc " + scramble("sammoc", "commas")); //,true);
        String s1 = "abcdefghijklmnopqrstuvwxyz".repeat(10_000);
        String s2 = "zyxcba".repeat(9_000);

        System.out.println("abcdefghijklmnopqrstuvwxyz " + scramble(s1, s2)); //, true);
    }

    public static boolean scramble(String str1, String str2) {


        Map<Integer, Integer> cnt = new HashMap<>();

        str2.chars().forEach(i -> cnt.put(i, cnt.getOrDefault(i, 0) + 1));
        str1.chars().filter(cnt::containsKey).forEach(i -> cnt.put(i, cnt.get(i) - 1));
        return cnt.values().stream().noneMatch(i -> i > 0);


//        List<String> list1 = Arrays.asList(str1.split(""));
//        List<String> list2 = Arrays.asList(str2.split(""));
////        String[] arr1 = str1.split("");
////        String[] arr2 = str2.split("");
//
//        for (String str : list2) {
//            if (!list1.contains(str)) {
//                return false;
//            }
//            list1.set(list1.indexOf(str), "");
//        }
//        return true; //Arrays.asList(arr2).contains(str2);

//        String[] arr1 = str1.split("");
//        String[] arr2 = str2.split("");
//
//        for (String str : arr2) {
//            if (!Arrays.asList(Arrays.stream(arr1).toArray()).contains(str)) {
//                return false;
//            }
//            arr1[Arrays.asList(arr1).indexOf(str)] = "";
//        }
//        return true;
    }
}

/*
        System.out.

println("qod "+scramble("qod", "o")); //, true);
        System.out.

println("rkqodlw "+scramble("rkqodlw", "world")); //, true);
        System.out.

println("scedewaraaooqqyt "+scramble("cedewaraaossoqqyt", "codewars")); //,true);
        System.out.

println("katas "+scramble("katas", "steak")); //,false);
        System.out.

println("scriptjavx "+scramble("scriptjavx", "javascript")); //,false);
        System.out.

println("scriptingjava "+scramble("scriptingjava", "javascript")); //,true);
        System.out.

println("scriptsjava "+scramble("scriptsjava", "javascripts")); //,true);
        System.out.

println("javscripts "+scramble("javscripts", "javascript")); //,false);
        System.out.

println("aabbcamaomsccdd "+scramble("aabbcamaomsccdd", "commas")); //,true);
        System.out.

println("commas "+scramble("commas", "commas")); //,true);
        System.out.

println("sammoc "+scramble("sammoc", "commas")); //,true);


Set<String> idsSet = Arrays.stream(ids).collect(Collectors.toSet());
        return Arrays.

stream(targetIds)
                .

filter(id ->!idsSet.

contains(id)).

count() ==ids.length;


        Arrays.

stream(ids).

forEach(System.out.println());
boolean arr = Arrays.asList(Arrays.stream(ids).toArray()).contains("o");
        System.out.

println(Arrays.stream(ids).

filter(x ->x.

equals("a")).

count());
        return false;

        return Arrays.

stream(targetIds).

anyMatch(id ->Arrays.

stream(targetIds).

filter(id ==id);


int[] arr1 = {10, 10, 13, 14, 18, 24, 24, 30};
int[] arr2 = {10, 10, 11, 24, 24};

Set<String> set = new TreeSet<>();

        for(
int i = 0;
i<arr2.length;i++){
        if(Arrays.

binarySearch(arr1, arr2[i]) >=0){
        set.

add(arr2[i]);
            }
                    }
                    System.out.

println(set);


return false;


        for(
int i = 0;
i<targetIds.length;i++){

        Arrays.

stream(targetIds[i])

            System.out.

println(Arrays.asList(Arrays.stream(targetIds[i]).

toArray()).

contains(ids));
        }
        stream.

filter(x->x.

toString().

length() ==3).

forEach(System.out::println);
        return false;

                for(
int i = 0;
i<arr2.length;i++){
boolean flag = false;
            if(str1.

contains(arr2[i])){
        for(
int j = 0;
j<arr1.length;j++){
        if(arr1[j].

equals(arr2[i])){
arr1[j]="";
flag =true;
        break;
        }
        }
        if(!flag){
        return false;
        }
        }else{
        return false;
        }
        }
        return true;


String[] arr1 = str1.split("");
String[] arr2 = str2.split("");
        for(
int i = 0;
i<arr2.length;i++){
boolean flag = false;
            if(str1.

contains(arr2[i])){
        for(
int j = 0;
j<arr1.length;j++){
        if(arr1[j].

equals(arr2[i])){
arr1[j]="";
flag =true;
        break;
        }
        }
        if(!flag){
        return false;
        }
        }else{
        return false;
        }
        }
        return true;
        */
