import java.io.IOException;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import tp7_5.concurso.Concu;
import tp7_5.concurso.Concurso;
import tp7_5.concurso.ConcursoConEnvioDeMail;
import tp7_5.concurso.ConcursoSimple;
import tp7_5.concurso.LibretaTex;
import tp7_5.concurso.Participante;

public class TestConcurso {
    @Test
    public void testConcurso() {
        LibretaTex l =new LibretaTex() {

            @Override
            public void inscribir(String p, String c) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'inscribir'");
            }

            @Override
            public boolean estaInscripto(String p) throws IOException {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'estaInscripto'");
            }
            
        };
        Concurso concurso=new Concurso("Concurso de prueba",LocalDate.now(),LocalDate.now().plusDays(1),l);
        ConcursoSimple c = new ConcursoSimple(concurso);
        ConcursoConEnvioDeMail cConEnvioDeMail = new ConcursoConEnvioDeMail(c);
        cConEnvioDeMail.inscripcion(new Participante("Jose", "35123456", "jose.perez@gmail.com"));
        cConEnvioDeMail.inscripcion(new Participante("Juan", "35113456", "juan.perez@gmail.com"));
        cConEnvioDeMail.inscripcion(new Participante("Maria", "35123457", "maria.perez@gmail.com"));
        cConEnvioDeMail.inscripcion(new Participante("Pedro", "35123458", "pedro.perez@gmail.com"));


        
    }
}
