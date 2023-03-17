package AtividadeSobrecargaDeMetodos;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Funcionario {
    private String Nome;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date dataAdmissao;
    private double salario;
    private int identificador;
    private static int id = 0;
     
    public Funcionario(){
    this.identificador = ++id;
    }
    
    public int getidentificador(){
        return this.identificador;
    }

    
    public String getNome(){
        return this.Nome;
    }

    public void setNome(String Nome){
        this.Nome = Nome;
    }

    public double getsalario(){
        return this.salario;
    }

    public void setsalario(double salario){
        if(salario>=1100){
            this.salario = salario;
        }
        else{
            System.out.println("Não foi possível adicionar esse salário");
        }
    }

    public Date getdataAdmissao(){
        return this.dataAdmissao;
    }

    public void setdataAdmissao(String DataAdmissao) throws ParseException{
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        Date DataAtual= sdf1.parse("15/03/2023");
        Date DataRecebida= sdf1.parse(DataAdmissao);
        long diff = DataAtual.getTime() - DataRecebida.getTime();
        if(diff>=0){
            this.dataAdmissao=sdf.parse(DataAdmissao);
        }
        else{
            System.out.println("Data indisponível");
        }
    }
    
    public void tirarFerias(){
        int dias =30;
        tirarFerias(dias);
    }
    
    public void tirarFerias(int dias){
        System.out.println("Dias de férias do funcionário: "+ dias);
    }
}
