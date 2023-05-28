package controller;

import model.Pessoa;
import model.PessoaDAO;

public class CtrlPessoa extends Pessoa{
    public CtrlPessoa(String nome){
        super(nome);
    }
    public static void salvar(Pessoa p){
        try{
            if (p.getNome().equals("")){
                throw new Exception("Nome vazio");
            }
            else if (p.getNome() == null){
                throw new Exception("Nome nulo");
            }
            else{
                PessoaDAO.salvar(p);
            }
        } catch(Exception e){
            System.out.println("Não é possível salvar uma pessoa com nome nulo ou vazio.");
            e.printStackTrace();
        }
    }
}
