package co.com.sofka.transporte.envio;

import co.com.sofka.domain.generic.AggregateEvent;

public class Envio extends AggregateEvent<EnvioId>{

    protected final EnvioId envioId;
    protected final Remitente remitente;
    protected final Destinatario destinatario;
    protected final Paquete paquete;
    protected final Valor valor;

    public Envio(EnvioId entityId, EnvioId envioId, Remitente remitente, Destinatario destinatario, Paquete paquete, Valor valor) {
        super(entityId);
        this.envioId = envioId;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.paquete = paquete;
        this.valor = valor;
    }
}
