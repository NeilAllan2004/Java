package AtividadeVisibilidadeEncapsulamento;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario {
    private String Nome;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date dataAdmissao;
    private float salario;
    
    public String getNome(){
        return this.Nome;
    }

    public void setNome(String Nome){
        this.Nome = Nome;
    }

    public float getsalario(){
        return this.salario;
    }

    public void setsalario(float salario){
        this.salario = salario;
    }

    public Date getdataAdmissao(){
        return this.dataAdmissao;
    }

    public void setdataAdmissao(String DataAdmissao){
        this.dataAdmissao= sdf.parse(DataAdmissao);
    }
}
