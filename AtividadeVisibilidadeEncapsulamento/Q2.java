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
        this.salario = salario;
    }

    public Date getdataAdmissao(){
        return this.dataAdmissao;
    }

    public void setdataAdmissao(String DataAdmissao){
        try {
            this.dataAdmissao= sdf.parse(DataAdmissao);
        } catch (ParseException ex) {
            Logger.getLogger(Funcionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
