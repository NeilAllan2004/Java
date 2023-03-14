package AtividadeVisibilidadeEncapsulamento.;

public class Q3 {

    public static void main(String[] args) {
        double salario= 3451.67;
        String nome1= "Juan";
        String nome2= "Julia";
        String Data= "11/05/2011";
        Funcionario F1 = new Funcionario();
        Funcionario F2 = new Funcionario();
        Funcionario F3 = new Funcionario();
        F1.setNome(nome1);
        F2.setNome(nome2);
        F3.setNome("Joaquim");
        F1.setdataAdmissao(Data);
        F2.setdataAdmissao(Data);
        F3.setdataAdmissao("12/04/2010");
        F1.setsalario(salario);
        F2.setsalario(salario);
        F3.setsalario(5143.76);
        System.out.println("Funcionário 1: "+F1.getNome());
        System.out.println("Salário: "+F1.getsalario());
        System.out.println("Data de Admissao: "+F1.getdataAdmissao());
        System.out.println("Funcionário 2: "+F2.getNome());
        System.out.println("Salário: "+F2.getsalario());
        System.out.println("Data de Admissao: "+F2.getdataAdmissao());
        System.out.println("Funcionário 3: "+F3.getNome());
        System.out.println("Salário: "+F3.getsalario());
        System.out.println("Data de Admissao: "+F3.getdataAdmissao());
    }
}
