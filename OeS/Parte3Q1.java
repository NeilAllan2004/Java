public class Q1 {
  public static void main(string[] args) {
    int x=80;
    while(x!=1){
      int y = (x % 2 == 0 ? x/2 : 3 * x + 1);
      System.out.println("O valor de y é "+y);
      x=y;
    }
  }
}
