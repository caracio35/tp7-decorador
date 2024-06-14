package Tp7_3.modelo;

import java.io.File;

public class Reportable implements Reportar {

    protected Reportar reportar;

    public Reportable(Reportar reportar) {
        this.reportar = reportar;
    }

    @Override
    public String getReporte() {
        return reportar.getReporte();
    }

    @Override
    public void export(File file) {
        reportar.export(file);
    }

}
