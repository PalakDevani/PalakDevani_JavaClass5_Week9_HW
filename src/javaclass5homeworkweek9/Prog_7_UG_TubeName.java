package javaclass5homeworkweek9;

// 7.Write a Java program to test an array list is empty or not. Define array list with underground tube names


import java.util.ArrayList;

public class Prog_7_UG_TubeName {
    public static void main(String[] args) {
        ArrayList<String> tubeName = new ArrayList();
        // using boolean check if the list is empty or not
        boolean ans = tubeName.isEmpty();
        if (ans == true) {
            System.out.println("The ArrayList is Empty");
        } else {
            System.out.println("The ArrayList is Not Empty"); // ref: https://www.geeksforgeeks.org/arraylist-isempty-java-example/
        }
        tubeName.add("Piccadilly");
        tubeName.add("District");
        tubeName.add("Jubilee");
        tubeName.add("Central");
        tubeName.add("Circle");
        System.out.println("Addition of elements to the array list: " + tubeName);

// checking if list is empty or not
        if (tubeName.isEmpty()) {
            System.out.println("The ArrayList is empty");
        } else {
            System.out.println("The Arraylist is not empty");
        }
    }
}
