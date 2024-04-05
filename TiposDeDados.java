public class TiposDeDados {

    public static void main(String [] args) {
        //Tipos primitivos de daos
        // Declaração de Variaveis de acordo com o tipo

        byte n1;
        short n2;
        int n3;
        long n4;

        // Atribuição de valores
        // Obs: Por padrão um valor numérico inteiro que extrapola a capacidade do tipo da variavel  assume o tipo "int"
        // Exemplo:
        //n1 = 1000; Erro: o tipo de bute não comporta o valor 1000 o máx seria 127
        n1 = 10;  // aqui está ok
        n2 = 1235;
        n3 = 65486;
        n4 = 468644;

        // Declaração e atribuição de valores, vamos utilizar valores reais como exemplo:
        // Por padrão um valor númerico real atrbuído será sempre "double"

        float n5 = 5641.68f; // Colocar no final do numero a letra "f" caso queira o tipo float
        double n6 = 65987.45;

        // Declaração e atribuição dado tipo caracter
        //  Apenas 1 letra e sempre com aspas simples
        char letra = 'c';

        // Declaração e atribuição do valor lógico (boolean)

        boolean solteiro = false;
        boolean comFome = true;

        // Declaração e atribuição de cadeia (String)
        // OBS: String NÃO É UM TIPO PRIMITIVO DE DADOS NO JAVA. String é uma classe.
        String escola = "Brasílio Flores de Azevedo";

    }
}