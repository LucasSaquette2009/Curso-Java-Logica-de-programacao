import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    int N;
    int soma = 0;

    System.out.print("Escolha o total de números da soma: ");
    N = sc.nextInt();

    for (int i = 0; i < N; i++) {
        System.out.print("Digite o " + (i + 1) + "º Numero: ");
        int x = sc.nextInt();
        soma += x;
    }

    System.out.println("Soma total:" + soma);

    sc.close();
}