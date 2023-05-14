package AtividadeInterfaces;

public class Balao extends TransporteAereo {

    void subir(int metro){
       this.AltitudeAtual+= metro;
       System.out.println("Subindo "+metro+"...");
   }
   void descer(int metro){
       this.AltitudeAtual-= metro;
       System.out.println("Descendo "+metro+"...");
   }
    public boolean isParado(){
        return true;
    }
    public void largarPeso(float peso){
       System.out.println("Largando peso de "+peso+"...");
    }
    public void aquecerAr(float temp){
       System.out.println("Aquecendo "+temp+"°...");
    }
}
