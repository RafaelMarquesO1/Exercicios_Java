import java.util.Scanner;
public class Ex1Vetor {
    public static void main(String [] args){
        String [] convidados = new String [10];
        Scanner teclado = new Scanner(System.in);

        // lenght : RETORNA O TAMANHO DO VETOR (INT)
        for(int i = 0; i < convidados.length; i++){
            System.out.println("Digite o(a) " + i + " convidado(a)");
            convidados[i] = teclado.nextLine();

        }

        for(int i = 0; i < convidados.length; i++) {
            System.out.println(i + 1 + "° Convidado(a) " + convidados[i]);

        }
        teclado.close();
    }
}