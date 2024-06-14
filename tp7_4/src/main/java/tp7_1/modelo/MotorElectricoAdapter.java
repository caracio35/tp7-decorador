package tp7_1.modelo;

import tp7_1.motorElectrico.MotorElectrico;

public class MotorElectricoAdapter implements Motor {

    private final MotorElectrico motorElectrico;

    public MotorElectricoAdapter(MotorElectrico motorElectrico) {
        this.motorElectrico = motorElectrico;
    }

    @Override
    public String arrancar() {
        return motorElectrico.conectar();
    }

    @Override
    public String acelerar() {
        return motorElectrico.moverMasRapido();
    }

    @Override
    public String apagar() {
        return motorElectrico.detener() + " y " + motorElectrico.desconectar();
    }

}
