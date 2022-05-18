package co.com.sofka.transporte.mensajero.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.transporte.mensajero.value.Ciudad;
import co.com.sofka.transporte.mensajero.value.Direccion;
import co.com.sofka.transporte.mensajero.value.Nombre;

public class RecorridoCreado extends DomainEvent {
    private final Ciudad ciudad;
    private final Nombre nombre;
    private final Direccion direccion;
    public RecorridoCreado(Nombre nombre, Ciudad cuidad, Direccion direccion) {
        super("co.com.sofka.transporte.mensajero.RecorridoCreado");
        this.ciudad = cuidad;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }
}
