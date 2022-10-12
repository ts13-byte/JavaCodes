package work;

import java.util.Arrays;
import java.util.HashSet;

//HashSet to an Array.

public class Program_4 {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("sara");
        hs.add("saraa");
        hs.add("saraaa");
        hs.add("saraaaa");
       // String arr[]=new String[hs.size()];

        String[] names=hs.stream().toArray(String[]::new);
        System.out.println(Arrays.toString(names));
    }
}
