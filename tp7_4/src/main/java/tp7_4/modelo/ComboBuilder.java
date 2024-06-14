package tp7_4.modelo;

public class ComboBuilder {
    Combo combo;
    Combo comboBuil;

    public ComboBuilder(Combo combo) {
        this.combo = combo;
        comboBuil = combo;

    }

    public ComboBuilder conQueso() {
        comboBuil = new ComboConQueso(comboBuil);
        return this;
    }

    public ComboBuilder conCarne() {
        comboBuil = new ComboConCarne(comboBuil);
        return this;
    }

    public ComboBuilder conTomate() {
        comboBuil = new ComboConTomate(comboBuil);
        return this;
    }

    public ComboBuilder conPapas() {
        comboBuil = new ComboConPapas(comboBuil);
        return this;
    }

    public Combo buil() {
        return comboBuil;
    }

}
