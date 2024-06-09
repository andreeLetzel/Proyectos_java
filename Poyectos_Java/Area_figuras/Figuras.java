public class Figuras {
  double r;

  public void area() {
    r = Double.parseDouble(System.console().readLine("> ¿Cual es la medida del radio?: "));
    System.out.println("\nEl area del circulo es: " + (3.1416 * r * r) + "u²");
    Borrar();
  }

  public void area(double n1) {
    System.out.println("\nEl area del cuadrado es: " + (n1 * n1) + "u²");
    Borrar();
  }

  public void area(double n1, double n2) {
    System.out.println("\nEl area del rectangulo es: " + (n1 * n2) + "u²");
    Borrar();
  }

  public void Borrar() {
    System.console().readLine("\nPresiona enter para continuar... ");
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
}














