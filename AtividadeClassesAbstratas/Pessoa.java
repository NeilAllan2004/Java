package AtividadeClassesAbstratas;

public class Pessoa extends Locomover{

    public void Mover() {
        System.out.println("Andando...");
    }
    public void Parar() {
        System.out.println("Parando de andar...");
    }
    public Pessoa(){
        Mover();
        Parar();
    }
}
