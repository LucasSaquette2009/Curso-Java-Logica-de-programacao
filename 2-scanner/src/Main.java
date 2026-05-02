import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        double soma;

        System.out.println("CALCULADORA ADIÇÃO");
        System.out.print("Digite o primeiro numero: ");
        num1 = sc.nextDouble();
        System.out.print("Digite o segundo numero: ");
        num2 = sc.nextDouble();

        soma = num1 + num2;
        System.out.println("A soma é igual á: " + soma);

        sc.close();
    }
}