import java.util.Scanner;
public class ExCondicional2 {

    public static void main (String [] args){
    Scanner teclado = new Scanner(System.in);    
    
    System.out.println("Digite um numero: ");
    int num1 = teclado.nextInt();

    System.out.println("Digite outro número: ");
    int num2 = teclado.nextInt();


    if(num1 > num2){
        System.out.println(num1 + " é maior!");
    }
    else{
        System.out.println(num2 + "é maior!");
    }

    }
}