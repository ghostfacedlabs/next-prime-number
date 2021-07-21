package com.ghostfacedlabs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This application will provide you with the next prime number after the provided number");
        System.out.println("--------------------------------------");

        while (true) {
            System.out.print("Please enter a positive number: ");
            String input = scanner.nextLine();
            int number;

            try {
                number = Integer.parseInt(input);
            } catch (NumberFormatException n) {
                System.out.println("Please try again...");
                continue;
            }

            System.out.println(getNextPrime(number));
            break;
        }
    }

    public static int getNextPrime(int number) {
        while (!isPrime(++number)) {

        }
        return number;
    }

    public static boolean isPrime(int number) {
        if (number == 2 || number == 3) {
            return true;
        }

        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        int divisor = 6;
        while (divisor * divisor - 2 * divisor + 1 <= number)
        {

            if (number % (divisor - 1) == 0)
                return false;

            if (number % (divisor + 1) == 0)
                return false;

            divisor += 6;

        }
        return true;
    }
}
