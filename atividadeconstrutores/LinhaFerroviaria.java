package atividadeconstrutores;

public class LinhaFerroviaria {
    Trem Trem;
    private int Numero;
    private int ExtensaoMetros;
    private String Descricao;
    
    public LinhaFerroviaria(Trem Trem, int Numero, int ExtensaoMetros,String Descricao){
        this.Trem = Trem; 
        this.Numero = Numero;
        this.ExtensaoMetros = ExtensaoMetros;
        this.Descricao = Descricao;
    }
}
