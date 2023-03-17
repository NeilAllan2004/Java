package AtividadeSobrecargaDeMetodos.;

public class Relogio {
    public void inicializar(int hora, int minuto, int segundo){
        System.out.print(hora+" ");
        System.out.print(minuto+" ");
        System.out.print(segundo+" ");
        System.out.println();
    }
    public void inicializar(int hora, int minuto){
        int segundo = 1;
        System.out.print(hora+" ");
        System.out.print(minuto+" ");
        System.out.print(segundo+" ");
        System.out.println();
    }
    public void inicializar(int hora){
        int segundo = 1;
        int minuto = 1;
        System.out.print(hora+" ");
        System.out.print(minuto+" ");
        System.out.print(segundo+" ");
        System.out.println();
    }
}
