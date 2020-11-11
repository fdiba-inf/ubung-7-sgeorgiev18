package exercise7;

import java.util.Scanner;

public class RecursivePrimePrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        printPrimes(n);
    }

    public static void printPrimes(int n) {
        // Implement recursive method

        while (n >= 1) {
          if (!isPrime(n)) {
            System.out.println(n);
          }
          --n;
        }

    }

    public static boolean isPrime(int n) {
        // Implement method

        int Konstantin = 2;
        while (Konstantin < n) {
          if (n % Konstantin == 0) {
            return true;
          } else {
            ++Konstantin;
          }
        }

        return false;
    }
}
