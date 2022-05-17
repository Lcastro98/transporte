package co.com.sofka.transporte.envio.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.transporte.envio.Destinatario;
import co.com.sofka.transporte.envio.Paquete;
import co.com.sofka.transporte.envio.Remitente;
import co.com.sofka.transporte.envio.values.ValorComercial;

public class CrearEnvio extends Command {

    private final Remitente remitente;
    private final Destinatario destinatario;
    private final Paquete paquete;
    private final ValorComercial valor;

    public CrearEnvio(Remitente remitente, Destinatario destinatario, Paquete paquete, ValorComercial valor) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.paquete = paquete;
        this.valor = valor;
    }

    public Remitente getRemitente() {
        return remitente;
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public ValorComercial getValor() {
        return valor;
    }
}
