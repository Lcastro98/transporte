package co.com.sofka.transporte.envio;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.transporte.envio.events.EnvioCreado;
import co.com.sofka.transporte.envio.values.EnvioId;
import co.com.sofka.transporte.envio.values.ValorComercial;

import java.util.List;

public class Envio extends AggregateEvent<EnvioId>{
    protected Remitente remitente;
    protected Destinatario destinatario;
    protected Paquete paquete;
    protected ValorComercial valor;

    public Envio(EnvioId entityId, Remitente remitente, Destinatario destinatario, Paquete paquete, ValorComercial valor) {
        super(entityId);
        appendChange(new EnvioCreado(remitente, destinatario, paquete, valor)).apply();
        subscribe(new EnvioEventChange(this));
    }

    private Envio(EnvioId entityId) {
        super(entityId);
        subscribe(new EnvioEventChange(this));
    }

    public static Envio from(EnvioId entityId, List<DomainEvent> events) {
        var envio = new Envio(entityId);
        events.forEach(envio::applyEvent);
        return envio;
    }
}
