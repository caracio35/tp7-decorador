package tp7_1.modelo;

public class MotroComun implements Motor {

    @Override
    public String arrancar() {
        return "Motor arrancado";
    }

    @Override
    public String acelerar() {
        return "Motor acelerado";
    }

    @Override
    public String apagar() {
        return "Motor apagado";
    }

}
