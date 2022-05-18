package co.com.sofka.transporte.mensajero.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Direccion implements ValueObject<Direccion.Pros> {
    private final Integer calle;
    private final Integer numero;

    public Direccion(Integer calle, Integer numero) {
        this.calle = Objects.requireNonNull(calle);
        this.numero = Objects.requireNonNull(numero);
    }

    @Override
    public Pros value() {
        return new Pros() {
            @Override
            public Integer calle() {
                return calle;
            }

            @Override
            public Integer numero() {
                return numero;
            }
        };
    }

    public interface Pros{
        Integer calle();
        Integer numero();
    }
}
