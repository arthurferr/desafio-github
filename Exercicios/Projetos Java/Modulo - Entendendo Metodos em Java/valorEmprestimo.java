import java.util.Scanner;

public class valorEmprestimo {

    static Scanner scanner = new Scanner(System.in);

    public static double getValorEmprestimo(){
        System.out.println("Informe o valor do Empréstimo");
        double valorEmprestimo = scanner.nextDouble();
        return valorEmprestimo;
    }

    public static int getParcelas(){
        System.out.println("Informe o numero de Parcelas");
        int numParcelas = scanner.nextInt();
        return numParcelas;
    }

    public static double getTaxaJuros(int numParcelas){
        double taxa = 0;

        if(numParcelas >= 2 && numParcelas <= 5){
            taxa = 0.05;
        }else{
            taxa = 0.1;
        }

        return taxa;
    }

    public static void valorParcela(double valorEmprestimo, double taxa){
        double valorParcela = (valorEmprestimo * taxa);
        double total = valorParcela + valorEmprestimo;
        System.out.println("O valor final do empréstimo será de R$: " + total);
    
    }
    
}
