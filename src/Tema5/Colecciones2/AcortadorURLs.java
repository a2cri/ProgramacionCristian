import java.util.Scanner;

public class AcortadorURLs{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AcortadorClases ac = new AcortadorClases();
        int opcion;

        do {
            
            System.out.println("\n--- ACORTADOR URL ---");
            System.out.println("1. Crear nueva URL");
            System.out.println("2. Resolver URL");
            System.out.println("3. Borrar registro");
            System.out.println("4. Mostrar todos");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();


            switch(opcion) {
                case 1:
                    System.out.print("Introduce la URL: ");
                    String url = sc.nextLine();
                    String acortada = ac.crear(url);
                    System.out.println("URL acortada: " + acortada);
                    break;

                case 2:
                    System.out.print("Introduce la clave: ");
                    String clave = sc.nextLine();
                    String urlOriginal = ac.resolver(clave);
                    if (urlOriginal != null) {
                        System.out.println("URL original: " + urlOriginal);
                    } else {
                        System.out.println("No existe la clave.");
                    }
                    break;

                case 3:
                    System.out.print("Introduce la clave a borrar: ");
                    String claveBorrar = sc.nextLine();
                    if (ac.borrar(claveBorrar)) {
                        System.out.println("Registro eliminado.");
                    } else {
                        System.out.println("No existe la clave.");
                    }
                    break;

                case 4:
                    ac.mostrarTodos();
                    break;

                case 0:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida");
                    break;
            }

        } while (opcion != 0);

        sc.close();
    }
}