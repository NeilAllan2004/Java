package atividadereusodeclasses;

public class triangulo extends ObjetoGeometrico{
    private double L3;
    public triangulo(double L1, double L2, double L3){
        super(L1,L2,L3);
    }
    double CalcularArea(double L1, double L2, double L3){
        double S= (L1+L2+L3)/2;
        return Math.sqrt(S*(S-L1)*(S-L2)*(S-L3));
    }
    double CalcularPerimetro(double L1, double L2, double L3){
        return (L1+L2+L3);
    }
}
