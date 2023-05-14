package AtividadeClassesAbstratas;

public class Bicicleta extends Locomover{
    
    public void Mover() {
        System.out.println("Pedalando...");
    }
    public void Parar() {
        System.out.println("Parando de pedalar...");
    }
    public Bicicleta(){
        Mover();
        Parar();
    }
}
