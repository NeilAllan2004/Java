package view;

import controller.CtrlPessoa;
import static controller.CtrlPessoa.salvar;
import java.util.Scanner;


public class CadPessoa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa: ");
        String nome = sc.next();
        CtrlPessoa p = new CtrlPessoa(nome);
        salvar(p);
    }
}
