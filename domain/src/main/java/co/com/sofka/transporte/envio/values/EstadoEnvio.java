package co.com.sofka.transporte.envio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class EstadoEnvio implements ValueObject<EstadoEnvio.Estados> {

    private final Estados value;

    public EstadoEnvio(Estados value) {
        this.value = Objects.requireNonNull(value);
    }

    public enum Estados {
        ADMITIDO, ENBODEGA, ENTRANSITO, ENTREGADO
    }

    @Override
    public EstadoEnvio.Estados value() {
        return value;
    }
}
