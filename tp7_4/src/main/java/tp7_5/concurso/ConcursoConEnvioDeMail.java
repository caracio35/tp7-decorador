package tp7_5.concurso;



public class ConcursoConEnvioDeMail extends ConcursoSimple {

    public ConcursoConEnvioDeMail(Concu concurso) {
        super(concurso);
    }
    public void inscripcion(Participante p) {
        
        EnvioDeMail envioDeMail = new EnvioDeMailConcursantes();
        String dirMail = p.cualEsTuMail();
        envioDeMail.envioDeMail(dirMail);
        super.inscripcion(p);
    }

    

}
