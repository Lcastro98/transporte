package co.com.sofka.transporte.envio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Contenido implements ValueObject<String> {

    private final String valor;

    public Contenido(String valor) {
        this.valor = Objects.requireNonNull(valor);
        if(this.valor.isBlank()){
            throw new IllegalArgumentException("Por favor ingresar la descripcion del contenido del paquete");
        }
    }

    @Override
    public String value() {
        return valor;
    }
}
