package co.com.sofka.transporte.envio.values;

import co.com.sofka.domain.generic.Identity;

public class PaqueteId extends Identity {
    public PaqueteId(String id) {
        super(id);
    }

    public static PaqueteId of(String id) {
        return new PaqueteId(id);
    }
}
