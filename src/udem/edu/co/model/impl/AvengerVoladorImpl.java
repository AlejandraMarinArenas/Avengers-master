package udem.edu.co.model.impl;

import udem.edu.co.model.AvengerVolador;
import java.util.ArrayList;
import java.util.List;

import udem.edu.co.model.impl.AvengerImpl;

public class AvengerVoladorImpl implements AvengerVolador {

    private List<AvengerImpl> avengers;

    public AvengerVoladorImpl(List<AvengerImpl> avengers) {
        this.avengers = avengers;
    }

    public void agregarAvengerVolador(AvengerImpl avenger) {
        // Buscar si ya existe un Avenger con el mismo nombre
        AvengerImpl avengerExistente = null;
        for (AvengerImpl existingAvenger : avengers) {
            if (existingAvenger.getNombre().equals(avenger.getNombre())) {
                avengerExistente = existingAvenger;
                break;
            }
        }

        // Si ya existe, solo agregar las nuevas clasificaciones
        if (avengerExistente != null) {
            avengerExistente.getClasificaciones().add("Avenger Volador");
        } else {
            // Si no existe, agregar el Avenger a la lista con la nueva clasificación
            avenger.getClasificaciones().add("Avenger Volador");
            avengers.add(avenger);
        }
    }
}
