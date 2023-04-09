package atividadeconstrutores;

public class EstacaoFerroviaria {
    private LinhaFerroviaria LinhaFerroviaria;
    private String Sigla;
    private String Descricao;
    
    public EstacaoFerroviaria(LinhaFerroviaria LinhaFerroviaria, String Sigla, String Descricao){
        this.LinhaFerroviaria = LinhaFerroviaria;
        this.Sigla = Sigla;
        this.Descricao = Descricao;
    }
}
