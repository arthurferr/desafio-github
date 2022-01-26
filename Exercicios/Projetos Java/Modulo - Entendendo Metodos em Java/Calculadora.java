import java.util.Scanner;

public class Calculadora {

    static Scanner scanner = new Scanner(System.in);
    
    static double num1, num2;

    public static void adicao(double num1, double num2){
        double soma = num1 + num2;
        System.out.println("A soma dos numeros: " + num1 + " e " + num2 + " é: " + soma);
    }

    public static  void subtracao(double num1, double num2){
        double diferenca = num1 - num2;
        System.out.println("A Diferencça dos numeros: " + num1 + " e " + num2 + " é: " + diferenca);
    }

    public static  void multiplicacao(double num1, double num2){
        double produto = num1 * num2;
        System.out.println("A Multiplicação dos numeros: " + num1 + " e " + num2 + " é: " + produto);
    }

    public static void divisao(double num1, double num2){
        double resto = num1 / num2;
        System.out.println("A Divisão dos numeros: " + num1 + " e " + num2 + " é: " + resto);
    }

    public static void exec() {
        System.out.println("\n");
    
        System.out.println("Digite o Primeiro Numero para as Operações");
            num1 = scanner.nextDouble();
        System.out.println("Digite o Segundo Numero para as Operações");
            num2 = scanner.nextDouble();

            System.out.println("*********** Exercicio - 1 - Calculadora **********");
    
            System.out.println("*********** Soma **********");
                adicao(num1, num2);
            System.out.println(" \n ");
            
            System.out.println("*********** Subtração **********");
                subtracao(num1, num2);
            System.out.println(" \n ");
            
            System.out.println("*********** Multiplicação **********");
                multiplicacao(num1, num2);
            System.out.println(" \n ");
            
            System.out.println("*********** Divisão **********");
                divisao(num1, num2);
            System.out.println(" \n ");
    }
}