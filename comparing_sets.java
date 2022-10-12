package work;

import java.util.HashSet;

public class ComparingTheSets{
    public static void main(String[] args) {

        HashSet<Integer> h1=new HashSet<>();
        HashSet<Integer> h2=new HashSet<>();
        h1.add(1);
        h1.add(3);
        h1.add(4);
        h1.add(5);

        h2.add(3);
        h2.add(7);
        h2.add(1);

        h2.retainAll(h1);
        System.out.println(h2);
    }
}
