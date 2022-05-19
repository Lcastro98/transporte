package co.com.sofka.transporte.oficina;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.transporte.oficina.values.*;

public class Operario extends Entity<OperarioId>{

    protected NombreGo nombreGo;
    protected ContactoGo contactoGo;
    protected Antiguedad antiguedad;

    public Operario(OperarioId entityId, NombreGo nombreGo, ContactoGo contactoGo, Antiguedad antiguedad){
        super(entityId);
        this.nombreGo = nombreGo;
        this.contactoGo = contactoGo;
        this.antiguedad = antiguedad;
    }
    
    public void actualizarContacto(NombreGo nombreGo, ContactoGo contactoGo, Antiguedad antiguedad){
        this.nombreGo = nombreGo;
        this.contactoGo = contactoGo;
        this.antiguedad = antiguedad;
    }
}
