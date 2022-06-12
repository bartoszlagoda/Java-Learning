package docs;

public class DocumentChecker {
    public static void main(String[] args) {
        // poprzez interfejs odwołujemy się do klas korzystających z tego interfejsu
        Document excel = new ExcelDocument();
        Document pdf = new PdfDocument();

        excel.getDescription();
        pdf.getDescription();
    }
}
