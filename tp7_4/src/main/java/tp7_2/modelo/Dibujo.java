package tp7_2.modelo;

import java.util.List;

public class Dibujo implements Figura {

    private List<Figura> figuras;

    public Dibujo(List<Figura> figuras) {
        this.figuras = figuras;
    }

    @Override
    public void dibujar(Panel panel) {
        for (Figura figura : figuras) {
            figura.dibujar(panel);
        }
    }
}
