public class Ex2Vetor {
    
    public static void main(String [] args) {
        /*
        double [] notasAtividade = new double [5];

        notasAtividade[0] = 4.0;
        notasAtividade[1] = 4.0;
        notasAtividade[2] = 7.0;
        notasAtividade[3] = 9.0;
        notasAtividade[4] = 8.0;
        */

        // Declaração com atribuição
        
        double [] notasAtividade = {7.0, 10.0, 8.0, 3.0, 6.0};
        double soma = 0;
        double media = 0;

        // +=  -> ATRIBUIÇÃO COM SOMA
        // -=  -> ATRIBUIÇÃO COM SUBTRAÇÃO
        // *=  -> ATRIBUIÇÃO COM MULTIPLICÇÃO
        // /=  -> ATRIBUIÇÃO COM DIVISÃO

        // lenght : retorna o tamanho do vetor

        for(int i = 0; i < notasAtividade.length; i++) {
            System.out.println(notasAtividade[i]);
            soma += notasAtividade[i]; // soma = soma + notasAtividade[i];
            media = soma / notasAtividade.length;

        }

        System.out.println("Media: " + media);

        if(media > 6){
            System.out.println("Aprovado!");
        }
        else if(media == 5){
            System.out.println("Recuperação!");
        }
        else if(media < 5){
            System.out.println("Reprovado!");
        }

        
    }
}