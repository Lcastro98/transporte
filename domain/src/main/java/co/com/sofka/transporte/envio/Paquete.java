package co.com.sofka.transporte.envio;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.transporte.envio.values.Contenido;
import co.com.sofka.transporte.envio.values.PaqueteId;
import co.com.sofka.transporte.envio.values.Peso;
import co.com.sofka.transporte.envio.values.ValorComercial;

public class Paquete extends Entity<PaqueteId> {

    protected Peso peso;
    protected ValorComercial valorComercial;
    protected Contenido contenido;
    public Paquete(PaqueteId entityId, Peso peso, ValorComercial valorComercial, Contenido contenido) {
        super(entityId);
        this.peso = peso;
        this.valorComercial = valorComercial;
        this.contenido = contenido;
    }

    public void actualizarDatos(Peso peso, ValorComercial valorComercial, Contenido contenido){
        this.peso = peso;
        this.valorComercial = valorComercial;
        this.contenido = contenido;
    }

    public Peso Peso() {
        return peso;
    }

    public ValorComercial ValorComercial() {
        return valorComercial;
    }

    public Contenido Contenido() {
        return contenido;
    }

}
