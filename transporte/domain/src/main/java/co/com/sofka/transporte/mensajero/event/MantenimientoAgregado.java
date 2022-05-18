package co.com.sofka.transporte.mensajero.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.transporte.mensajero.value.MedioTransporte;
import co.com.sofka.transporte.mensajero.value.Nombre;

public class MantenimientoAgregado extends DomainEvent {
    private final Nombre nombre;
    private final MedioTransporte medioTransporte;
    public MantenimientoAgregado(Nombre nombre, MedioTransporte medioTransporte) {
        super("co.com.sofka.transporte.mensajero.MantenimientoAgregado");
        this.medioTransporte = medioTransporte;
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public MedioTransporte getMedioTransporte() {
        return medioTransporte;
    }
}
