package javaclass5homeworkweek9;


/*	Create a HashMap object called people that will store String keys and Integer values:
And use for each loop to iterate the value from Map.*/

import java.util.HashMap;
import java.util.Map;

public class Prog_9_HashMap {
    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<String, Integer>();
        people.put("John", 19);
        people.put("BObby", 22);
        people.put("Charli", 38);
        people.put("Denny", 43);


        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));


        }


    }

}
