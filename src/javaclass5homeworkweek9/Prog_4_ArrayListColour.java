package javaclass5homeworkweek9;
//	Write a Java program to create a new array list, add some colours (string) and printout the collection using for each loop.


import java.util.ArrayList;

public class Prog_4_ArrayListColour {
    public static void main(String[] args) {
        ArrayList<String> colourList = new ArrayList();
        colourList.add("Red");
        colourList.add("Blue");
        colourList.add("Brown");
        colourList.add("Pink");
        colourList.add("Yellow");
        colourList.add("Green");
        colourList.add("Orange");
        colourList.add("Purple");
        colourList.add("White");

        for (String colourName : colourList) {
            System.out.println(colourName);

        }
    }

}
