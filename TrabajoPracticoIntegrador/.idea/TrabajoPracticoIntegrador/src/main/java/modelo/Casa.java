package modelo;

import java.util.ArrayList;
import java.util.List;

public class Casa {

    private final int idCasa;
    private final String nombre;
    private final ArrayList<Estudiante> estudiantes;

    public Casa(int idCasa, String nombre) {
        this.idCasa = idCasa;
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdCasa() {
        return idCasa;
    }

    public int getCantidadEstudiantes() {
        return estudiantes.size();
    }

    public void agregarEstudiante(Estudiante e) {
        if (e != null && e.getNombreCasa().equals(nombre)) {
            e.setCasa(this);
            estudiantes.add(e);
        } else
            throw new RuntimeException("Nombre de casa inválido. [" + e.getNombreCasa() + "]");

    }
    public List<Estudiante> getestudiantenoHumano() {
        List<Estudiante> noHumano;
        noHumano = new ArrayList<>();
        for (Estudiante estudiante : this.estudiantes) {
            if (estudiante.getEspecie() != "humano") {
                noHumano.add(estudiante);

            }
        }
        return noHumano;
    }
}
