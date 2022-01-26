package Area_Quadrilateros;
public class area_quadrilateros_refatorado {
    static int area;

    public static int areaQuadrilateros(int lado){
        area = lado * lado;
        return area;
    }

    public static Integer  areaQuadrilateros(int base, int altura){
        area = base * altura;
        return area;
    }

    public static int areaQuadrilateros(int baseMenor, int baseMaior, int altura){
        area = ((baseMenor+baseMaior)/2) * altura;
        return area;
    }
    
}
