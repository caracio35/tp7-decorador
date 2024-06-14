package tp7_2.modelo;

class Linea implements Figura {
    private final Coordenada coordenada;
    private int longitud;

    public Linea(Coordenada coordenada, int longitud) {
        this.longitud = longitud;
        this.coordenada = coordenada;
    }

    @Override
    public void dibujar(Panel panel) {
        panel.pintarLinea(coordenada, longitud);
    }
}
