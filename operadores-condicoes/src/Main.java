import java.util.Scanner;
import java.util.Locale;
void main() {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("Estruturas condicionais!!\n");

    float horario;
    System.out.print("Que horas são? ");
    horario = sc.nextFloat();

    if (horario < 13) {
        System.out.println("Bom dia");
    }
    else if (horario < 18) {
        System.out.println("Boa tarde");
    }
    else if (horario > 24){
        System.out.println("Horario errado!");
    }
    else {
        System.out.println("Boa noite");
    }

    int numero;
    System.out.print("Digite um numero: ");
    numero = sc.nextInt();

    if (numero % 2 == 0) {
        System.out.println("Par");
    }
    else {
        System.out.println("Impar");
    }

    sc.close();
}