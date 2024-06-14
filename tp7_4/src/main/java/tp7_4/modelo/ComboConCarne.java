package tp7_4.modelo;

public class ComboConCarne implements Combo {
    Combo combo;

    public ComboConCarne(Combo combo) {
        this.combo = combo;
    }

    @Override
    public String getDescripccion() {
        return combo.getDescripccion() + " con carne";
    }

    @Override
    public double getPrecio() {
        return combo.getPrecio() + 750;
    }

}
