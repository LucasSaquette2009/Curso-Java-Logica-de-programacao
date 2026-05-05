public class Main {
    public static void main(String[] args) {
        //separa as strings por espaço
        String x = "Ola tudo bem mano";
        String[] vect = x.split(" ");//cria o vetor e fala pra splitar a variavel s com espaços

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        System.out.println(vect[3]);
    }
}