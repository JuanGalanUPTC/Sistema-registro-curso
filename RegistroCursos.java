import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RegistroCursos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> cursos = new HashSet<>();
        String codigoEstudiante;

        System.out.print("Ingrese su código estudiantil: ");
        codigoEstudiante = sc.nextLine();

        int opcion;
        do {
            mostrarMenu();
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1: // Añadir curso
                    System.out.print("Ingrese el nombre del curso a añadir: ");
                    String cursoAgregar = sc.nextLine().trim();
                    if (cursos.contains(cursoAgregar)) {
                        System.out.println("El curso ya está en la lista.");
                    } else {
                        cursos.add(cursoAgregar);
                        System.out.println("Curso '" + cursoAgregar + "' añadido.");
                    }
                    break;

                case 2: // Eliminar curso
                    System.out.print("Ingrese el nombre del curso a eliminar: ");
                    String cursoEliminar = sc.nextLine().trim();
                    if (cursos.contains(cursoEliminar)) {
                        cursos.remove(cursoEliminar);
                        System.out.println("Curso '" + cursoEliminar + "' eliminado.");
                    } else {
                        System.out.println("El curso no está en la lista.");
                    }
                    break;

                case 3: // Mostrar cursos
                    if (cursos.isEmpty()) {
                        System.out.println("No hay cursos inscritos.");
                    } else {
                        System.out.println("\nCursos inscritos (orden alfabético):");
                        for (String curso : new TreeSet<>(cursos)) {
                            System.out.println("- " + curso);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }

        } while (opcion != 4);

        sc.close();
    }

    public static void mostrarMenu() {
        System.out.println("\n--- Sistema de Registro de Cursos ---");
        System.out.println("1. Añadir curso");
        System.out.println("2. Eliminar curso");
        System.out.println("3. Mostrar cursos");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }
}
