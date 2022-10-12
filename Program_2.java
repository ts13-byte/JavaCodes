package work;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

//Write a Java program to get the portion of a  map whose keys are less than (or equal to, if inclusive is true) a given key using streams.

public class Program_2 {
    public static void main(String[] args) {
        // Map - Rank of top Cricket Nations
        Map<Integer, String> rankOfCricketNations = new
                HashMap<Integer, String>();

        // add nations - August-2021 test rankings
        rankOfCricketNations.put(1, "New Zealand");
        rankOfCricketNations.put(2, "India");
        rankOfCricketNations.put(3, "Australia");
        rankOfCricketNations.put(4, "England");
        rankOfCricketNations.put(5, "Pakistan");
        rankOfCricketNations.put(6, "South Africa");
        rankOfCricketNations.put(7, "West Indies");

        int val=5;
        Map<Integer,String> filteredMap=rankOfCricketNations.entrySet().stream().filter(entry->entry.getKey()<=val).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(filteredMap);




    }



}
