package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers are you going to type?(0-10): ");
        int n = sc.nextInt();
        int[] number = new int[n];

        for (int i = 0; i < number.length; i++) {
            System.out.print("Enter a number: ");
            number[i] = sc.nextInt();
        }

        System.out.println("Numbers negatives: ");

        for (int i = 0; i < number.length; i++) {
            if (number[i] < 0) {
                System.out.println(number[i]);
            }
        }

        sc.close();
    }
}
