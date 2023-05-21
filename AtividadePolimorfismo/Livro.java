package atividadepolimorfismo;

public class Livro extends Produto{
    private String autores;
    private String ISBN;
    private String editora;
    
    public Livro(String nome, String descricao, double preco, String autores, String ISBN, String editora){
        super(nome, descricao, preco);
        this.autores=autores;
        this.ISBN=ISBN;
        this.editora=editora;
    }
    
    public String getAutores(){
        return autores;
    }
    
    public void setAutores(String autores){
        this.autores=autores;
    }
    
    public String getISBN(){
        return ISBN;
    }
    
    public void setISBN(String ISBN){
        this.ISBN=ISBN;
    }
    
    public String getEditora(){
        return editora;
    }
    
    public void setEditora(String editora){
        this.editora=editora;
    }
    
    @Override
    public boolean equals(Object o){
        if(o instanceof Livro){
            Livro pro=(Livro)o;
            return pro.getNome()==getNome();
        }else return false;
    }
    
    @Override
    public String toString(){
        return "Livro: "+getNome()+", "+getDescricao()+", "+getPreco()+", "+autores+", "+ISBN+", "+editora;
    }
}
