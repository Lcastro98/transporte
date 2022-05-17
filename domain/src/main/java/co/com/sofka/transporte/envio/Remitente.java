package co.com.sofka.transporte.envio;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.transporte.envio.values.Contacto;
import co.com.sofka.transporte.envio.values.Nombre;
import co.com.sofka.transporte.envio.values.RemitenteId;

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
