package udem.edu.co.model.impl;

import udem.edu.co.model.AvengerRegenarion;

import java.util.List;

public class AvengerRegeneracionImpl implements AvengerRegenarion {

    private List<AvengerImpl> avengers;

    public AvengerRegeneracionImpl(List<AvengerImpl> avengers) {
        this.avengers = avengers;
    }

    public void agregarAvengerRegeneracion(AvengerImpl avenger) {
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
            avengerExistente.getClasificaciones().add("Avenger con Regeneracion");
        } else {
            // Si no existe, agregar el Avenger a la lista con la nueva clasificación
            avenger.getClasificaciones().add("Avenger con Regeneracion");
            avengers.add(avenger);
        }
    }
}
