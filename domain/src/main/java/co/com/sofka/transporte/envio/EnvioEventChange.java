package co.com.sofka.transporte.envio;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.transporte.envio.events.DestinatarioActualizado;
import co.com.sofka.transporte.envio.events.DestinoAgregado;
import co.com.sofka.transporte.envio.events.EnvioCreado;
import co.com.sofka.transporte.envio.events.RemitenteActualizado;

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

        apply((RemitenteActualizado event) -> {
            envio.remitente.nombre = event.getNombre();
            envio.remitente.contacto = event.getContacto();
        });

        apply((DestinatarioActualizado event) -> {
            envio.destinatario.nombre = event.getNombre();
            envio.destinatario.contacto = event.getContacto();
        });
    }
}
