package javaclass5homeworkweek9;

// 6.Write a Java program to retrieve an element (at a specified index) from a given array list

import java.util.ArrayList;

public class Prog_6_RetriveAnElement_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        list.add(12);

        list.remove(4); // removes specific index from print statement
        for (int data : list) {
            System.out.println(data);
        }
        System.out.println("After removing value from the index 4");


    }
}