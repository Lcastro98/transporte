package co.com.sofka.transporte.envio.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.transporte.envio.values.Contacto;
import co.com.sofka.transporte.envio.values.Nombre;

public class ActualizarRemitente extends Command {

    private final Nombre nombre;
    private final Contacto contacto;

    public ActualizarRemitente(Nombre nombre, Contacto contacto) {
        this.nombre = nombre;
        this.contacto = contacto;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Contacto getContacto() {
        return contacto;
    }
}
