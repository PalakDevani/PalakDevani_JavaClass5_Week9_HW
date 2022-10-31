package javaclass5homeworkweek9;
//3.	Write a Java program to reverse an array of integer values.


import java.util.Arrays;

public class Prog_3_Reverse_Array {
    public static void main(String[] args) {
        Prog_3_Reverse_Array obj = new Prog_3_Reverse_Array();
        obj.reverseArray();
    }

    public void reverseArray() {
        int[] my_array1 = {
                10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.println("Original array : " + Arrays.toString(my_array1));
        for (int i = 0; i < my_array1.length / 2; i++) {

            int temp = my_array1[i];
            my_array1[i] = my_array1[my_array1.length - i - 1];
            my_array1[my_array1.length - i - 1] = temp;
        }
        System.out.println("Reverse array : " + Arrays.toString(my_array1));
    }
}