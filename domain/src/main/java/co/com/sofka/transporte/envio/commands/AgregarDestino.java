package co.com.sofka.transporte.envio.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.transporte.envio.values.Destino;

public class AgregarDestino extends Command {

    private final Destino.Destinos value;

    public AgregarDestino(Destino.Destinos value) {
        this.value = value;
    }

    public Destino.Destinos getValue() {
        return value;
    }
}
