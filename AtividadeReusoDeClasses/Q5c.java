package atividadereusodeclasses;

public class Circulo extends ObjetoGeometrico{
    public Circulo(double raio){
        super(raio,0,0);
    }
    double CalcularArea(double L1, double L2, double L3){
        return Math.PI*L1*L1;
    }
    double CalcularPerimetro(double L1, double L2, double L3){
        return 2*Math.PI*L1;
    }
}
