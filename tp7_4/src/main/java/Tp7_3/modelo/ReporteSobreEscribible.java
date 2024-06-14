package Tp7_3.modelo;

import java.io.File;

public class ReporteSobreEscribible extends Reportable {
    // nombre del reporte es reporte con file no null y no repetir report

    public ReporteSobreEscribible(Reportar reportar) {
        super(reportar);
    }

    public void export(File file) {
        if (file == null) {
            throw new RuntimeException("El archivo no puede ser nulo");
        }
        super.export(file);
    }

}
