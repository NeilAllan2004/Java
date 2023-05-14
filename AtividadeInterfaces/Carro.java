package AtividadeInterfaces;

public class Carro extends TransporteTerrestre implements Motorizado, Conduzivel {
   private int Combustivel;
    void estacionar() {
        System.out.println("Estacionando...");
    }
    public boolean isParado(){
        return true;
    }
    public void ligarMotor() {
        System.out.println("Ligando motor...");
    }
    public void abastecer(int numLitros) {
       this.Combustivel+=numLitros;
    }
    public void curvar(float angulo){
        System.out.println("Curvando "+angulo+"...");
    }
    public void embraiar(){
        System.out.println("Embraiando...");
    }
    public static void main(String[] args){
        Bicicleta Bike= new Bicicleta();
        Bike.curvar(10);
        Bike.estacionar();
        Carro Car = new Carro();
        Car.estacionar();
        Balao Balao = new Balao();
        Balao.descer(10);
        Aviao Aviao = new Aviao();
        Aviao.subir(20);
    }
}
