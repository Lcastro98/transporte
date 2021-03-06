package co.com.sofka.transporte.envio.values;

import co.com.sofka.domain.generic.Identity;

public class RemitenteId extends Identity {
    public RemitenteId(String id) {
        super(id);
    }

    public static RemitenteId of(String id) {
        return new RemitenteId(id);
    }
}
