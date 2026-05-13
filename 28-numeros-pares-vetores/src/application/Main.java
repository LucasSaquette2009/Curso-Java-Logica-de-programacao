package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n, totalPairs;
        System.out.print("How many numbers will you enter? ");
        n = sc.nextInt();

        int[] number = new int[n];

        for (int i = 0; i < number.length; i++) {
            System.out.printf("Enter a %dº number: ", i + 1);
            number[i] = sc.nextInt();
        }

        totalPairs = 0;
        System.out.println("\nEven numbers:");
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                System.out.printf("%d ", number[i]);
                totalPairs++;
            }
        }
        System.out.println("\nQuantity of pairs = " + totalPairs);

        sc.close();
    }
}
