package co.com.sofka.transporte.oficina.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.transporte.oficina.values.*;

public class OperarioActualizado extends DomainEvent{

    private final NombreGo nombreGo;
    private final ContactoGo contactoGo;
    private final Antiguedad antiguedad;

    public OperarioActualizado(NombreGo nombreGo, ContactoGo contactoGo, Antiguedad antiguedad){
        super("co.com.sofka.transporte.OperarioActualizado");
        this.nombreGo = nombreGo;
        this.contactoGo = contactoGo;
        this.antiguedad = antiguedad;
    }

    public NombreGo getNombreGo(){
        return nombreGo;
    }
    public ContactoGo getContactoGo(){
        return contactoGo;
    }
    public Antiguedad getAntiguedad(){
        return antiguedad;
    }
}
