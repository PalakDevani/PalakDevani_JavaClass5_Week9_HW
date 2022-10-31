package javaclass5homeworkweek9;
// 5.	Write a Java program to iterate through all elements in an array list using Iterator.


import java.util.ArrayList;
import java.util.Iterator;

public class Prog_5_ArrayList_Iterator {

    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList();
        cityList.add("Cambridge");
        cityList.add("Scotland");
        cityList.add("Manchester");
        cityList.add("Blackpool");
        cityList.add("London");
        System.out.println("ArrayList: " + cityList);

        Iterator itr = cityList.iterator();
        System.out.println("Iterating through ArrayList:l ");
        while (itr.hasNext()) // returns next element of the arraylist
        {
            System.out.println(itr.next());
        }

    }

}
