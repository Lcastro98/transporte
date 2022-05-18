package co.com.sofka.transporte.oficina;

import co.com.sofka.domain.generic.Entity;

public class Operario extends Entity<OperarioId>{

    protected Nombre nombre;
    protected Contacto contacto;
    protected Antiguedad antiguedad;

    public Operario(OperarioId entityId, Nombre nombre, Contacto contacto, Antiguedad antiguedad){
        super(entityId);
        this.nombre = nombre;
        this.contacto = contacto;
        this.antiguedad = antiguedad;
    }
    
    public void actualizarContacto(Nombre nombre, Contacto contacto, Antiguedad antiguedad){
        this.nombre = nombre;
        this.contacto = contacto;
        this.antiguedad = antiguedad;
    }
}
