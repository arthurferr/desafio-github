package Estruturas_de_Repeticao;

import java.util.Scanner;

public class ExFor {
    static Scanner scann = new Scanner(System.in);

    static int fator, num;

    public static void tabuada() {
        System.out.println("Informe para qual numero você que saber a Tabuada");
        num = scann.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(num + " X " + i + " = " + num * i);
        }

    }


    public static void fatorial(){
        System.out.println("Informe o numero a ser fatorado");
        // O numero fatorial é o numero que sera multiplicado com seus antecessores até chegar a 1
        fator = scann.nextInt();
        
        // a variavel num2 é o numero que recebe o valor decomposto do numero fatorial
        int num2 = 1;

        /* o contador i inicia com o valor do numero a ser fatorado, i não deve ser menor que 1 e 
        sera decrementado em 1 unidade a cada passagem no laco*/
        for(int i = fator; i>=1; i-- ){
            
            // forma elegante de mostrar a saida do fatorial
            System.out.println(num2 + " X " + i + " = " + num2*i);
            // aqui é feito o calculo do fatorial que será mostrado no final da execução do programa
            num2 = num2 * i;
        }
        System.out.println(num2);
    }
    
}
