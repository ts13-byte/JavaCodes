package work;

import java.util.ArrayList;
import java.util.Scanner;

//To replace the element at specific index with another number.

public class ReplaceTheElement {
    public static void main(String[] args) {

        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        System.out.println("before the replacement array: "+ nums);

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the replacement number: ");
        int replacement=sc.nextInt();

        nums.set(2,replacement);

        System.out.println("after the replacement: "+ nums);

    }
}
