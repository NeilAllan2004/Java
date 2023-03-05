import java.util.Scanner;
public class Parte3Q4 {
    public static void main(String[] args) {
        int v1=0, v2=1, v3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor: ");
        int ValorUsuario = sc.nextInt();
        for(int i =1;i<=ValorUsuario;i++){
            v3=v1+v2;
            v1=v2;
            v2=v3;
            System.out.print(v3+ " ");
        }   
    }
}
