package Estruturas_de_Repeticao;

import java.util.Scanner;

/** receber 5 numeros, informar o maior deles e a media desses numeros*/
public class ExDoWhile {
    static Scanner scann = new Scanner(System.in);
    
    static int num; 
    static int maior = 0, count = 0, qtdCount = 0, qtdPares = 0, qtdImpares = 0 ;
    static double soma = 0;

    public static void mediaEmaior(){
    do {
        System.out.println("Informe um numero");
        num = scann.nextInt();
        soma = soma + num;

        if(num > maior) maior = num;

        count = count+1;
    } while (count<5);

    // a media pode ser obtida dividindo a soma dos numeros digitados pelo numero final do contador (count)
    System.out.println("A média dos numeros é: " + soma/count);
    System.out.println("O Maior numero é: " + maior);
    }


    /** Fazendo a Repetição sem ser Hard Coded, o usuario vai dizer quantas vezes o laço se repetirá */
    public static void parImpar(){

            System.out.println("Informe o numero das repetições");
            qtdCount = scann.nextInt();
            System.out.println("O laço se repetirá " + qtdCount + "X");
        do {
            System.out.println("Agora informe um numero");
            num = scann.nextInt();

            //Verificando se O numero é Par ou Impar e atribuindo a soma desses numeros
            if(num% 2 == 0){
                qtdPares++;
            }else{
                qtdImpares++;
            }
            
            System.out.println("O numero digitado foi: " + num);
            count++;// contador recebe +1 a cada passagem pelo laço
        } while (count < qtdCount);
        
        System.out.println("Foram digitados: " + qtdPares + " numero(s) Pares");
        System.out.println("Foram digitados: " + qtdImpares + " numero(s) Imares");
        

    }
}
