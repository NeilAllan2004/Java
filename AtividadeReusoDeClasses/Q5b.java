package atividadereusodeclasses;

public class retangulo extends ObjetoGeometrico{
    public retangulo(double L1, double L2){
        super(L1,L2,0);
    }
    double CalcularArea(double L1, double L2, double L3){
        return L1*L2;
    }
    double CalcularPerimetro(double L1, double L2, double L3){
        return 2*(L1+L2);
    }
}
