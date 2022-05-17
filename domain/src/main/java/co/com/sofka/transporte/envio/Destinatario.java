package co.com.sofka.transporte.envio;

import co.com.sofka.domain.generic.Entity;

public class Destinatario extends Entity<DestinatarioId> {

    protected Nombre nombre;
    protected Contacto contacto;

    public Destinatario(DestinatarioId entityId, Nombre nombre, Contacto contacto) {
        super(entityId);
        this.nombre = nombre;
        this.contacto = contacto;
    }

    public void actualizarContacto(){
    }
}
