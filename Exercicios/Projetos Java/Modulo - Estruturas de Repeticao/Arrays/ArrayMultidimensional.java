package Arrays;

import java.util.Random;

/** Criar uma Matriz 4X4 com numeros aleatorios de 0 a 9 */

public class ArrayMultidimensional {
    
    static Random random = new Random();

    static int[][] matrizM = new int [4][4];

    public static void matriz(){

        /* Aqui criamos a matriz e populamos com os numeros aleatorios, 
        onde i representa as linhas e j as colunas da matriz*/
        for(int i = 0; i < matrizM.length; i++){
            for(int j = 0; j < matrizM[i].length; j++){
                matrizM[i][j] = random.nextInt(9);
            }
        }

        /* Mais uma vez fazemos o Destricturing do Array, nesse caso são 2 Arrays, 
        então temos que fazer 2 Destructuring um para a linha e outro para coluna*/

        /**OBS: o destructuring da linha, gera um outro Array, dessa vez unidimensional, 
         * e quando fazemos o destructuring para a coluna, e imprimimos os valores da coluna
         * ai então podemos ver os valores das colunas*/
        for (int[] linha : matrizM) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }
            /* É necessário imprimir essa linha em branco, para que ao final de cada coluna, 
            ele possa continuar a ser impresso nas linhas seguintes, senão teremos a demonstração de um 
            Array unidimensional 1X16*/
            System.out.println();
        }
    }


}
