package co.com.sofka.transporte.mensajero.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.transporte.mensajero.value.*;

public class ContactoCreado extends DomainEvent {
    private final Nombre nombre;
    private final Ciudad ciudad;
    private final Direccion direccion;
    private final Telefono telefono;
    private final MedioTransporte medioTransporte;

    public ContactoCreado(Nombre nombre, Ciudad cuidad, Direccion direccion, Telefono telefono, MedioTransporte medioTransporte) {
        super("co.com.sofka.transporte.mensajero.ContactoCreado");
        this.nombre=nombre;
        this.ciudad = cuidad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.medioTransporte = medioTransporte;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public MedioTransporte getMedioTransporte() {
        return medioTransporte;
    }
}
