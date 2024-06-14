import java.io.File;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

import Tp7_3.i_o.Report;

import Tp7_3.modelo.ReporteNoSobreEscribible;
import Tp7_3.modelo.ReporteSobreEscribible;

public class TestReportes {
    @Test
    public void testReportes() {
        Report report = new Report("reporte viejo");
        ReporteSobreEscribible rSobreEscribible = new ReporteSobreEscribible(report);
        ReporteNoSobreEscribible rNoSobreEscribible = new ReporteNoSobreEscribible(report);
        File f = new File("/home/jose/Escritorio/reporte.txt");

        rSobreEscribible.export(f);
        report = new Report("reporte nuevo");

        assertThrows(
                RuntimeException.class,
                () -> rNoSobreEscribible.export(f));
        System.out.println(rNoSobreEscribible.getReporte());
        rSobreEscribible.export(f);
        System.out.println(rSobreEscribible.getReporte());
    }
}
