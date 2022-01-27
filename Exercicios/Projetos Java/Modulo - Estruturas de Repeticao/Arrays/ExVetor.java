package Arrays;

public class ExVetor {
    
/** Criar um vetor para receber 6 numeros e mostrar sua ordem inversa*/

    public static void vetor(){
        int[] vetor = {5 ,9 ,-8, 45,12, 97};
        int count = 0;
        System.out.println("Imprimindo os valores dos indices do Vetor");
        while (count < vetor.length ){
            // Visualizando os indices do Vetor na posição em que foram inseridos
            System.out.print(vetor[count] + ", ");
            count++;
        }


        System.out.println("\nImprimindo os valores inversos dos indices do Vetor");
        // Visualizando os indices do Vetor na ordem inversa a que foram inseridos
        for(int i = (vetor.length -1); i >= 0; i --){  /** Atribuimos o tamanho do Array decrementado 1 unidade 
                                                    como sendo o valor inicial de i, i não poderá ser menor 
                                                    que 0 (zero) e i será decrementado em 1 unidade a cada 
                                                    passagem no laco*/ 
            
            // Saida invertida dos valores dos indices do Arry
            System.out.print(vetor[i] + ", ");
        }
    }

}
