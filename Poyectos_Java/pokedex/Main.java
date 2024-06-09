class Main {
  public static void main(String[] args) {

    int opc = 0, evo = 0;
    char evol = 'n';

    System.out.println("\033[H\033[2J");
    System.out.flush();
    
    Pokemon Obj1 = new Pokemon();

    System.console().readLine("\nPresiona enter para continuar...");
    System.out.println("\033[H\033[2J");
    System.out.flush();

    do {
      
      System.out.println("\n\n1. Atacar\n2. Alimentar\n3. Evolucionar\n4. Mostrar datos\n5. Salir");

      opc = Integer.parseInt(System.console().readLine("Ingresa una opción: "));

      switch(opc) {
        case 1:
          Obj1.Atacar();
          System.console().readLine("\nPresiona enter para continuar...");
          System.out.println("\033[H\033[2J");
          System.out.flush();
          break;

        case 2:
          Obj1.Alimentar();
          System.console().readLine("\nPresiona enter para continuar...");
          System.out.println("\033[H\033[2J");
          System.out.flush();
          break;

        case 3:

          if (evo < 2) 
            evol = System.console().readLine("El pokemon tiene evolucion? (s/n): ").charAt(0);

          if (evol == 's' || evol == 'S'){
              evo = Obj1.Evolucionar(evo);
          } else {
            System.out.println("El pokemon ya no puede evolucionar");
            evo = 2;
          }
          
          System.console().readLine("\nPresiona enter para continuar...");
          System.out.println("\033[H\033[2J");
          System.out.flush();
          break;

        case 4:
          Obj1.print();
          System.console().readLine("\nPresiona enter para continuar...");
          System.out.println("\033[H\033[2J");
          System.out.flush();
          break;

        case 5:
          break;

        default:
          System.out.println("Opción inválida");
          break;
      
      }
      
    } while (opc != 5);
  }
}