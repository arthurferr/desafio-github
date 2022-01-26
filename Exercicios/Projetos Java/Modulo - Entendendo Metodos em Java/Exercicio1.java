import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args) {
        // Aqui fazemos o uso da chamada de um método sem passar nenhum parâmetro, toda a lógica estã na classe Calculadora        
        Calculadora.exec();
        
        // Nessa chamada de método, utilizamos a classe Scanner para receber os valores informados pelo usuário e dai, informar por parâmetro para o método que então realizará sua rotina.
        Scanner scanner = new Scanner(System.in);
        System.out.println("*********** Exercicio - 2 - Saudação **********");
        System.out.println("Informe a Hora Atual");

        int hora = scanner.nextInt();
        saudacao.saudacao(hora);

        //Nesse Exemplo tempo todos os valores dos Parâmetros do método, sendo passados através de outros métodos que, em um caso tambem requer um parâmetro. Cada método executa sua rotina e retorna valores que dão continuidade no programa.
        System.out.println("\n");
        System.out.println("*********** Exercicio - 3 - Empréstimo ******");
        valorEmprestimo.valorParcela(valorEmprestimo.getValorEmprestimo(),valorEmprestimo.getTaxaJuros(valorEmprestimo.getParcelas()));


    }   
}
