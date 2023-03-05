public class Parte2Q3 {
  public static void main(String[] args) {
    int x=80;
    int y = (x % 2 == 0 ? x/2 : 3 * x + 1);
    System.out.println("O valor de y é "+y);
  }
}
