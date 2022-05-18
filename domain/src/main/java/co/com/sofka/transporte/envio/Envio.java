package co.com.sofka.transporte.envio;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.transporte.envio.events.DestinatarioActualizado;
import co.com.sofka.transporte.envio.events.DestinoAgregado;
import co.com.sofka.transporte.envio.events.EnvioCreado;
import co.com.sofka.transporte.envio.events.RemitenteActualizado;
import co.com.sofka.transporte.envio.values.*;

import java.util.List;

public class Envio extends AggregateEvent<EnvioId> {
    protected Remitente remitente;
    protected Destinatario destinatario;
    protected Paquete paquete;
    protected ValorComercial valor;
    protected EstadoEnvio estadoEnvio;
    protected Destino.Destinos destino;

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

    public EstadoEnvio seguirEnvio(EnvioId envioId) {
        var estado = this.estadoEnvio;
        return estado;
    }

    public void asignarDestino() {
        appendChange(new DestinoAgregado(Destino.Destinos.DIRECCION)).apply();
    }

    public void actualizarContactoRemitente(Nombre nombre, Contacto contacto) {
        appendChange(new RemitenteActualizado(nombre, contacto)).apply();
    }

    public void actualizarContactoDestinatario(Nombre nombre, Contacto contacto) {
        appendChange(new DestinatarioActualizado(nombre, contacto)).apply();
    }

    public Remitente Remitente() {
        return remitente;
    }

    public Destinatario Destinatario() {
        return destinatario;
    }

    public Paquete Paquete() {
        return paquete;
    }

    public ValorComercial Valor() {
        return valor;
    }

    public EstadoEnvio EstadoEnvio() {
        return estadoEnvio;
    }

    public Destino.Destinos Destino() {
        return destino;
    }
}
