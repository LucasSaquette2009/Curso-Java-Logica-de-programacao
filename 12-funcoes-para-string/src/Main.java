import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quer que eu mostre os tipos? (sim ou nao): ");
        String opcao = sc.nextLine();

        if (opcao.equalsIgnoreCase("sim")) {

            //original
            String original = "SAaDBWAD A J J SA JjjjDBjj   ";

            //string minuscula
            String s01 = original.toLowerCase();

            //string maiuscula
            String s02 = original.toUpperCase();

            //sem espaços no inicio e no fim
            String s03 = original.trim();

            //string que começa
            String s04 = original.substring(2);

            //string que começa e que termina
            String s05 = original.substring(2, 9);

            //substitui a string por outra
            String s06 = original.replace('a', 'x');

            //substitui um grupo strings por outra
            String s07 = original.replace("DBW", "ZZZ");

            //Marca a primeira posição da string
            int i = original.indexOf("DB");

            //marca a ultima posição da string
            int j = original.lastIndexOf("DB");

            //exibe na tela
            System.out.println("Original: -" + original + "-");
            System.out.println("toLowerCase: -" + s01 + "-");
            System.out.println("toUpperCase: -" + s02 + "-");
            System.out.println("trim: -" + s03 + "-");
            System.out.println("substring (2): -" + s04 + "-");
            System.out.println("substring (2 a 9): -" + s05 + "-");
            System.out.println("replace ('a','x'): -" + s06 + "-");
            System.out.println("replace ('DBW','ZZZ'): -" + s07 + "-");
            System.out.println("indexOf ('SA'): -" + i + "-");
            System.out.println("lastindexOf ('SA'): -" + j + "-");
        }
        else {
            System.out.println("Poxa, então blz..");
            Thread.sleep(1000);
        }


        sc.close();
    }
}