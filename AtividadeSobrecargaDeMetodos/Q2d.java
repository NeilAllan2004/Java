package AtividadeSobrecargaDeMetodos.;

public class Q2d {

    public static void main(String[] args) {
        Relogio R1 = new Relogio();
        Relogio R2 = new Relogio();
        Relogio R3 = new Relogio();
        int horas = 12;
        int minutos = 30;
        int segundos = 59;
        R1.inicializar(horas,minutos,segundos);
        R2.inicializar(horas,minutos);
        R3.inicializar(horas);
        
    }
}
