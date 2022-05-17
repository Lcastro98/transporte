package co.com.sofka.transporte.envio;

import co.com.sofka.domain.generic.AggregateEvent;

public class Envio extends AggregateEvent<EnvioId>{

    public Envio(EnvioId entityId) {
        super(entityId);
    }
}
