package udem.edu.co.controller.impl;
import java.util.List;
import java.util.Scanner;
import udem.edu.co.controller.AvengersMenu;
import udem.edu.co.model.impl.AvengerImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AvengersMenuImpl implements AvengersMenu {
    private Scanner scanner;

    public AvengersMenuImpl() {
        this.scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("=== Menú de los Avengers ===");
        System.out.println("1. Mostrar todos los Avengers");
        // Añadir más opciones para mostrar Avengers según clasificaciones
        System.out.println("2. Mostrar Avengers Voladores");
        System.out.println("3. Mostrar Avengers Super Fuertes");
        System.out.println("4. Mostrar Avengers con Regeneracion");
        System.out.println("5. Mostrar Avengers Inteligentes");
        // Añadir más opciones según clasificaciones
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    public void mostrarAvengers(List<AvengerImpl> avengers) {
        System.out.println("=== Lista de Avengers ===");
        for (AvengerImpl avenger : avengers) {
            System.out.println(avenger.getNombre() + " - " + avenger.getClasificaciones());
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
