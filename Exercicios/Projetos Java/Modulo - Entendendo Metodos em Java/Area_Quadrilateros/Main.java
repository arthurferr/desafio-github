package Area_Quadrilateros;

public class Main {
    public static void main(String[] args) {
        // Quando usamos metoris VOID, podemos simplesmente chamar e usar esse método e toda a logica de retorno ficará dentro dele
        area_quadrilateros.areaQuadrilateros(5,8);

        
        // Ao usarmos métodos com retorno, temos a possibilidade de manipulação desse retorno, podendo artribuir a uma variavél, como nos exemplos abaixo
        int quadrado = area_quadrilateros_refatorado.areaQuadrilateros(8);
        System.out.println("A Area do Quadrado é " + quadrado);

        int retangulo = area_quadrilateros_refatorado.areaQuadrilateros(8,18);
        System.out.println("A Area do Retangulo é " + retangulo);

        int trapezio = area_quadrilateros_refatorado.areaQuadrilateros(8,18,1);
        System.out.println("A Area do Trapézio é " + trapezio);
    }
    
}
