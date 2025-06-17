public class excelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new excelDocument();
    }
    
}
