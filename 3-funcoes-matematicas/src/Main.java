import java.util.Scanner;

void main(String[] args) {
    //link para outras funcoes: "java.lang.math"
    Scanner sc = new Scanner(System.in);
    double x = 3.0;
    double y = 12.2;
    double z = -5.0;
    double A, B, C, raizresposta;
    double resposta;
    //sqrt = raiz quadrada,
    A = Math.sqrt(x);
    B = Math.sqrt(y);
    C = Math.sqrt(81.0);

    System.out.println("A raiz quadrada de " + x + " é: " + A);
    System.out.printf("A raiz quadrada de %f é: %f %n", y, B);
    System.out.println("A raiz quadrada de 81 é: " + C);
    //pow = potencia
    A = Math.pow(x, y);
    B = Math.pow(x, 5.0);
    C = Math.pow(6.0, 3.0);

    System.out.println(x + " Elevado a " + y + " é igual a: " + A);
    System.out.printf("%.2f Elevado a %.2f é igual a: %.2f %n", x, 5.0, B);
    System.out.println("6.0 Elevado ao cubo é igual a: " + C);
    //abs = valor absoluto, nao pode ser negativo
    A = Math.abs(y);
    B = Math.abs(z);

    System.out.println("O valor absoluto de " + y + " é igual a: " + A);
    System.out.println("O valor absoluto de " + z + " é igual a: " + B);

    //exemplo com scanner
    System.out.print("Digite um numero: ");
    resposta = sc.nextDouble();
    raizresposta = Math.sqrt(resposta);
    System.out.println("A raiz quadrada de " + resposta + " é igual a: " + raizresposta);

}