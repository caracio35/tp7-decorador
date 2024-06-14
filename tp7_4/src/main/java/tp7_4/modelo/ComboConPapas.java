package tp7_4.modelo;

public class ComboConPapas implements Combo {
    Combo combo;

    public ComboConPapas(Combo combo) {
        this.combo = combo;
    }

    @Override
    public String getDescripccion() {
        return combo.getDescripccion() + " con papas";
    }

    @Override
    public double getPrecio() {
        return combo.getPrecio() + 450;
    }

}
