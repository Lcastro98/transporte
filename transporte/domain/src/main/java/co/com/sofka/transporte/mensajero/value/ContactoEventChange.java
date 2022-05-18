package co.com.sofka.transporte.mensajero.value;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.transporte.mensajero.event.ContactoCreado;
import co.com.sofka.transporte.mensajero.event.MantenimientoAgregado;

import java.util.HashSet;

public class ContactoEventChange extends EventChange {
    public ContactoEventChange(Contacto contacto) {
        apply((ContactoCreado event) -> {
            contacto.nombre = event.getNombre();
            contacto.cuidad = event.getCiudad();
            contacto.direccion = event.getDireccion();
            contacto.telefono = event.getTelefono();
            contacto.envio = new HashSet<>();
        });

        apply((ContactoCreado event)-> {
            var envio = new Envio();
            contacto.envio.add(envio);
        });

        apply((MantenimientoAgregado event)->{
            var envio = new Envio();
            contacto.envio.add(envio);
        });
    }
}
