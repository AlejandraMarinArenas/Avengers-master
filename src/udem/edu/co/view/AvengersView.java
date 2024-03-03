package udem.edu.co.view;
import java.util.ArrayList;
import java.util.List;
import udem.edu.co.controller.impl.AvengersControllerImpl;
import udem.edu.co.controller.impl.AvengersMenuImpl;
import udem.edu.co.model.impl.*;

public class AvengersView {
    public static void main(String[] args) {
        List<AvengerImpl> avengers = new ArrayList<>();
        // Mostrar el menú con las clasificaciones
        AvengersMenuImpl avengersMenuImpl = new AvengersMenuImpl();
        AvengersControllerImpl avengersControllerImpl = new AvengersControllerImpl(avengersMenuImpl, avengers);
        AvengerInteligenteImpl avengerInteligenteImpl = new AvengerInteligenteImpl(avengers);
        AvengerRegeneracionImpl avengerRegeneracionImpl = new AvengerRegeneracionImpl(avengers);
        AvengerSuperFuerteImpl avengerSuperFuerteImpl = new AvengerSuperFuerteImpl(avengers);
        AvengerVoladorImpl avengerVoladorImpl = new AvengerVoladorImpl(avengers);

        avengerInteligenteImpl.agregarAvengerInteligente(new AvengerImpl("Hulk La viga", new ArrayList<>()));
        avengerInteligenteImpl.agregarAvengerInteligente(new AvengerImpl("Iron Man el murido", new ArrayList<>()));

        avengerRegeneracionImpl.agregarAvengerRegeneracion(new AvengerImpl("Hulk La viga", new ArrayList<>()));
        avengerRegeneracionImpl.agregarAvengerRegeneracion(new AvengerImpl("Thor el panzon", new ArrayList<>()));

        avengerSuperFuerteImpl.agregarAvengerSuperFuerte(new AvengerImpl("Hulk La viga", new ArrayList<>()));
        avengerSuperFuerteImpl.agregarAvengerSuperFuerte(new AvengerImpl("Thor el panzon", new ArrayList<>()));

        avengerVoladorImpl.agregarAvengerVolador(new AvengerImpl("Iron Man el murido", new ArrayList<>()));
        avengerVoladorImpl.agregarAvengerVolador(new AvengerImpl("Thor el panzon", new ArrayList<>()));

        avengersControllerImpl.iniciar();
    }
}
