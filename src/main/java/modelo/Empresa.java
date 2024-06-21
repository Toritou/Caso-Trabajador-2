package modelo;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Trabajador> trabajadores;

    public Empresa() {
        trabajadores = new ArrayList<>();
    }

    public void agregarTrabajador(Trabajador trabajador) {
        trabajadores.add(trabajador);
    }

    public List<Trabajador> getTrabajadores() {
        return trabajadores;
    }
}
