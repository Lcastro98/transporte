package co.com.sofka.transporte.envio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Peso implements ValueObject<String> {

    private final String unidadMedida;
    private final Double valor;

    public Peso(String unidadMedida, Double valor) {
        this.unidadMedida = Objects.requireNonNull(unidadMedida);
        this.valor = Objects.requireNonNull(valor);

        if (this.valor < 0) {
            throw new IllegalArgumentException("El peso ingresado no es correcto.");
        }
    }

    @Override
    public String value() {
        return valor + unidadMedida;
    }
}
