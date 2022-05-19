package co.com.sofka.transporte.oficina;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.transporte.oficina.events.*;
import co.com.sofka.transporte.oficina.values.*;

import java.util.List;

public class Oficina extends AggregateEvent<OficinaId> {

    protected OficinaId oficinaId;
    protected Nombre nombre;
    protected Ubicacion ubicacion;
    protected Contacto contacto;
    protected Gerente gerente;
    protected Operario operario;

    public Oficina(OficinaId entityId, OficinaId oficinaId, Nombre nombre, Ubicacion ubicacion, Contacto contacto, Gerente gerente, Operario operario){
        super(entityId);
        appendChange(new OficinaCreada(nombre, ubicacion, contacto, gerente, operario)).apply();
        subscribe(new OficinaEventChange(this, gerente, operario));
    }
    private Oficina(OficinaId entityId){
        super(entityId);
        subscribe(new OficinaEventChange(this, gerente, operario));
    }
    public static Oficina from(OficinaId entityId, List<DomainEvent> events){
        var oficina = new  Oficina(entityId);
        events.forEach(oficina::applyEvent);
        return oficina;
    }
    public void actualizarContactoGerente(NombreGo nombreGo, ContactoGo contactoGo, Salario salario){
        appendChange(new GerenteActualizado(nombreGo, contactoGo, salario)).apply();
    }

    public void actualizarContactoOperario(NombreGo nombreGo, ContactoGo contactoGo, Antiguedad antiguedad){
        appendChange(new OperarioActualizado(nombreGo, contactoGo, antiguedad)).apply();
    }
}
