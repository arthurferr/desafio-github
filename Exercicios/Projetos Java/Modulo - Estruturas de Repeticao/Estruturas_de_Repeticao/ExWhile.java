package Estruturas_de_Repeticao;

import java.util.Scanner;

/** Exercicio 1: Receber Nome e Idade até que 0 (zero) seja dado como nome */

public class ExWhile {
 static Scanner scann = new Scanner(System.in);

 static String nome;
 static int idade, nota;

 public static void enquanto(){
    while(true){
        System.out.println("Insira o nome");
        nome = scann.next();
        
       if(nome.equals("0")) break;
                
        System.out.println("Insira a Idade");
        idade = scann.nextInt();
        
    }
 }


 /** Exercicio 2: Receber nota enquanto a notaa for maior que 0 (zero) e menor que 10 (dez) */
 public static void nota(){
        
    while(nota>=0 && nota<=10){
        System.out.println("Insira uma nota");
        nota = scann.nextInt(); 
    }
    System.out.println("Insira uma nota entre 0 e 10");
}

/** Exercicio 3: Receber Nome e Idade até que 0 (zero) seja dado como nome */

    
}
