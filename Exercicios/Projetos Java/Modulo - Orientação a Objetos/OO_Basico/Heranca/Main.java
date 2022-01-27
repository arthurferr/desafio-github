package OO_Basico.Heranca;

public class Main {
    public static void main(String[] args) {
        // Criação de um Objeto Comum, sem Herança
        Funcionario funcionario = new Funcionario();

        // Criação de Objetos fazendo o Upcast de Herança
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        /* Criação de Objetos fazendo DownCast - fazendo esse tipo de Casting temos o seguinte erro
        Casting 'new Funcionario()' to 'Vendedor' will produce 'ClassCastException' for any non-null value */
        //Vendedor vendedor2 = (Vendedor) new Funcionario();

        /* Nesse Exemplo fazemos o Polimorfismo dos métodos da classe Mãe sobrescrevendo eles nas classes filhas*/
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        for (ClasseMae classe: classes) {
            classe.metodo1();
        }
        System.out.println(); //pular uma linha entre os exemplos
        /*Nesse Exmplo o metodo 2 da classe mãe não recebe nova instrução na classe filha1, somente na filha2*/
        for (ClasseMae classe: classes) {
            classe.metodo2();
        }

        System.out.println(); //pular uma linha entre os exemplos
        /*Aqui não temos o polimorfismo mas sim uma pura Sobreescrita do método1 pela ClasseFilha2, pois criamos um
        * objeto do tipo ClasseFilha2 e executamos o metodo que ele herda da ClasseMae, porém com um retorno diferente*/
        ClasseFilha2 filha2 = new ClasseFilha2();
        filha2.metodo2();


    }
}
