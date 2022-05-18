package co.com.sofka.transporte.oficina;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.transporte.oficina.events.*;


public class OficinaEventChange extends EventChange{
    public OficinaEventChange(Oficina oficina, Gerente gerente, Operario operario){
        apply((OficinaCreada event) -> {
            oficina.nombre = event.getNombre();
            oficina.ubicacion = event.getUbicacion();
            oficina.contacto = event.getContacto();
            oficina.gerente = event.getGerente();
            oficina.operario = event.getOperario();
        });
        apply((GerenteActualizado event) -> {
            gerente.nombreGo = event.getNombreGo();      
            gerente.contactoGo = event.getContactoGo();      
            gerente.salario = event.getSalario();      
        });
        apply((OperarioActualizado event) -> {
            operario.nombreGo = event.getNombreGo();      
            operario.contactoGo = event.getContactoGo();      
            operario.antiguedad = event.getAntiguedad();      
        });
    }    
}
