package Tp7_3.modelo;

import java.io.File;

public class ReporteNoSobreEscribible extends Reportable {

    public ReporteNoSobreEscribible(Reportar reportar) {
        super(reportar);
    }

    public void export(File file) {
        if (file == null) {
            throw new RuntimeException("El archivo no puede ser nulo");
        }
        if (file.exists()) {
            throw new RuntimeException("El archivo ya existe");

        }
        reportar.export(file);
    }

}
