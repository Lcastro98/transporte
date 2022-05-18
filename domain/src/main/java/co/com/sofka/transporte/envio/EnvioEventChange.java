package co.com.sofka.transporte.envio;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.transporte.envio.events.DestinoAgregado;
import co.com.sofka.transporte.envio.events.EnvioCreado;

public class EnvioEventChange extends EventChange {
    public EnvioEventChange(Envio envio) {
        apply((EnvioCreado event) -> {
            envio.remitente = event.getRemitente();
            envio.destinatario = event.getDestinatario();
            envio.paquete = event.getPaquete();
            envio.valor = event.getValor();
        });

        apply((DestinoAgregado event) -> {
            envio.destino = event.getValue();
        });
    }
}
