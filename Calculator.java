import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number :");
        int num1 = sc.nextInt();

        System.out.println("Enter operator (+,-,*,/) :");
        char operator = sc.next().charAt(0);

        System.out.println("Enter the second number :");
        int num2 = sc.nextInt();

        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator");
        }
        System.out.println("Result: " + result);
    }
}
