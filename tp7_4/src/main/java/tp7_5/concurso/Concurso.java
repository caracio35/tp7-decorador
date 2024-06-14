package tp7_5.concurso;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Concurso implements Concu {
    @SuppressWarnings("unused")
    private final String nombre;
    private final LocalDate fechaInicioConcurso;
    private final LocalDate fechaFinConcurso;
    private ArrayList<Participante> participantes = new ArrayList<>();
    

    public Concurso(String nombre, LocalDate fechaInicioConcurso, LocalDate fechaFinConcurso, LibretaTex libreta) {
        this.nombre = nombre;
        this.fechaInicioConcurso = fechaInicioConcurso;
        this.fechaFinConcurso = fechaFinConcurso;
        

    }

    /**
     * @param p
     * @throws IOException
     */
    @SuppressWarnings("static-access")
    public void inscripcion(Participante p) {
        // comparar si el participante ya esta inscripto
        if (this.participantes.contains(p))
            // sacar los sysout del modelo lansar exepciones
            // sYtem.out.println("El participante ya se encuentra registrado");
            throw new RuntimeException("El  participante ya se encuentra registrado");
        // comprobar si esta dentro de rango de fechas del concurso y inscribirlo

        if (!fechaInicioConcurso.isAfter(LocalDate.now()) && !fechaFinConcurso.isBefore(LocalDate.now())) {
            this.participantes.add(p);
            // sumar 10 puntos al participante si se inscribio en el primer dia
            if (LocalDate.now().equals(fechaInicioConcurso))
                p.agregarPuntos(10);

        } else
            throw new RuntimeException("No se puede inscribir a un concurso que no ha comenzado todavía");
    }

    @Override
    public String nombreConcurso() {
        return nombre;
    }
}
