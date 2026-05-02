import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    double num1;
    double num2;
    double conta;
    int opcao;
    //Menu opções
    System.out.println("""
            Projeto juntando funções que aprendi
            Qual função deseja?
            1.Soma
            2.Subtração
            3.Divisão
            4.Multiplicação
            5.Raiz quadrada
            6.Impar ou Par
            7.Potenciação
            8.Soma Quantos quiser
            """);
    System.out.print("Opção: ");
    opcao = sc.nextInt();

    switch (opcao) {
        case 1://somar
            for (int y = 0; y < 50; ++y) System.out.println();

            System.out.print("Primeiro número: ");
            num1 = sc.nextDouble();

            System.out.print("Segundo número: ");
            num2 = sc.nextDouble();

            conta = num1 + num2;

            System.out.println("Resultado da soma: " + conta);
            break;
        case 2://subtrair
            for (int y = 0; y < 50; ++y) System.out.println();

            System.out.print("Primeiro número: ");
            num1 = sc.nextDouble();
            System.out.print("Segundo número: ");
            num2 = sc.nextDouble();
            conta = num1 - num2;

            System.out.println("Resultado da subtração: " + conta);

            break;
        case 3://dividir
            for (int y = 0; y < 50; ++y) System.out.println();

            System.out.print("Primeiro número: ");
            num1 = sc.nextDouble();
            System.out.print("Segundo número: ");
            num2 = sc.nextDouble();
            conta = num1 / num2;

            System.out.println("Resultado da divisão: " + conta);
            break;
        case 4://multiplicar
            for (int y = 0; y < 50; ++y) System.out.println();

            System.out.print("Primeiro número: ");
            num1 = sc.nextDouble();
            System.out.print("Segundo número: ");
            num2 = sc.nextDouble();
            conta = num1 * num2;

            System.out.println("Resultado da multiplicação: " + conta);
            break;
        case 5://raiz
            for (int y = 0; y < 50; ++y) System.out.println();

            System.out.print("Digite o número que quer saber a raiz: ");
            num1 = sc.nextDouble();
            conta = Math.sqrt(num1);

            System.out.printf("A raiz de %.2f é: %.2f", num1, conta);

            break;
        case 6://par impar
            for (int y = 0; y < 50; ++y) System.out.println();

            System.out.print("Digite o número e vejo se é par ou impar(Sem contar depois da virgula): ");
            num1 = sc.nextDouble();
            conta = num1 % 2;

            if (conta == 0) {
                System.out.println("Par");
            } else {
                System.out.println("Impar");
            }
            break;
        case 7://potenciação
            for (int y = 0; y < 50; ++y) System.out.println();

            System.out.print("Digite o primeiro número: ");
            num1 = sc.nextDouble();
            System.out.print("Digite o segundo número: ");
            num2 = sc.nextDouble();
            conta = Math.pow(num1, num2);

            System.out.printf("%.2f elevado a %.2f é: %.2f", num1, num2, conta);
            break;
        case 8://soma infinita
            for (int y = 0; y < 50; ++y) System.out.println();
            double somar = 0;
            System.out.print("Digite um número pra ir somando (0 pra somar): ");
            num1 = sc.nextDouble();

            while (num1 != 0) {
                somar += num1;
                num1 = sc.nextDouble();
            }

            System.out.printf("A soma de todos o números ficou: %.2f", somar);
            break;

        default:
            break;
    }

    sc.close();
}