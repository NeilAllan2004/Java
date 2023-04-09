package atividadeconstrutores;

public class Locomotiva {
    private int NumeroSerie;
    private int CapacidadeTração;
    private double Comprimento;
    
    public Locomotiva(int NumeroSerie, int CapacidadeTração, double Comprimento){
        this.NumeroSerie = NumeroSerie;
        this.CapacidadeTração = CapacidadeTração;
        this.Comprimento = Comprimento;
    }
    public Locomotiva(int NumeroSerie, int CapacidadeTração){
        this.NumeroSerie = NumeroSerie;
        this.CapacidadeTração = CapacidadeTração;
    }
    public Locomotiva(int NumeroSerie){
        this.NumeroSerie = NumeroSerie;
    }
    public Locomotiva(){
    }
}
