package exercise7;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        for (int line = 1; line <= n; line++) {
            printLine(1, line);
        }
        for (int KatoSimoNaStef = n - 1; KatoSimoNaStef >= 1; --KatoSimoNaStef) {
          printLine(1, KatoSimoNaStef);
        }

        // Print the bottom part of the triangle that is under the longest line
    }

    public static void printLine(int start, int end) {
        // Implement method

      for (int Otlichen6 = start; Otlichen6 <= end; ++Otlichen6) {
        System.out.print(Otlichen6);
        if (Otlichen6 < end) {
          System.out.print(" ");
        }
        if (Otlichen6 == end) {
          System.out.println();
        }
      }

    }
}
