package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("How many values will there be in each vector? ");
        n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        System.out.println("Enter the values for vector A:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the values for vector B:");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println("Resulting vector:");
        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] + b[i];
            System.out.println(c[i]);
        }

        sc.close();
    }
}
