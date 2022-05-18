package co.com.sofka.transporte.envio.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.transporte.envio.values.Destino;

public class DestinoAgregado extends DomainEvent {

    private final Destino.Destinos value;

    public DestinoAgregado(Destino.Destinos value) {
        super("co.com.sofka.transporte.DestinoAgregado");
        this.value = value;
    }

    public enum Destinos {
        OFICINA, DIRECCION
    }

    public Destino.Destinos getValue() {
        return value;
    }
}
