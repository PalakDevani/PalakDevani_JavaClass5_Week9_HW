package calculate;


import java.util.Scanner;

public class Main extends Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        System.out.println("Enter one of the symbol +, - ,*,/ ");
        char ch = scanner.next().charAt(0);

        Calculator obj = new Calculator();
        obj.calculateResult(a, b, ch);
        System.out.println("Would you like to do more calculation");

        char result = scanner.next().charAt(0);
        while (result == 'Y' || result == 'y') {
            System.out.println("Enter first number: ");
            int a1 = scanner.nextInt();
            System.out.println("Enter second number: ");
            int b1 = scanner.nextInt();
            System.out.println("Enter one of the symbol +, - ,*,/ ");
            char ch1 = scanner.next().charAt(0);
            Calculator obj1 = new Calculator();
            obj.calculateResult(a1, b1, ch1);
            break;


        }
        scanner.close();
    }
}
