package tp7_4.modelo;

public class ComboConQueso implements Combo {
    Combo combo;

    public ComboConQueso(Combo combo) {
        this.combo = combo;
    }

    @Override
    public String getDescripccion() {
        return combo.getDescripccion() + " con queso";
    }

    @Override
    public double getPrecio() {
        return combo.getPrecio() + 650;
    }

}
