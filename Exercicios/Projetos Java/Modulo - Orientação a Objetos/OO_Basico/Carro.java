package OO_Basico;

public class Carro {
    String cor, modelo;
    int tanque = 0;
    double custoTanque = 0, precoCombustivel = 0;

    

    // Metodos Construtores
    /********** Método Construtor Vazio (Padão) ****************/
    Carro(){}

    /********** Método Construtor com Parametros ****************/
    Carro(String cor, String modelo, int tanque, double precoCombustivel){
        this.cor = cor;
        this.modelo = modelo;
        this.tanque = tanque;
        this.precoCombustivel = precoCombustivel;

    }

    
    // Metodos SET e GET - Usados para inserir os dados para o método construtor vazio
    public void setCor(String cor){
        this.cor = cor;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setTanque(int tanque){
        this.tanque = tanque;
    }

    public void precoCombustivel(double precoConbustivel) {
        this.precoCombustivel = precoConbustivel;
    }

    public String getCor(){
        return cor;
    }

    public String getModelo(){
        return modelo;
    }

    public double getPrecoCombustivel(){
        return precoCombustivel;
    }

    public int getTanque(){
        return tanque;
    }

    public double calcularCustoTanque(double precoCombustivel){
        return custoTanque = precoCombustivel * getTanque();
    }

    
}
