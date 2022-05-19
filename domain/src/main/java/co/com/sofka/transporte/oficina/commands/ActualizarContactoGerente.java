package co.com.sofka.transporte.oficina.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.transporte.oficina.values.*;

public class ActualizarContactoGerente extends Command{
    private final NombreGo nombreGo;
    private final ContactoGo contactoGo;
    private final Salario salario;

    public ActualizarContactoGerente(NombreGo nombreGo, ContactoGo contactoGo, Salario salario) {
        this.nombreGo = nombreGo;
        this.contactoGo = contactoGo;
        this.salario = salario;
    }

    public NombreGo getNombreGo() {
        return nombreGo;
    }

    public ContactoGo getContactoGo() {
        return contactoGo;
    }
    public Salario getSalario() {
        return salario;
    }
}
