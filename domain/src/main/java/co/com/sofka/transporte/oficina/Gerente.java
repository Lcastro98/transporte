package co.com.sofka.transporte.oficina;

import co.com.sofka.domain.generic.Entity;

public class Gerente extends Entity<GerenteId>{
    
    protected Nombre nombre;
    protected Contacto contacto;
    protected Salario salario;

    public Gerente(GerenteId entityId, Nombre nombre, Contacto contacto, Salario salario){
        super(entityId);
        this.nombre = nombre;
        this.contacto = contacto;
        this.salario = salario;
    }

    public void actualizarContacto(Nombre nombre, Contacto contacto, Salario salario){
        this.nombre = nombre;
        this.contacto = contacto;
        this.salario = salario;
    }
}
