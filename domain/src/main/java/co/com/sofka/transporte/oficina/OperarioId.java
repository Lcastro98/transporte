package co.com.sofka.transporte.oficina;

import co.com.sofka.domain.generic.Identity;

public class OperarioId extends Identity{

    public OperarioId(String id){
        super(id);
    }
    public static OperarioId of(String id){
        return new OperarioId(id);
    }
}
