package co.com.sofka.transporte.envio.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.transporte.envio.values.Contacto;
import co.com.sofka.transporte.envio.values.Nombre;

public class RemitenteActualizado extends DomainEvent {

    private final Nombre nombre;
    private final Contacto contacto;

    public RemitenteActualizado(Nombre nombre, Contacto contacto) {
        super("co.com.sofka.transporte.RemitenteActualizado");
        this.nombre = nombre;
        this.contacto = contacto;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Contacto getContacto() {
        return contacto;
    }
}
