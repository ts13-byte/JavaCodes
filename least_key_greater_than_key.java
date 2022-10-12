package work;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class least_key_greater_than_key {
    public static void main(String[] args) {

        HashMap<Integer, String> hs
                = new HashMap<>();

        hs.put(100,"ab");
        hs.put(140,"bc");
        hs.put(150,"cd");
        hs.put(250,"de");
        hs.put(318,"th");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value: ");
        int val=sc.nextInt();
try {
    Map.Entry<Integer, String> h = hs.entrySet().stream().filter(entry -> entry.getKey() >= val).findFirst()
            .get();
    System.out.println(h);
}
catch(Exception e){
    System.out.println(e);
        }

    }
}
