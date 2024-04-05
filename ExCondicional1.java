import java.util.Scanner;
public class ExCondicional1 {

    public static void main (String [] args){
    Scanner teclado = new Scanner(System.in);    
    
    System.out.println("Digite um numero: ");
    int num = teclado.nextInt();

    if(num > 10){
        System.out.println("Maior que 10");
    }
    else{
        System.out.println("Menor que 10");
    }

    }
}