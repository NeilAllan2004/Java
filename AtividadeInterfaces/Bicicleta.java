package AtividadeInterfaces;

public class Bicicleta extends TransporteTerrestre implements Conduzivel {

    void estacionar() {
        System.out.println("Estacionando...");
    }
    public boolean isParado(){
        return true;
    }
    public void curvar(float angulo){
        System.out.println("Curvando "+angulo+"...");
    }
    public void Pedalar(){
        System.out.println("Pedalando...");
    }
}
