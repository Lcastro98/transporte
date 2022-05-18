package co.com.sofka.transporte.mensajero.value;

import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Set;

public class Contacto extends AggregateEvent<ContactoId> {
    protected Nombre nombre;
    protected MedioTransporte medioTransporte;
    protected Ciudad cuidad;
    protected Direccion direccion;
    protected Telefono telefono;
    protected Set<Envio> envio;

    public Contacto(ContactoId entityId) {
        super(entityId);
    }
}
