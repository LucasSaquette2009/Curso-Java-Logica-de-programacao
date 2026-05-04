import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char repeat;
        do {
            System.out.print("Temperatura em Celsius: ");
            double celsius = sc.nextDouble();
            double formulaCelsius = 9.0 * celsius / 5.0 + 32.0;

            System.out.println("Temperatura em Fahrenheit: " + formulaCelsius);

            System.out.print("Quer repetir? ");
            repeat = sc.next().charAt(0);

            //clear
            for (int i = 0; i < 50; i++) System.out.println();
        } while (repeat == 's');

        sc.close();
    }
}