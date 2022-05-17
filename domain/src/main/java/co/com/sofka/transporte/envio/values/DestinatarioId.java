package co.com.sofka.transporte.envio.values;

import co.com.sofka.domain.generic.Identity;

public class DestinatarioId extends Identity {
    public DestinatarioId(String id) {
        super(id);
    }

    public static DestinatarioId of(String id) {
        return new DestinatarioId(id);
    }
}
