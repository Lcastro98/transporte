package co.com.sofka.transporte.envio.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.transporte.envio.values.Contacto;
import co.com.sofka.transporte.envio.values.Nombre;

public class DestinatarioActualizado extends DomainEvent {

    private final Nombre nombre;
    private final Contacto contacto;
    public DestinatarioActualizado(Nombre nombre, Contacto contacto) {
        super("co.com.sofka.transporte.DestinatarioActualizado");
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
