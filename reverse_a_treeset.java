package work;

import java.util.*;

public class ReverseTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<>();

        ts.add(3);
        ts.add(4);
        ts.add(6);
        ts.add(1);
        System.out.println(ts);
        Set<Integer> s=ts.descendingSet();
        System.out.println(s);
    }
}
