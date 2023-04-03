package AtividadeSobrescrita;

public class Medico extends Pessoa {
    private String CRM;
    private double Salario;
    private String Especializacao;
    private boolean DaPlantao;
    
    public Medico(String Nome, String Endereco, int Idade, String CPF, String Sexo, String CRM, double Salario, String Especializacao, boolean DaPlantao){
        super(Nome, Endereco, Idade, CPF, Sexo);
        this.CRM=CRM;
        this.Salario=Salario;
        this.Especializacao=Especializacao;
        this.DaPlantao=DaPlantao;
        System.out.println("Médico(a) criado(a)");
        imprimirValores();
    }
    void imprimirValores(){
        super.imprimirValores();
        System.out.println("CRM: "+this.CRM);
        System.out.println("Salário: "+this.Salario);
        System.out.println("Especialização: "+this.Especializacao);
        System.out.println("Está de Plantão: "+this.DaPlantao);
    }
}
