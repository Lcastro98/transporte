package co.com.sofka.transporte.oficina;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.transporte.oficina.events.OficinaCreada;

public class OficinaEventChange extends EventChange{
    public OficinaEventChange(Oficina oficina){
        apply((OficinaCreada event) -> {
            oficina.nombre = event.getNombre();
            oficina.ubicacion = event.getUbicacion();
            oficina.contacto = event.getContacto();
            oficina.gerente = event.getGerente();
            oficina.operario = event.getOperario();
        });
    }    
}
