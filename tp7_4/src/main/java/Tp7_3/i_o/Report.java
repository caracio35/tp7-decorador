package Tp7_3.i_o;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import Tp7_3.modelo.Reportar;

public class Report implements Reportar {
    private String reporte;

    public Report(String reporte) {
        this.reporte = reporte;

    }

    public String getReporte() {
        return reporte;
    }

    public void export(File file) {

        try (FileWriter fw = new FileWriter(file)) {
            fw.write(reporte);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al exportar el reporte", e);
        }
    }

}
