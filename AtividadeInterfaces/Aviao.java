package AtividadeInterfaces;

public class Aviao extends TransporteAereo implements Conduzivel, Motorizado{
   private int NumeroMotores;
   private int Combustivel;
   void subir(int metro){
       this.AltitudeAtual+= metro;
       System.out.println("Subindo "+metro+"...");
   }
   void descer(int metro){
       this.AltitudeAtual-= metro;
       System.out.println("Descendo "+metro+"...");
   }
    public void ligarMotor() {
        System.out.println("Ligando motor...");
    }

    public void abastecer(int numLitros) {
       this.Combustivel+=numLitros;
    }
    public boolean isParado(){
        return true;
    }
    public void curvar(float angulo){
        System.out.println("Curvando "+angulo+"...");
    }
}
