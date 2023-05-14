package AtividadeInterfaces;

public abstract class Transporte {
    String Nome;
    int NumeroPassageiros;
    int VelocidadeAtual;
    
    public abstract boolean isParado();
}
