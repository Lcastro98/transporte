package co.com.sofka.transporte.mensajero.value;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.transporte.mensajero.event.RecorridoCreado;
import co.com.sofka.transporte.mensajero.event.ContactoCreado;

import java.util.Set;

public class Contacto extends AggregateEvent<ContactoId> {
    protected Nombre nombre;
    protected MedioTransporte medioTransporte;
    protected Ciudad cuidad;
    protected Direccion direccion;
    protected Telefono telefono;
    protected Set<Envio> envio;

    public Contacto(ContactoId entityId, Nombre nombre,Ciudad cuidad, Direccion direccion,Telefono telefono,MedioTransporte medioTransporte) {
        super(entityId);
        appendChange(new ContactoCreado(nombre, cuidad, direccion, telefono, medioTransporte)).apply();
        subscribe(new ContactoEventChange(this));
    }

    public void agregarRecorrido (Ciudad ciudad, Direccion direccion){
        appendChange(new RecorridoCreado(nombre, cuidad, direccion)).apply();
    }
}
