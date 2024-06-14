import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import tp7_4.modelo.Combo;
import tp7_4.modelo.ComboBasico;
import tp7_4.modelo.ComboBuilder;
import tp7_4.modelo.ComboFamiliar;

public class TestHamburgeseria {
    @Test
    public void testHamburgeseriaFamiliar() {
        var comboBuil = new ComboBuilder(new ComboFamiliar(1500));
        Combo combo;
        comboBuil.conQueso().conCarne().conTomate().conPapas();
        combo = comboBuil.buil();
        System.out.println(combo.getDescripccion());
        assertEquals(combo.getDescripccion(), "Combo familiar con queso con carne con tomate con papas");
        // con papas");
        assertTrue(combo.getPrecio() == 3700);

        assertEquals(true, true);
    }

    @Test
    public void testHamburgeseriaBasico() {

        var comboBuil = new ComboBuilder(
                new ComboBasico(1500));
        Combo combo;
        comboBuil.conQueso().conPapas();

        combo = comboBuil.buil();
        System.out.println(combo.getDescripccion());
        assertEquals(combo.getDescripccion(),
                "Combo basico con queso con papas");

        assertTrue(combo.getPrecio() == 2600);

    }
}
