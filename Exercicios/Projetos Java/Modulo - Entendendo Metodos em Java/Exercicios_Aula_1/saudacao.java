package Exercicios_Aula_1;
public class saudacao {

    public static void greetings(int hora){
        if(hora >=0 && hora<12){
            System.out.println("Olá, Bom Dia!!");
        }else if(hora >= 12 && hora< 18){
            System.out.println("Olá, Boa Tarde!!");
        }else{
            System.out.println("Olá, Boa Noite!!");
        }
    }
}
