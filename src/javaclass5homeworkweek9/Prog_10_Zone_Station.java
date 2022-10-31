package javaclass5homeworkweek9;
//10.	Write the programme that tell you which line pass through particular stations. Just use Zone 1 stations name.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Prog_10_Zone_Station {
    public static void main(String[] args) {
        Prog_10_Zone_Station obj = new Prog_10_Zone_Station();
        obj.southKensington();
    }

    public void southKensington() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter line name ");
        String input = scan.next();
        switch (input) {
            case "Piccadilly":
            case "District":
            case "Circle":
                System.out.println("Line Pass through South Kensington");
                break;

            default:
                System.out.println("Line not passing from South Kensington");
                scan.close();
        }
    }
}