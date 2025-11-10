interface Exporter {
    void exportToCSV();
    void exportToPDF();

    default void exportToJSON() {
        System.out.println("Exported data in JSON format (default).");
    }
}

class ReportExporter implements Exporter {
    public void exportToCSV() { System.out.println("Exported data to CSV."); }
    public void exportToPDF() { System.out.println("Exported data to PDF."); }
}

public class DataExport {
    public static void main(String[] args) {
        ReportExporter report = new ReportExporter();
        report.exportToJSON();
    }
}
