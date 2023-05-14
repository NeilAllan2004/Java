package AtividadeClassesAbstratas;

public abstract class Locomover {
    public abstract void Mover();
    public abstract void Parar();
    public Locomover(){ 
    }
  
    public static void main(String[] args){
        Locomover Exemplo = new Locomover() {
            public void Mover() {
               System.out.println("Movendo");
            }
            public void Parar() {
                System.out.println("Parando");
            }
        }
    }
}
