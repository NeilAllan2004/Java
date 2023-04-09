package atividadeconstrutores;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Trem {
    private Vagao Vagao;
    private Locomotiva Locomotiva;
    private EstacaoFerroviaria EstaçãoOrigem;
    private EstacaoFerroviaria EstaçãoDestino;
    private String Prefixo;
    private Date DataFormacao;
    
    public Trem(Vagao Vagao, Locomotiva Locomotiva, EstacaoFerroviaria EstaçãoOrigem, EstacaoFerroviaria EstaçãoDestino, String Prefixo, String DataFormacao) throws ParseException{
       this.Vagao = Vagao;
       this.Locomotiva = Locomotiva;
       this.EstaçãoOrigem = EstaçãoOrigem;
       this.EstaçãoDestino = EstaçãoDestino;
       this.Prefixo = Prefixo;
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
       this.DataFormacao = sdf.parse(DataFormacao);
      
    }
}
