import java.util.Scanner;
public class ExCondicional9 {
    public static void main(String [] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o número do mês: ");
        int nmes = teclado.nextInt();

        if(nmes == 1){
            System.out.println("Janeiro!");
        }
        else if(nmes == 2){
            System.out.println("Fevereiro!");
        }
        else if(nmes == 3){
            System.out.println("Março!");
        }
        else if(nmes == 4){
            System.out.println("Abril!");
        }
        else if(nmes == 5){
            System.out.println("Maio!");
        }
        else if(nmes == 6){
            System.out.println("Junho!");
        }
        else if(nmes == 7){
            System.out.println("Julho!");
        }
        else if(nmes == 8){
            System.out.println("Agosto!");
        }
        else if(nmes == 9){
            System.out.println("Setembro!");
        }
        else if(nmes == 10){
            System.out.println("Outubro!");
        }
        else if(nmes == 11){
            System.out.println("Novembro!");
        }
        else if(nmes == 12){
            System.out.println("Dezembro!");
        }
        else{
            System.out.println("Mês Inválido!");
        }
    }
}