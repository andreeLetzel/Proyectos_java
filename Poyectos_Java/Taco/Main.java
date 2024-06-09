public class Main {
  public static void main(String[] args) {
    Ensalada ensalada = new Ensalada();
    Tacos taco = new Tacos();

    ensalada.Tomar_Orden();
    ensalada.Preparar();
    ensalada.Imp_Orden();

    taco.Tomar_Orden();
    taco.Preparar();
    taco.Imp_Orden();
  }
}