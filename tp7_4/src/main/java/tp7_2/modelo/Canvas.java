package tp7_2.modelo;

import javax.swing.*;
import java.awt.*;

class Canvas extends JPanel {
    private java.util.List<Figura> figuras;

    public Canvas() {
        figuras = new java.util.ArrayList<>();
    }

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        Panel panel = new PanelAdaptado(g2d);
        for (Figura figura : figuras) {
            figura.dibujar(panel);
        }
    }
}
