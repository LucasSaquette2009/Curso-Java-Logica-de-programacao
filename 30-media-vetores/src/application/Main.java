package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double averageVector, sumVector;

        System.out.print("How many elements will be in vector? ");
        n = sc.nextInt();

        double[] number = new double[n];

        sumVector = 0;
        for (int i = 0; i < number.length; i++) {
            System.out.printf("Enter a %d number: ", i + 1);
            number[i] = sc.nextDouble();
            sumVector += number[i];
        }

        averageVector = sumVector / number.length;

        System.out.printf("Average vector = %.3f\n", averageVector);
        System.out.println("Below average vector:");
        for (int i = 0; i < number.length; i++) {
            if (number[i] < averageVector) {
                System.out.printf("%.1f\n", number[i]);
            }
        }

        sc.close();
    }
}
