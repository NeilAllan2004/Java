package AtividadeInterfaces;

public abstract class TransporteAereo extends Transporte{
    int AltitudeAtual;
    abstract void subir(int metro);
    abstract void descer(int metro);
}
