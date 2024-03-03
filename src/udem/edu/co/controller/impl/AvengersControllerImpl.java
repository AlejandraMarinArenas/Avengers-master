package udem.edu.co.controller.impl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import udem.edu.co.controller.AvengersController;
import udem.edu.co.model.impl.AvengerImpl;


public class AvengersControllerImpl implements AvengersController {
    private AvengersMenuImpl avengersMenuImpl;
    private List<AvengerImpl> avengers;


    public AvengersControllerImpl(AvengersMenuImpl avengersMenuImpl, List<AvengerImpl> avengers) {
        this.avengersMenuImpl = avengersMenuImpl;
        this.avengers = avengers;

    }

    public void iniciar() {
        int choice;
        do {
            choice = avengersMenuImpl.mostrarMenu();
            switch (choice) {
                case 1:
                    mostrarTodosAvengers();
                    break;
                case 2:
                    mostrarAvengersPorClasificacion("Avenger Volador");
                    break;
                case 3:
                    mostrarAvengersPorClasificacion("Avenger Super Fuerte");
                    break;
                case 4:
                    mostrarAvengersPorClasificacion("Avenger con Regeneracion");
                    break;
                case 5:
                    mostrarAvengersPorClasificacion("Avenger Inteligente");
                    break;
                // Añadir más casos según clasificaciones
                case 6:
                    avengersMenuImpl.mostrarMensaje("Saliendo del programa...");
                    break;
                default:
                    avengersMenuImpl.mostrarMensaje("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (choice != 6);
    }

    private void mostrarTodosAvengers() {
        avengersMenuImpl.mostrarAvengers(avengers);
    }

    private void mostrarAvengersPorClasificacion(String clasificacion) {
        List<AvengerImpl> avengersFiltrados = new ArrayList<>();
        for (AvengerImpl avengerImpl : avengers) {
            if (avengerImpl.getClasificaciones().contains(clasificacion)) {
                // Si la clasificación es "Avenger Inteligente", mostrar solo eso
                if (clasificacion.equals("Avenger Inteligente")) {
                    avengersFiltrados.add(new AvengerImpl(avengerImpl.getNombre(), Collections.singletonList(clasificacion)));
                } else if (clasificacion.equals("Avenger con Regeneracion")) {
                    avengersFiltrados.add(new AvengerImpl(avengerImpl.getNombre(), Collections.singletonList(clasificacion)));
                } else if (clasificacion.equals("Avenger Super Fuerte")) {
                    avengersFiltrados.add(new AvengerImpl(avengerImpl.getNombre(), Collections.singletonList(clasificacion)));
                } else if (clasificacion.equals("Avenger Volador")) {
                    avengersFiltrados.add(new AvengerImpl(avengerImpl.getNombre(), Collections.singletonList(clasificacion)));
                } else {
                    avengersFiltrados.add(avengerImpl);
                }
            }
        }
        avengersMenuImpl.mostrarAvengers(avengersFiltrados);
    }
}