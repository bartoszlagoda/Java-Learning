package Document;

public class DocumentChecker {
    public static void main(String[] args) {
        //ExcelDocument document = new ExcelDocument();
        // ExcelDocument jest jedną z postaci Document
        Document excelDocument = new ExcelDocument();
        // PdfDocument jest również jedną z postaci Document
        Document pdfDocument = new PdfDocument();

        excelDocument.getDescription();
        pdfDocument.getDescription();
    }
}
