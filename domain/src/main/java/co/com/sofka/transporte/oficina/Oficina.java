package co.com.sofka.transporte.oficina;

import co.com.sofka.domain.generic.AggregateEvent;

public class Oficina extends AggregateEvent<OficinaId> {

    public Oficina(OficinaId entityId){
        super(entityId);
    }

}
