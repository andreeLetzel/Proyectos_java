public class Main {
  public static void main(String[] args) {
    double L1, L2;
      int opc;

    Figuras Obj = new Figuras();

    do {
      opc = Integer.parseInt(System.console().readLine("\tMenu\n\n1. Circulo\n2. Cuadrado\n3. Rectalgulo\n4. Salir\n\n> Elije una opcion(1-4): "));

      switch (opc) {
        case 1: Obj.Borrar();
          Obj.area();
          break;

        case 2: Obj.Borrar();
          L1 = Double.parseDouble(System.console().readLine("> ¿Cual es la medida de los lados?: "));
          Obj.area(L1);
          break;

        case 3: Obj.Borrar();
        L1 = Double.parseDouble(System.console().readLine("> ¿Cual es la medida de la base?: "));
        L2 = Double.parseDouble(System.console().readLine("> ¿Cual es la medida de la altura?: "));
          Obj.area(L1, L2);
          
          break;

        case 4:
          break;

        default: System.out.println("Opcion invalida");
          Obj.Borrar();
      }
    } while (opc != 4);
  }
}

