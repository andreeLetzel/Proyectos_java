public class Ensalada {
  int Base, Proteina, Leguminosa, Aderezo, Verdura, Cereal, Topping, Pos_Ade, Pos_Top  ;

  public void Tomar_Orden() { 
    do {
      this.Base = Integer.parseInt(System.console().readLine("Elige la base:\n1. Lechuga romana\n2. Lechuga orejona\n> Elije una opcion(1-2): "));
      if (Base > 2 ) {
        System.out.println("Opcion no valida");
      }

      System.console().readLine("Presione enter para continuar...");
      System.out.println("\033[H\033[2J");
      System.out.flush();
    } while (Base > 2);

    do {
      this.Proteina = Integer.parseInt(System.console().readLine("Elige la proteina:\n1. Jamon\n2. Pollo\n> Elije una opcion(1-2): "));
      if (Proteina > 2 ) {
        System.out.println("Opcion no valida");
      }
      
      System.console().readLine("Presione enter para continuar...");
      System.out.println("\033[H\033[2J");
      System.out.flush();
    } while (Proteina > 2);

    do {
      this.Leguminosa = Integer.parseInt(System.console().readLine("Elige la leguminosa:\n1. Frijol\n2. Lentejas\n> Elije una opcion(1-2): "));
      if (Leguminosa > 2 ) {
        System.out.println("Opcion no valida");
      }
      
      System.console().readLine("Presione enter para continuar...");
      System.out.println("\033[H\033[2J");
      System.out.flush();
    } while (Leguminosa > 2);

    do {
      this.Aderezo = Integer.parseInt(System.console().readLine("Elige el aderezo:\n1. Aderezo César\n2. Aderezo ranch\n> Elije una opcion(1-2): "));
      if (Aderezo > 2 ) {
        System.out.println("Opcion no valida");
      }

      System.console().readLine("Presione enter para continuar...");
      System.out.println("\033[H\033[2J");
      System.out.flush();
    } while (Aderezo > 2);

    do {
      this.Verdura = Integer.parseInt(System.console().readLine("Elige la verdura:\n1. Tonmate cherry\n2. Cebolla Caramelizada\n> Elije una opcion(1-2): "));
      if (Verdura > 2 ) {
        System.out.println("Opcion no valida");
      }

      System.console().readLine("Presione enter para continuar...");
      System.out.println("\033[H\033[2J");
      System.out.flush();
    } while (Verdura > 2);

    do {
      this.Cereal = Integer.parseInt(System.console().readLine("Elige el cereal:\n1. Avena\n2. Quinoa\n> Elije una opcion(1-2): "));
      if (Cereal > 2 ) {
        System.out.println("Opcion no valida");
      }

      System.console().readLine("Presione enter para continuar...");
      System.out.println("\033[H\033[2J");
      System.out.flush();
    } while (Cereal > 2);

    do {
      this.Topping = Integer.parseInt(System.console().readLine("Elige el topping:\n1. Queso\n2. Maiz\n> Elije una opcion(1-2): "));
      if (Topping > 2 ) {
        System.out.println("Opcion no valida");
      }

      System.console().readLine("\nGracias por ordenar\n\nPresione enter para continuar...");
      System.out.println("\033[H\033[2J");
      System.out.flush();
    } while (Topping > 2);
  }

  public void Imp_Orden() {
    System.out.println("\tOrden: \n"); 
    
    if (Base == 1)
      System.out.println("Base: Lechuga romana");
    else
      System.out.println("Base: Lechuga orejona");
    if (Proteina == 1)
      System.out.println("Proteina: Jamon");
    else
      System.out.println("Proteina: Pollo");
    
    if (Leguminosa == 1)
      System.out.println("Leguminosa: Frijol");
    else
      System.out.println("Leguminosa: Lentejas");

    if (Aderezo == 1)
      System.out.println("Aderezo: Aderezo César");
    else
      System.out.println("Aderezo: Aderezo ranch");

    if (Verdura == 1)
      System.out.println("Verdura: Tonmate cherry");
    else
      System.out.println("Verdura: Cebolla Caramelizada");

    if (Cereal == 1)
      System.out.println("Cereal: Avena");
    else
      System.out.println("Cereal: Quinoa");

    if (Topping == 1)
      System.out.println("Topping: Queso");
    else
      System.out.println("Topping: Maiz");

    if (this.Pos_Ade == 1)
      System.out.println("El aderezo va a lado");
    else
      System.out.println("El aderezo va encima");

    if (this.Pos_Top == 1)
      System.out.println("El topping va a lado");
    else
      System.out.println("El topping va encima");

    System.console().readLine("Presione enter para continuar...");
    System.out.println("\033[H\033[2J");
    System.out.flush();
    
  }

  public void Preparar() {

    do {
      this.Pos_Ade = Integer.parseInt(System.console().readLine("Ahora toca la preparacion\nDonde va a ir el aderezo:\n1. Al lado\n2. encima\n> Elije una opcion(1-2): "));
      if (Pos_Ade > 2 ) {
        System.out.println("Opcion no valida");
      }

      System.console().readLine("Presione enter para continuar...");
      System.out.println("\033[H\033[2J");
      System.out.flush();
    } while (Pos_Ade > 2);

    do {
      this.Pos_Top = Integer.parseInt(System.console().readLine("Donde va a ir los topping:\n1. Al lado\n2. encima\n> Elije una opcion(1-2): "));
      if (Pos_Top > 2 ) {
        System.out.println("Opcion no valida");
      }

      System.console().readLine("Presione enter para continuar...");
      System.out.println("\033[H\033[2J");
      System.out.flush();
    } while (Pos_Top > 2);
    
    System.console().readLine("Presione enter para continuar...");
    System.out.println("\033[H\033[2J");
    System.out.flush();
  }
}  

