public class Parte3Q3 {
  public static void main(String[] args) {
    int Valor;
    for(int x=1;x<=10;x++){
      Valor=1;
      for(int y=1;y<=x;y++){
        Valor=Valor*y;
      }
      System.out.println(Valor);
    }
  }
}
