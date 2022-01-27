package Arrays;

import java.util.Scanner;

public class ExConsoantes {
    static Scanner scann = new Scanner(System.in);

    static String[] consoantes = new String[6];
    static int qtdConsoantes = 0;
    static int count = 0;  
    
    public static void Letras(){
        do {
            System.out.println("Insira uma Letra");
            String letra = scann.next();
             
            // Esse IF testa se a letra digitada está na condição de excessão
            if(!(letra.equalsIgnoreCase("a") ||
                letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase("i") ||
                letra.equalsIgnoreCase("o") ||
                letra.equalsIgnoreCase("u"))){

                // O Arry de consoantes recebe a letra digitada, inicialmente na Posição 0(zero)    
                consoantes[count] = letra;
                //caso a letra passe pela verificação de excessão, qtdConsoantes recebe o incremento de 1 unidade
                qtdConsoantes++;
                }

                /* o Contador é acrescido de 1 unidade, para que o indice do array possa mudar e as 
                letras não sejam sobrepostas no mesmo indice*/
                count ++;
                
        } while (count < consoantes.length);


        System.out.println("As consoantes encontradas foram: ");
        /* fazemos um Destructuring do Array consoantes, atribuindo cada elemento do Array a variavél consoante 
        dessa forma toda vez que o laço se repetir, seja exibido a consoante atribuida na vez*/
        for (String consoante : consoantes) {
            if(consoante != null)
            System.out.print(consoante + ", ");
        }

        System.out.println("\nForam encontradas:" + qtdConsoantes);
        
    }
}
