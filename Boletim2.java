import java.util.Scanner;
public class Boletim2 {

    public static void main (String [] args){

    /*
        String nome = "JARVAS";
        double n1 = 8;
        double n2 = 7;
        double n3 = 10;

        double media = (n1 + n2 + n3) / 3;

        String mensagem = "";


        if(media >= 7) {
            mensagem = "Aprovado(a)";
        }
        else if(media > 5 && media < 7) {
            mensagem = "Recuperação";
        }
        else if(media <= 5) {
            mensagem = "Reprovado(a)";
        }

        System.out.println("### BOLETIM ###");
        System.out.println("Nome: " + nome + " Resultado: " + mensagem);
        System.out.printf("Media: %, .2f", media);
    */

    // Lendo do teclado
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = teclado.nextLine();

        System.out.println("Digite a primeira nota: ");
        double n1 = teclado.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double n2 = teclado.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double n3 = teclado.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        String mensagem = "";


        if(media >= 7) {
            mensagem = "Aprovado(a)";
        }
        else if(media > 5 && media < 7) {
            mensagem = "Recuperação";
        }
        else if(media <= 5) {
            mensagem = "Reprovado(a)";
        }

        System.out.println("### BOLETIM ###");
        System.out.println("Nome: " + nome + " Resultado: " + mensagem);
        System.out.printf("Media: %, .2f", media);
    }
}
