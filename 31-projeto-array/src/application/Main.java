package application;

import entities.Rent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rent[] rent = new Rent[10];

        int howMany;
        System.out.print("How many rooms will be rented? ");
        howMany = sc.nextInt();

        for (int i = 0; i < howMany; i++) {
            sc.nextLine();
            System.out.printf("Rent #%d:%n", i + 1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();
            System.out.println("===================");

            rent[roomNumber] = new Rent(name, email);
        }

        System.out.println("Busy rooms:");
        for (int i = 0; i < 10; i++) {
            if (rent[i] != null) {
                System.out.println(i + ": " + rent[i]);
            }
        }

        sc.close();
    }
}
