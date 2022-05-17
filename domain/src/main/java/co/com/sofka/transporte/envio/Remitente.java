package co.com.sofka.transporte.envio;

import co.com.sofka.domain.generic.Entity;

public class Remitente extends Entity<RemitenteId> {

    protected Nombre nombre;
    protected Contacto contacto;

    public Remitente(RemitenteId entityId, Nombre nombre, Contacto contacto) {
        super(entityId);
        this.nombre = nombre;
        this.contacto = contacto;
    }

    public void actualizarContacto(){
    }
}
