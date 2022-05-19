package co.com.sofka.transporte.oficina.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.transporte.oficina.values.*;

public class ActualizarContactoOperario extends Command{
    private final NombreGo nombreGo;
    private final ContactoGo contactoGo;
    private final Antiguedad antiguedad;

    public ActualizarContactoOperario(NombreGo nombreGo, ContactoGo contactoGo, Antiguedad antiguedad) {
        this.nombreGo = nombreGo;
        this.contactoGo = contactoGo;
        this.antiguedad = antiguedad;
    }

    public NombreGo getNombreGo() {
        return nombreGo;
    }

    public ContactoGo getContactoGo() {
        return contactoGo;
    }
    public Antiguedad getAntiguedad() {
        return antiguedad;
    }
}
