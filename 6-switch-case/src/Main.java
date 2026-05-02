import java.util.Locale;
import java.util.Scanner;
void main () {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int dia;
    System.out.print("Dia da semana (em numero): ");
    dia = sc.nextInt();

    switch (dia) {
        case 1:
            System.out.println("Segunda");
            break;
        case 2:
            System.out.println("Terça");
            break;
        case 3:
            System.out.println("Quarta");
            break;
        case 4:
            System.out.println("Quinta");
            break;
        case 5:
            System.out.println("Sexta");
            break;
        case 6:
            System.out.println("Sabádo");
            break;
        case 7:
            System.out.println("Domingo");
            break;
        default:
            System.out.println("Dia da semana inválido!");
            break;
    }

    sc.close();
}