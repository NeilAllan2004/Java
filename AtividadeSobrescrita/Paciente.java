package AtividadeSobrescrita;

public class Paciente extends Pessoa {
    private String Doenca;
    private String Medicacao;
    private boolean TemDor;
    private boolean RecebeAlta;
    
    public Paciente(String Nome, String Endereco, int Idade, String CPF, String Sexo, String Doenca ,String Medicacao, boolean TemDor, boolean RecebeAlta){
        super(Nome, Endereco, Idade, CPF, Sexo);
        this.Doenca=Doenca;
        this.Medicacao=Medicacao;
        this.TemDor=TemDor;
        this.RecebeAlta=RecebeAlta;
        System.out.println("Paciente criado(a)");
        imprimirValores();
        
    }
    
    public static void main(String[] args){
        Paciente P =new Paciente("Leo", "Fortaleza", 20, "000.000.000-00", "Masculino", "Tuberculose", "Antibiótico", true,true);
        System.out.println(" ");
        Medico m =new Medico("Carla", "Fortaleza", 30, "111.111.111-11", "Feminino", "CRM/CE 000000", 7920.89 , "Cardiologista", true);
    }
    void imprimirValores(){
        super.imprimirValores();
        System.out.println("Doença: "+this.Doenca);
        System.out.println("Medicação: "+this.Medicacao);
        System.out.println("Tem dor: "+this.TemDor);
        System.out.println("Recebeu alta: "+this.RecebeAlta);
    }
}
