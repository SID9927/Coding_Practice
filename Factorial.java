import java.util.Scanner;

// Factorial of a number is the product of all positive integers less than or equal to the number.
// Formula: n! = n * (n - 1) * ... * 1
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();
        long fact=1;

        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }
}
