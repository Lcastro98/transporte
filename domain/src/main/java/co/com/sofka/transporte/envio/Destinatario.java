package co.com.sofka.transporte.envio;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.transporte.envio.values.Contacto;
import co.com.sofka.transporte.envio.values.DestinatarioId;
import co.com.sofka.transporte.envio.values.Nombre;

public class Destinatario extends Entity<DestinatarioId> {

    protected Nombre nombre;
    protected Contacto contacto;

    public Destinatario(DestinatarioId entityId, Nombre nombre, Contacto contacto) {
        super(entityId);
        this.nombre = nombre;
        this.contacto = contacto;
    }

    public void actualizarContacto(Nombre nombre, Contacto contacto) {
        this.nombre = nombre;
        this.contacto = contacto;
    }
}
