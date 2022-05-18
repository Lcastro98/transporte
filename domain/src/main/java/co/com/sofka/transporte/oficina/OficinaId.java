package co.com.sofka.transporte.oficina;

import co.com.sofka.domain.generic.Identity;

public class OficinaId extends Identity {
    public OficinaId(String id){
        super(id);
    }
    public static OficinaId of(String id){
        return new OficinaId(id);
    }
}
