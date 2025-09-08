/* 2.Write a program to input two numbers and find the maximum between two numbers using the conditional/ternary operator. Sample Input: num1 = 10 num2 = 30 */


package Demo;

import java.util.Scanner;

public class Maximum_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Find maximum using ternary operator
        int max = (num1 > num2) ? num1 : num2;

        // Display result
        System.out.println("Maximum number is: " + max);

        sc.close();
    }
}

/*OUTPUT :
Enter first number: 20
Enter second number: 40
Maximum number is: 40 
 */