public class Tacos {
  int Tortilla, Carne, Salsa, Queso, Verdura, Complementos, Can_Tortilla, Pos_Sals, Pos_Comp;

  public void Tomar_Orden() { 
    do {
      this.Tortilla = Integer.parseInt(System.console().readLine("Elige el tipo de tortilla:\n1. Tortilla de maiz\n2. Tortilla de harina\n> Elije una opcion(1-2): "));
      if (Tortilla > 2 ) {
        System.out.println("Opcion no valida");
      }

      System.console().readLine("Presione enter para continuar...");
      System.out.println("\033[H\033[2J");
      System.out.flush();
    } while (Tortilla > 2);

    do {
      this.Carne = Integer.parseInt(System.console().readLine("Elige la carne:\n1. Carne arabe\n2. Carne al pastor\n> Elije una opcion(1-2): "));
      if (Carne > 2 ) {
        System.out.println("Opcion no valida");
      }

      System.console().readLine("Presione enter para continuar...");
      System.out.println("\033[H\033[2J");
      System.out.flush();
    } while (Carne > 2);

    do {
      this.Verdura = Integer.parseInt(System.console().readLine("Elige la verdura:\n1. Cilantro\n2. Cebolla\n> Elije una opcion(1-2): "));
      if (Verdura > 2 ) {
        System.out.println("Opcion no valida");
      }

      System.console().readLine("Presione enter para continuar...");
      System.out.println("\033[H\033[2J");
      System.out.flush();
    } while (Verdura > 2);

    do {
      this.Salsa = Integer.parseInt(System.console().readLine("Elige la salsa:\n1. Salsa verde\n2. Salsa habanera\n> Elije una opcion(1-2): "));
      if (Salsa > 2 ) {
        System.out.println("Opcion no valida");
      }

      System.console().readLine("Presione enter para continuar...");
      System.out.println("\033[H\033[2J");
      System.out.flush();
    } while (Salsa > 2);

    do {
      this.Queso = Integer.parseInt(System.console().readLine("Elige el aderezo:\n1. Queso Fundillo\n2. Quesillo\n> Elije una opcion(1-2): "));
      if (Queso > 2 ) {
        System.out.println("Opcion no valida");
      }

      System.console().readLine("Presione enter para continuar...");
      System.out.println("\033[H\033[2J");
      System.out.flush();
    } while (Queso > 2);

    do {
      this.Complementos = Integer.parseInt(System.console().readLine("Elige el complemento:\n1. Piña\n2. Nopales\n> Elije una opcion(1-2): "));
      if (Complementos > 2 ) {
        System.out.println("Opcion no valida");
      }

      System.console().readLine("Presione enter para continuar...");
      System.out.println("\033[H\033[2J");
      System.out.flush();
    } while (Complementos > 2);

    do {
      this.Can_Tortilla = Integer.parseInt(System.console().readLine("Elige la cantidad de tortillas (max. 20): "));
      if (Can_Tortilla > 20 ) {
        System.out.println("Son demasiadas tortillas");
      }

      System.console().readLine("\nGracias por ordenar\n\nPresione enter para continuar...");
      System.out.println("\033[H\033[2J");
      System.out.flush();
    } while (Can_Tortilla > 20);
  }

  public void Imp_Orden() {
    System.out.println("\tOrden: \n"); 

    if (this.Tortilla == 1)
      System.out.println("Tortilla de maiz");
    else
      System.out.println("Tortilla de harina");

    if (this.Carne == 1)
      System.out.println("Carne: arabe");
    else
      System.out.println("Carne: al pastor");

    if (this.Verdura == 1)
      System.out.println("Verdura: Cilantro");
    else
      System.out.println("Verdura: Cebolla");

    if (this.Salsa == 1)
      System.out.println("Salsa: Salsa verde");
    else
      System.out.println("Salsa: Salsa habanera");

    if (this.Queso == 1)
      System.out.println("Queso: Queso Fundillo");
    else
      System.out.println("Queso: Quesillo");

    if (this.Complementos == 1)
      System.out.println("Complemento: Piña");
    else
      System.out.println("Complemento: Nopales");

    System.out.println("Cantidad de tortillas: " + this.Can_Tortilla);

    if (this.Pos_Sals == 1)
      System.out.println("La salsa va en el taco");
    else
      System.out.println("La salsa va aparte");

    if (this.Pos_Comp == 1)
      System.out.println("El complemento va en el taco");
    else
      System.out.println("El complemento va aparte");

    System.console().readLine("Presione enter para continuar...");
    System.out.println("\033[H\033[2J");
    System.out.flush();
      
  }

  public void Preparar() {

    do {
      this.Pos_Sals = Integer.parseInt(System.console().readLine("Ahora toca la preparacion\nDonde va a ir la salsa:\n1. En el taco\n2. Aparte\n> Elije una opcion: "));
      if (Pos_Sals > 2 ) {
        System.out.println("Opcion no valida");
      }

      System.console().readLine("Presione enter para continuar...");
      System.out.println("\033[H\033[2J");
      System.out.flush();
    } while (Pos_Sals > 2);

    do {
      this.Pos_Comp = Integer.parseInt(System.console().readLine("Donde va a ir los complementos:\n1. En el taco\n2. Aparte\n> Elije una opcion: "));
      if (Pos_Comp > 2 ) {
        System.out.println("Opcion no valida");
      }

      System.console().readLine("Presione enter para continuar...");
      System.out.println("\033[H\033[2J");
      System.out.flush();
    } while (Pos_Comp > 2);
  }
}  






