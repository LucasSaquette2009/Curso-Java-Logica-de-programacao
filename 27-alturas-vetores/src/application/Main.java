package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, nMinors;
        double totalHeight, averageHeight, percentageMinors;


        System.out.print("How many people will be type? ");
        n = sc.nextInt();

        String[] name = new String[n];
        int[] age = new int[n];
        double[] height = new double[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("Data of the %dº person%n", i+1);
            System.out.print("Name: ");
            name[i] = sc.nextLine();
            System.out.print("Age: ");
            age[i] = sc.nextInt();
            System.out.print("Height: ");
            height[i] = sc.nextDouble();
        }

        totalHeight = 0;
        nMinors = 0;
        for (int i = 0; i < n; i++) {
            if(age[i] < 16) {
                nMinors++;
            }
            totalHeight += height[i];
        }

        averageHeight = totalHeight / n;
        percentageMinors = ((double)nMinors / n) * 100;

        System.out.printf("Average height = %.2f", averageHeight);

        System.out.printf("People under 16 years old: %.2f%%\n", percentageMinors);

        for (int i = 0; i < n; i++) {
            if (age[i] < 16) {
                System.out.println(name[i]);
            }
        }

        sc.close();
    }
}
