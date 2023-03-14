package com.mycompany.ex3;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Funcionario {
    private String Nome;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date dataAdmissao;
    private double salario;
    
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
            System.out.print("Não foi possível adicionar esse salário");
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
}
