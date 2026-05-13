package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("How many numbers are you going to enter? ");
        n = sc.nextInt();

        double[] number = new double[n];

        for(int i = 0; i < number.length; i++) {
            System.out.printf("Enter a %dº number: ", i+1);
            number[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for(int i = 0; i < number.length; i++) {
            sum += number[i];
        }

        double average = sum / number.length;

        System.out.print("Values = ");
        for(int i = 0; i < number.length; i++) {
            System.out.printf("%.2f ", number[i]);
        }

        System.out.printf("%nSum = %.2f%n", sum);
        System.out.printf("Average = %.2f", average);

        sc.close();
    }
}
