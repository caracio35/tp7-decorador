package tp7_5.concurso;

public class ConcursoConBaseDeDatos extends ConcursoSimple {

    public ConcursoConBaseDeDatos(Concu concurso) {
        super(concurso);
    }

    public void inscripcion(Participante p) {
        
        EnBaseDatosLibretaText libreta = new EnBaseDatosLibretaText();
        libreta.inscribir(p.getDni(),concurso.nombreConcurso());
        super.inscripcion(p);
    }

}

