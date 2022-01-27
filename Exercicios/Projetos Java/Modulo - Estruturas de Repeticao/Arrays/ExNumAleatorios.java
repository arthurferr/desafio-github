package Arrays;

import java.util.Random;

//ler 20 numeros Aleatorios entre 0 e 100 e armazenar em um vetor.
// Exibir os numeros do vetor e seus sucessores

public class ExNumAleatorios {
    
    static Random random = new Random();

    static int[] numAleattorios = new int[20];

    public static void numAleAleatorios(){
      System.out.println("Numeros Aleatórios");
        for(int i = 0; i < numAleattorios.length; i++){
          int num = random.nextInt(100);
          numAleattorios[i] = num;
          System.out.print(numAleattorios[i] + ", ");
        }

        /* É ncessario fazermos o Destructuring do Array, para que possamos ter acesso a cada valor, 
        para ai podermos encontrar seu successor*/
        System.out.println("\nNumeros Sucessores dos numeros Aleatórios");
        for (int numero : numAleattorios) {
          System.out.print((numero+1) + ", ");
          
        }

        // Esse é so para ter como registro como fazer para achar os Antecesores dos numeros aleatórios
        System.out.println("\nNumeros Antecessore dos numeros Aleatórios");
        for (int numero : numAleattorios) {
          System.out.print((numero-1) + ", ");
          
        }
    }
}
