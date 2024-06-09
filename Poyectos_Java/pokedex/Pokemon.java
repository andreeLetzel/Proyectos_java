public class Pokemon {
  
  String nombre, genero;
  
  int nivel, ID;
  
  char shiny, op = 'n';
  
  float peso, altura;

  String[] tipo = new String[2];
  String[] ataques = new String[4];

  public Pokemon() {
    
    this.nombre = System.console().readLine("> Nombre: ");
    
    this.tipo[0] = System.console().readLine("\n> Tipo 1: ");

    op = System.console().readLine("\n> ¿Tiene otro tipo? (s/n): ").charAt(0);

    if (op == 's') {
      this.tipo[1] = System.console().readLine("\n> Tipo 2: ");
    }
    
    this.genero = System.console().readLine("\n> Genero: ");

    while (true) {
      this.nivel = Integer.parseInt( System.console().readLine("\n> Nivel: "));
      if (this.nivel > 100) {
        System.out.println("\n> Nivel invalido");
      }
      else
        break;
    }
    
    this.ID = Integer.parseInt(System.console().readLine("\n> ID: "));
    
    this.shiny = System.console().readLine("\n> Es shiny? (s/n): ").charAt(0);
    
    this.peso = Float.parseFloat(System.console().readLine("\n> Peso: "));
    
    this.altura = Float.parseFloat(System.console().readLine("\n> Altura: "));

    for (int i = 0; i < 4; i++) {
      
      this.ataques[i] = System.console().readLine("\n> Ataque " + (i + 1) + ": ");

    }
    
  }

  public void print() {

    System.console().readLine("\nPresiona enter para continuar...");
    System.out.println("\033[H\033[2J");
    System.out.flush();
    
    System.out.println("\nNombre: " + this.nombre);

    if (this.op == 's') {
      System.out.println("\nTipos: " + this.tipo[0] + ", " + this.tipo[1]);
    
    } else {
      System.out.println("\nTipo: " + this.tipo[0]);
    }

    System.out.println("\nGenero: " + this.genero + "\n\nNivel: " + this.nivel + "\n\nID: N.°" + this.ID + "\n\nShiny: " + this.shiny + "\n\nPeso: " + this.peso + " kg\n\nAltura: " + this.altura + " m\n\nAtaques: ");

    for (int i = 0; i < 4; i++) {
      System.out.println((i + 1) + ". " + this.ataques[i]);
    }

  }

  public void Atacar() {

    System.console().readLine("\nPresiona enter para continuar...");
    System.out.println("\033[H\033[2J");
    System.out.flush();

    for (int i = 0; i < 4; i++) {
      System.out.println((i + 1) + ". " + this.ataques[i]);
    }
    
    int opc = Integer.parseInt(System.console().readLine("\n> Opcion: "));

    switch (opc) {
      case 1:
        System.out.println(nombre + " ha usado " + this.ataques[0]);
        break;

      case 2:
        System.out.println(nombre + " ha usado " + this.ataques[1]);
        break;

      case 3:
        System.out.println(nombre + " ha usado " + this.ataques[2]);
        break;

      case 4:
        System.out.println(nombre + " ha usado " + this.ataques[3]);
        break;
        
    }
  }

  public void Alimentar() {

    System.console().readLine("\nPresiona enter para continuar...");
    System.out.println("\033[H\033[2J");
    System.out.flush();
    
    int opc = 0;

    do {
      System.out.println("\n\n1. Baya Aranja\n2. Baya Zreza\n3. Baya Atania\n4. Baya Meloc\n5. Baya Caquic\n6. Baya Ziuela\n7. Salir");
  
      opc = Integer.parseInt(System.console().readLine("> Opción(1 - 6): "));
  
      switch(opc) {
          
        case 1:
          System.out.println("Se ha alimentado a " + this.nombre + " con Baya Aranja\n\n" + this.nombre + " ha recuperado 10 ps");
          break;
  
        case 2:
          System.out.println("Se ha alimentado a " + this.nombre + " con Baya Zreza\n\n" + this.nombre + " se ha recuperado de la paralisis");
          break;
  
        case 3:
          System.out.println("Se ha alimentado a " + this.nombre + " con Baya Atania\n\n" + this.nombre + " se ha despertado");
          break;
  
        case 4:
          System.out.println("Se ha alimentado a " + this.nombre + " con Baya Meloc\n\n"  + this.nombre + " se ha recuperado del veneno");
          break;
  
        case 5:
          System.out.println("Se ha alimentado a " + this.nombre + " con Baya Caquic\n\n" + this.nombre + " ya no esta confuso");
          break;
  
        case 6:
          System.out.println("Se ha alimentado a " + this.nombre + " con Baya Ziuela\n\n" + this.nombre + " se ha recuperado de todos los problemas de estado");
          break;
  
        case 7:
          break;
  
        default:
          System.out.println("Opción no válida");
      }

      System.console().readLine("\nPresiona enter para continuar...");
      System.out.println("\033[H\033[2J");
      System.out.flush();
      
    } while(opc != 7);
    
  }

  public int Evolucionar(int evo) {

    System.console().readLine("\nPresiona enter para continuar...");
    System.out.println("\033[H\033[2J");
    System.out.flush();
    
      this.nombre = System.console().readLine("> Nuevo Nombre: ");
  
      op = System.console().readLine("\n> ¿Tiene un nuevo tipo? (s/n): ").charAt(0);
  
      if (op == 's' || op == 'S') {
  
         this.tipo[1] = System.console().readLine("> Nuevo Tipo: ");
      }

    while (true) {
      this.nivel = Integer.parseInt( System.console().readLine("\n> Nivel: "));
      if (this.nivel > 100) {
        System.out.println("\n> Nivel invalido");
      }
      else
        break;
    }
  
    this.ID = Integer.parseInt(System.console().readLine("\n> ID: "));
  
    this.peso = Float.parseFloat(System.console().readLine("\n> Peso: "));
  
    this.altura = Float.parseFloat(System.console().readLine("\n> Altura: "));
  
    for (int i = 0; i < 4; i++) {
  
      this.ataques[i] = System.console().readLine("\n> Ataque " + (i + 1) + ": ");
  
    }
      evo++;
    return evo;
  }
}