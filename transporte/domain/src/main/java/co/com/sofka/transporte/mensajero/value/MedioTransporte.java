package co.com.sofka.transporte.mensajero.value;

import co.com.sofka.domain.generic.Entity;

import java.util.HashSet;
import java.util.Set;

public class MedioTransporte extends Entity<MedioTransporteId> {
    protected Ciudad ciudad;
    protected Direccion direccion;
    protected Set<Envio> envio;

    public MedioTransporte(MedioTransporteId entityId,Ciudad ciudad, Direccion direccion) {
        super(entityId);
        this.ciudad=ciudad;
        this.direccion = direccion;
        this.envio = new HashSet<>();
    }
    public void agregarRecorrido(Envio envio){
        this.envio.add(envio);
    }
}
