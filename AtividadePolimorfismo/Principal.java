package atividadepolimorfismo;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        ArrayList<Produto> ListaProdutos = new ArrayList();
        int usuario=0;
        while(usuario!=6){
            Scanner sc = new Scanner(System.in);
            System.out.println("1.Cadastrar produto \n2.Listar produtos \n3.Cadastrar livro \n4.Listar Livros \n5.Imprimir tudo \n6.Sair");
            System.out.println("Digite uma opção para continuar");
            usuario = sc.nextInt();
            switch(usuario){
                case 1: 
                    System.out.println("Digite o nome do produto: ");
                    String Nome=sc.next();
                    System.out.println("Digite a descrição do produto: ");
                    String Descricao=sc.next();
                    System.out.println("Digite o preço do produto: ");
                    Double Preco= sc.nextDouble();
                    ListaProdutos.add(new Produto(Nome,Descricao,Preco));
                    break;
                    
                case 2:
                    for (Produto p : ListaProdutos)
                        if (p instanceof Livro)
                            continue;
                        else
                            System.out.println(p.toString());
                    break;
                    
                case 3:
                    System.out.println("Digite o nome do livro: ");
                    String NomeLivro=sc.next();
                    System.out.println("Digite a descrição do produto: ");
                    String DescricaoLivro=sc.next();
                    System.out.println("Digite o preço do produto: ");
                    Double PrecoLivro= sc.nextDouble();
                    System.out.println("Digite o nome do(s) autore(s) do livro: ");
                    String Autores=sc.next();
                    System.out.println("Digite o ISBN do livro: ");
                    String ISBN=sc.next();
                    System.out.println("Digite a editora do livro: ");
                    String Editora=sc.next();
                    ListaProdutos.add(new Livro(NomeLivro,DescricaoLivro,PrecoLivro, Autores, ISBN, Editora));
                    break;
                    
                case 4:
                    for (Produto p : ListaProdutos)
                        if (p instanceof Livro)
                            System.out.println(p.toString());
                    
                    break;
                
                case 5:
                    for (Produto p : ListaProdutos)
                        System.out.println(p.toString());
                    
                    break;
                
                case 6:
                    System.out.println("Saindo...");
            }
            
        }
    }
}
