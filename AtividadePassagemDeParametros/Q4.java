package atividadepassagemdeparametros;

public class Q4 {

    public static void main(String[] args) {
        Lista(1,2,3,4);
        Lista(1,2);
        Lista();
    }
    
    public static void Lista(int ...valores){
        for (int valor:valores)
            System.out.println(valor);
        System.out.println("Fim da lista");
    }
    
}
