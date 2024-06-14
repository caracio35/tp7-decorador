

import tp7_5.concurso.LibretaTex;

public class MokEnDiscoLibretaText implements LibretaTex {

    String p;
    String c;

    public void inscribir(String p, String c) {
        this.p = p;
        this.c = c;
    }

    public boolean estaInscripto(String p1) {

        return (p == p1);
    }

}
