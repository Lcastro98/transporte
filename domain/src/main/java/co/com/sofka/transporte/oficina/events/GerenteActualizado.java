package co.com.sofka.transporte.oficina.events;

import co.com.sofka.transporte.oficina.values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class GerenteActualizado extends DomainEvent{
    private final NombreGo nombreGo;
    private final ContactoGo contactoGo;
    private final Salario salario;

    public GerenteActualizado(NombreGo nombreGo, ContactoGo contactoGo, Salario salario){
        super("co.com.sofka.transporte.GerenteActualizado");
        this.nombreGo = nombreGo;
        this.contactoGo = contactoGo;
        this.salario = salario;
    }

    public NombreGo getNombreGo(){
        return nombreGo;
    }
    public ContactoGo getContactoGo(){
        return contactoGo;
    }
    public Salario getSalario(){
        return salario;
    }
}
