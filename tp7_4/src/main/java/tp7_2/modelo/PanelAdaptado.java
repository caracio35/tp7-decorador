package tp7_2.modelo;

import java.awt.Graphics2D;

public class PanelAdaptado implements Panel {

    private Graphics2D g2d;

    public PanelAdaptado(Graphics2D g) {

        g2d = (Graphics2D) g;
    }

    @Override
    public void pintarCirculo(Coordenada coordenada, int radio) {
        g2d.drawOval(coordenada.x() - radio, coordenada.y() - radio, 2 * radio, 2 * radio);

    }

    @Override
    public void pintarTexto(Coordenada Coordenada, String texto) {
        g2d.drawString(texto, Coordenada.x(), Coordenada.y());
    }

    @Override
    public void pintarLinea(Coordenada Coordenada, int longitud) {
        g2d.drawLine(Coordenada.x(), Coordenada.y(), Coordenada.x() + longitud, Coordenada.y());
    }

}
