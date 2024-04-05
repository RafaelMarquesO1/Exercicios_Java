import java.util.Scanner;
public class ExCondicional4 {

    public static void main(String [] args) {
    
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite o nome do PRIMEIRO TIME: ");
    String time1 = teclado.nextLine();

    System.out.println("Digite o nome do SEGUNDO TIME: ");
    String time2 = teclado.nextLine();

    System.out.println("Digite o número de GOLS do PRIMEIRO TIME: ");
    int t1 = teclado.nextInt();

    System.out.println("Digite o número de GOLS do SEGUNDO TIME: ");
    int t2 = teclado.nextInt();


    if(t1 > t2) {
        System.out.println("\nPRIMEIRO TIME VENCEDOR: " + time1);
    }
    else if(t1 < t2) {
        System.out.println("SEGUNDO TIME VENCEDOR: " + time2);
    }
    else if(t1 == t2) {
        System.out.println("EMPATE");
    }
    }
}