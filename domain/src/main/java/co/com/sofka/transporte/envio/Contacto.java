package co.com.sofka.transporte.envio;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Contacto implements ValueObject<Contacto.Props> {
    private final String ciudad;
    private final String direccion;
    private final String telefono;

    public Contacto(String ciudad, String direccion, String telefono) {
        this.ciudad = Objects.requireNonNull(ciudad);
        this.direccion = Objects.requireNonNull(direccion);
        this.telefono = Objects.requireNonNull(telefono);
        if (this.ciudad.isBlank()) {
            throw new IllegalArgumentException("La ciudad no puede estar en blanco");
        }
        if (this.direccion.isBlank()) {
            throw new IllegalArgumentException("La direccion no puede estar en blanco");
        }
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String ciudad() {
                return ciudad;
            }

            @Override
            public String direccion() {
                return direccion;
            }

            @Override
            public String telefono() {
                return telefono;
            }
        };
    }


    public interface Props {
        String ciudad();
        String direccion();
        String telefono();
    }
}
