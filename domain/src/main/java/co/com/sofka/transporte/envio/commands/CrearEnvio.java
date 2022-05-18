package co.com.sofka.transporte.envio.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.transporte.envio.Destinatario;
import co.com.sofka.transporte.envio.Paquete;
import co.com.sofka.transporte.envio.Remitente;
import co.com.sofka.transporte.envio.values.EnvioId;
import co.com.sofka.transporte.envio.values.ValorComercial;

public class CrearEnvio extends Command {
    private final EnvioId envioId;
    private final Remitente remitente;
    private final Destinatario destinatario;
    private final Paquete paquete;
    private final ValorComercial valor;

    public CrearEnvio(EnvioId envioId, Remitente remitente, Destinatario destinatario, Paquete paquete, ValorComercial valor) {
        this.envioId = envioId;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.paquete = paquete;
        this.valor = valor;
    }

    public EnvioId getEnvioId() {
        return envioId;
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
