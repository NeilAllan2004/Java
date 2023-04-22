package atividadeexcecoes1;

import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ok = false;
        while (ok = false) {
            try {
                System.out.println("Digite o nome completo: ");
                String nomeCompleto = sc.nextLine();
                if (nomeCompleto==null) {
                    throw new IllegalArgumentException("Nome inválido. Digite um nome não vazio.");
                }
                
                System.out.println("Digite o DDD do telefone: ");
                String ddd = sc.nextLine();
                if (ddd.length() != 2) {
                    throw new IllegalArgumentException("DDD inválido. Use dois números inteiros.");
                }

                System.out.println("Digite o número do telefone: ");
                String numero = sc.nextLine();
                if (numero.length() != 8 && numero.length() != 9) {
                    throw new IllegalArgumentException("Número inválido. Use oito ou nove números inteiros.");
                }

                System.out.println("O Cadastro foi realizado");
                System.out.println("Nome completo: " + nomeCompleto);
                System.out.println("Telefone: " + ddd + ") " + numero);
                ok = true;
            } catch (Exception e) {
                System.out.println("Capturada: "+e);
                e.printStackTrace();
            }
        }
    }
}
