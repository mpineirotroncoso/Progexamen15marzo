import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FortniteManager fm = new FortniteManagerImpl();
        // Agregar varias armas de ejemplo
        fm.agregarArma("Arma1",10);
        fm.agregarArma("Arma2",20);
        fm.agregarArma("Arma3",30);

        // Agregar varias skins de ejemplo
        fm.agregarSkin("Skin1","Comun");
        fm.agregarSkin("Skin2","Comun");
        fm.agregarSkin("Skin3","Legendaria");

        Scanner sc = new Scanner(System.in);
        int salir = 0;
        int opcion = 0;
        do {
            System.out.println("Fortnite Manager. v1.0");
            System.out.println("Menú principal");
            System.out.println("1. Agregar un arma al inventario.");
            System.out.println("2. Agregar una skin al inventario.");
            System.out.println("3. Buscar un arma por tipo y mostrar su información.");
            System.out.println("4. Mostrar todas las skins del inventario con una rareza especifica.");
            System.out.println("5. Eliminar un arma del inventario por tipo.");
            System.out.println("6. Eliminar una skin del inventario por nombre.");
            System.out.println("7. Salir del programa");

            System.out.print("Introduce una opcion -> ");
            try {
                opcion = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Introduce un numero válido");
                sc.next(); // limpia el buffer, soluciona el fallo de que el bucle se ejecute sin fin
            }

            switch (opcion){
                case 1:
                    System.out.print("Introduce el tipo del arma a añadir -> ");
                    String tipoArma = sc.next();
                    System.out.print("Introduce el daño del arma a añadir -> ");
                    int danoArma=0;
                    try {
                        danoArma = sc.nextInt();
                        fm.agregarArma(tipoArma,danoArma);
                        System.out.println("Se ha añadido el arma.\nTipo arma: "+tipoArma+"\nDaño arma: "+danoArma);
                    } catch (InputMismatchException e) {
                        System.out.println("El daño debe ser un número. Cancelando...");
                    }
                    break;
                case 2:
                    System.out.print("Introduce el nombre de la skin a añadir -> ");
                    String nombreSkin = sc.next();
                    System.out.print("Introduce la rareza de la skin a añadir -> ");
                    String rarezaSkin = sc.next();
                    fm.agregarSkin(nombreSkin,rarezaSkin);
                    System.out.println("Se ha añadido la skin.\nNombre skin: "+nombreSkin+"\nRareza: "+rarezaSkin);
                    break;
                case 3:
                    System.out.print("Introduce el tipo del arma a buscar -> ");
                    String tipoArmaBuscar = sc.next();
                    fm.buscarArmaPorTipo(tipoArmaBuscar);
                    break;
                case 4:
                    System.out.print("Introduce la rareza de la skin a buscar -> ");
                    String rarezaSkinBuscar = sc.next();
                    fm.buscarSkinPorRareza(rarezaSkinBuscar);
                    break;
                case 5:
                    System.out.print("Introduce el tipo del arma a eliminar -> ");
                    String tipoArmaEliminar = sc.next();
                    fm.eliminarArma(tipoArmaEliminar);
                    break;
                case 6:
                    System.out.print("Introduce la rareza de la skin a eliminar -> ");
                    String rarezaSkinEliminar = sc.next();
                    fm.eliminarSkin(rarezaSkinEliminar);
                    break;
                case 7:
                    salir = 1;
                    break;
                default:
                    System.out.println("ERROR: Opcion desconocida");
                    break;
            }
        } while (salir==0);

    }
}