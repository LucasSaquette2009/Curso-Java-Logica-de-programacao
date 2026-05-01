import java.util.Locale;
import java.util.Scanner;
void main() {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    double plano = 50.0;
    double minutos;

    System.out.print("Minutos: ");
    minutos = sc.nextDouble();

    if (minutos > 100) {
        //esse "+=" é o operador acumulativo, ele poupa mais linha de código apenas.
        plano += (minutos - 100) * 2;
    }

    System.out.println("Valor a pagar: " + plano);
}
