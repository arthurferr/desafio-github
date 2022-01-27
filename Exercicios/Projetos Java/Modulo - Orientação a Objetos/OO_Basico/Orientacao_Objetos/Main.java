package OO_Basico.Orientacao_Objetos;
public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        Carro carro2 = new Carro("Amarelo", "BMW - Brasilia", 50, 2.00);

        // Utilizando o Primeiro OBjeto (carro1)
        carro1.setCor("Azul");
        carro1.setModelo("Bugatti Veron");
        carro1.setTanque(100);

        System.out.println("\nPropriedades do Carro 1");
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Cor: " + carro1.getCor());
        System.out.println("Capacidade do Tanque: " + carro1.getTanque());
        System.out.println("Custo para encher o Tanque: R$ " + carro1.calcularCustoTanque(5));
        
        // Utilizando o Segundo OBjeto (carro2)
        System.out.println("\nPropriedades do Carro 2");
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Cor: " + carro2.getCor());
        System.out.println("Capacidade do Tanque: " + carro2.getTanque());
        System.out.println("Custo para encher o Tanque: R$ " + carro2.calcularCustoTanque(carro2.getPrecoCombustivel()));

    }
    
}
