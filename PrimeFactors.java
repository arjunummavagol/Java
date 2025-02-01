//Java program to find the prime factors of a given number

import java.util.Scanner;

public class PrimeFactors {
    public static void findPrimeFactors(int num) {
        System.out.print("Prime factors of " + num + " are: ");
        
        // Step 1: Remove factors of 2
        while (num % 2 == 0) {
            System.out.print(2 + " ");
            num /= 2;
        }

        // Step 2: Check for odd factors from 3 to sqrt(num)
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }

        // Step 3: If num is still greater than 2, it must be prime
        if (num > 2) {
            System.out.print(num);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        findPrimeFactors(number);
        scanner.close();
    }
}
