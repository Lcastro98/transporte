package co.com.sofka.transporte.oficina;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.transporte.oficina.values.*;

public class Gerente extends Entity<GerenteId>{
    
    protected NombreGo nombreGo;
    protected ContactoGo contactoGo;
    protected Salario salario;

    public Gerente(GerenteId entityId, NombreGo nombreGo, ContactoGo contactoGo, Salario salario){
        super(entityId);
        this.nombreGo = nombreGo;
        this.contactoGo = contactoGo;
        this.salario = salario;
    }

    public void actualizarContacto(NombreGo nombreGo, ContactoGo contactoGo, Salario salario){
        this.nombreGo = nombreGo;
        this.contactoGo = contactoGo;
        this.salario = salario;
    }
}
