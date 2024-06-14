import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import tp7_1.modelo.MotorEconomico;
import tp7_1.modelo.MotorElectricoAdapter;
import tp7_1.modelo.MotroComun;
import tp7_1.motorElectrico.MotorElectrico;

public class TestMotores {
    @Test
    public void testMotores() {
        var motorEconomico = new MotorEconomico();
        var motorElectrico = new MotorElectricoAdapter(new MotorElectrico());
        var motorComun = new MotroComun();
        assertEquals(motorEconomico.arrancar(), "Motor arrancado");
        assertEquals(motorEconomico.acelerar(), "Motor acelerado");
        assertEquals(motorEconomico.apagar(), "Motor apagado");
        assertEquals(motorElectrico.arrancar(), "motor Electrico Conectado");
        assertEquals(motorElectrico.acelerar(), "motor Electrico Moviendose más rápido");
        assertEquals(motorElectrico.apagar(), "motor Electrico Detenido y motor Electrico Desconectado");
        assertEquals(motorComun.arrancar(), "Motor arrancado");
        assertEquals(motorComun.acelerar(), "Motor acelerado");
        assertEquals(motorComun.apagar(), "Motor apagado");
    }
}
