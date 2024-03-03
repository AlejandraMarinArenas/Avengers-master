package udem.edu.co.model.impl;

import udem.edu.co.model.AvengerInteligente;

import java.util.ArrayList;
import java.util.List;

public class AvengerInteligenteImpl implements AvengerInteligente {

    private List<AvengerImpl> avengers;

    public AvengerInteligenteImpl(List<AvengerImpl> avengers) {
        this.avengers = avengers;
    }

    public void agregarAvengerInteligente(AvengerImpl avenger) {
        AvengerImpl avengerExistente = null;
        for (AvengerImpl existingAvenger : avengers) {
            if (existingAvenger.getNombre().equals(avenger.getNombre())) {
                avengerExistente = existingAvenger;
                break;
            }
        }

        // Si ya existe, solo agregar las nuevas clasificaciones
        if (avengerExistente != null) {
            avengerExistente.getClasificaciones().add("Avenger Inteligente");
        } else {
            // Si no existe, agregar el Avenger a la lista con la nueva clasificación
            avenger.getClasificaciones().add("Avenger Inteligente");
            avengers.add(avenger);
        }
    }
}