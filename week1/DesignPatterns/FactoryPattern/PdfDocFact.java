public class PdfDocFact extends DocFact {
    @Override
    public Doc createDocument() {
        return new PdfDoc();
    }
    
}
