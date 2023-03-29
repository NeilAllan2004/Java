package AtividadeReusoDeClasses;

public class Aluno extends Pessoa{
    public Aluno(){
        Andar();
        super.Andar();
    }
    public void Andar(){
        System.out.println("Aluno andando");
    }
    
    public static void main(String[] args){
        Aluno A1 = new Aluno();
    }
}
