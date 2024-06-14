package tp7_4.modelo;

public class ComboBasico implements Combo {

    protected double precioUnitario;

    public ComboBasico(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getDescripccion() {
        return "Combo basico";
    }

    public double getPrecio() {
        return precioUnitario;
    }
}