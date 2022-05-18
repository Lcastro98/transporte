package co.com.sofka.transporte.oficina;

import co.com.sofka.domain.generic.AggregateEvent;

public class Oficina extends AggregateEvent<OficinaId> {

    protected final OficinaId oficinaId;
    protected final Nombre nombre;
    protected final Ubicacion ubicacion;
    protected final Contacto contacto;
    protected final Gerente gerente;
    protected final Operario operario;

    public Oficina(OficinaId entityId, OficinaId oficinaId, Nombre nombre, Ubicacion ubicacion, Contacto contacto, Gerente gerente, Operario operario){
        super(entityId);
        this.oficinaId = oficinaId;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.contacto = contacto;
        this.gerente = gerente;
        this.operario = operario;
    }
}
