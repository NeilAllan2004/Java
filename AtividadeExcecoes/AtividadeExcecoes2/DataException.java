public class DataException extends Exception{
    private int valor;
    public DataException(){}
    public DataException(String msg){
        super(msg);
    }
    public DataException(int valor){
        this.valor=valor;
    }
    public String toString(){
        return "Data inválida";
    }
}
