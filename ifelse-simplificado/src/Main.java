import java.util.Locale;
import java.util.Scanner;
void main () {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    double preco;
    double desconto;

    //tipo simplificado, condicional ternária
    System.out.print("Qual o valor do produto? ");
    preco = sc.nextDouble();
    //if else aqui:
    desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;

    System.out.println("Desconto: " + desconto);

    //tipo if else normal
    System.out.print("Qual o valor do produto? ");
    preco = sc.nextDouble();

    if(preco < 20) {
        desconto = preco * 0.1;
    }
    else {
        desconto = preco * 0.05;
    }

    System.out.println("Desconto: " + desconto);

    sc.close();
}