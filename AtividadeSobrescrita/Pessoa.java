package AtividadeSobrescrita;

public class Pessoa {
    private String Nome;
    private String Endereco;
    private int Idade;
    private String CPF;
    private String Sexo;
    
    public Pessoa(String Nome, String Endereco, int Idade, String CPF, String Sexo){
        this.Nome=Nome;
        this.Endereco=Endereco;
        this.Idade= Idade;
        this.CPF=CPF;
        this.Sexo=Sexo;
    }
    
    public void Andar(){
        System.out.println("Andando...");
    }
    
    void imprimirValores(){
        System.out.println("Nome: "+this.Nome);
        System.out.println("Endereço: "+this.Endereco);
        System.out.println("Idade: "+this.Idade);
        System.out.println("CPF: "+this.CPF);
        System.out.println("Sexo: "+this.Sexo);
    }
}
