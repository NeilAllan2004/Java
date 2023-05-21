package atividadepolimorfismo;

public class Produto {
    private String nome;
    private String descricao;
    private double preco;
    
    public Produto(String nome, String descricao, double preco){
        this.nome=nome;
        this.descricao=descricao;
        this.preco=preco;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setDescicao(String descricao){
        this.descricao=descricao;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public void setPreco(double preco){
        this.preco=preco;
    }
    
    @Override
    public boolean equals(Object o){
        if(o instanceof Produto){
            Produto pro=(Produto)o;
            return pro.nome==nome;
        }else return false;
    }
    
    @Override
    public String toString(){
        return "Produto: "+nome+", "+descricao+", "+preco;
    }
}
