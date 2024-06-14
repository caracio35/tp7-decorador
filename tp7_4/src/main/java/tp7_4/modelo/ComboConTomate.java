package tp7_4.modelo;

public class ComboConTomate implements Combo {
    private Combo combo;

    public ComboConTomate(Combo combo) {
        this.combo = combo;
    }

    @Override
    public String getDescripccion() {
        return combo.getDescripccion() + " con tomate";
    }

    @Override
    public double getPrecio() {
        return combo.getPrecio() + 350;
    }

}
