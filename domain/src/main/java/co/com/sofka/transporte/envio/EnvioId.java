package co.com.sofka.transporte.envio;

import co.com.sofka.domain.generic.Identity;

public class EnvioId extends Identity {
    public EnvioId(String id) {
        super(id);
    }

    public static EnvioId of(String id) {
        return new EnvioId(id);
    }
}
