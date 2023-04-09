package atividadeconstrutores;

public class Vagao {
    private int NumeroSerie;
    private String Tipo;
    private int CapacidadeCarga;
    private double ComprimentoTesteiras;
    private double ComprimentoEngates;
    
    public Vagao(int NumeroSerie, String Tipo, int CapacidadeCarga, double ComprimentoTesteiras, double ComprimentoEngates){
        this.NumeroSerie = NumeroSerie;
        this.Tipo = Tipo;
        this.CapacidadeCarga = CapacidadeCarga;
        this.ComprimentoTesteiras = ComprimentoTesteiras;
        this.ComprimentoEngates = ComprimentoEngates;
    }
    public Vagao(int NumeroSerie, String Tipo, int CapacidadeCarga, double ComprimentoTesteiras){
        this.NumeroSerie = NumeroSerie;
        this.Tipo = Tipo;
        this.CapacidadeCarga = CapacidadeCarga;
        this.ComprimentoTesteiras = ComprimentoTesteiras;
    }
    public Vagao(int NumeroSerie, String Tipo, int CapacidadeCarga){
        this.NumeroSerie = NumeroSerie;
        this.Tipo = Tipo;
        this.CapacidadeCarga = CapacidadeCarga;
    }  
    public Vagao(int NumeroSerie, String Tipo){
        this.NumeroSerie = NumeroSerie;
        this.Tipo = Tipo;
    }
    public Vagao(int NumeroSerie){
        this.NumeroSerie = NumeroSerie;
    }
    public Vagao(){
    }
}
