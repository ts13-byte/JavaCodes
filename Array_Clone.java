package work;
import java.util.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ArrayCloning {
    public static void main(String[] args) {
        /*List<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);
        ArrayList<Integer> l1=new ArrayList<>();
        //l1.addAll(l);

        System.out.println(l1);*/

        ArrayList<Integer> AL1 = new ArrayList<>();
        AL1.add(1);
        AL1.add(2);
        AL1.add(3);
        AL1.add(4);

        ArrayList<String> AL2= new ArrayList<>();
        AL2 = (ArrayList)AL1.clone();
        System.out.println("Original ArrayList : " + AL1);
        System.out.println("Copied Arraylist using clone method: " + AL2);


        List<Integer> newList=AL1.stream().collect(Collectors.toList());
        System.out.println("copied list using stream API: "+ newList);
    }
}
