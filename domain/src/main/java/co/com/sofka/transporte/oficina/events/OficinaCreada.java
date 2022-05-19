package co.com.sofka.transporte.oficina.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.transporte.oficina.Contacto;
import co.com.sofka.transporte.oficina.Gerente;
import co.com.sofka.transporte.oficina.Nombre;
import co.com.sofka.transporte.oficina.Operario;
import co.com.sofka.transporte.oficina.Ubicacion;


public class OficinaCreada extends DomainEvent{
    private final Nombre nombre;
    private final Ubicacion ubicacion;
    private final Contacto contacto;
    private final Gerente gerente;
    private final Operario operario;

    public OficinaCreada(Nombre nombre, Ubicacion ubicacion, Contacto contacto, Gerente gerente, Operario operario){
        super("co.com.sofka.transporte.OficinaCreada");
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.contacto = contacto;
        this.gerente = gerente;
        this.operario = operario;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public Operario getOperario() {
        return operario;
    }
}
