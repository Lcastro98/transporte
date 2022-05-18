package co.com.sofka.transporte.envio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ValorComercial implements ValueObject<String> {

    private final String moneda;
    private final Double monto;

    public ValorComercial(String moneda, Double monto) {
        this.moneda = Objects.requireNonNull(moneda);
        this.monto = Objects.requireNonNull(monto);

        if (this.monto < 0) {
            throw new IllegalArgumentException("Debe ingresar un monto correcto");
        }
    }

    @Override
    public String value() {
        return monto + " " + moneda;
    }
}
