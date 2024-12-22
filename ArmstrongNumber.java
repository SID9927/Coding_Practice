// A number is an Armstrong number if the sum of its digits raised to the power of the number of digits equals the number itself.

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int originalNumber = number;
        int sum=0;
        int digits=String.valueOf(number).length();
    }
}