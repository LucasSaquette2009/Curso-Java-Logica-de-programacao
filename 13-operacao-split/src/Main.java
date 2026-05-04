public class Main {
    public static void main(String[] args) {
        //separa as strings por espaço
        String x = "Ola-tudo-bem-mano";
        String[] vect = x.split(" ");//cria o vetor e fala pra splitar a variavel s com espaços

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        System.out.println(vect[3]);

        //separa por traço
        String s = "Ola-tudo-bem-mano";
        String[] vect2 = s.split("-"); //cria o vetor e fala que é pra ele splitar a variavel s com traços

        //exibe
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        System.out.println(vect[3]);
    }
}