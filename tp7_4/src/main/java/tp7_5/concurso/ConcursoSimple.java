package tp7_5.concurso;



public class ConcursoSimple implements Concu {
    
    Concu concurso;
    public ConcursoSimple(Concu concurso) {
        this.concurso = concurso;
    }
    public void inscripcion(Participante p) {
        concurso.inscripcion(p);
    }
    @Override
    public String nombreConcurso() {
        return concurso.nombreConcurso();
    }
}
