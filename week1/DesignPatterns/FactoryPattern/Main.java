public class Main {
    public static void main(String[] args) {
        DocFact wordFactory = new wordDocFac();
        Doc wordDoc = wordFactory.createDocument();
        wordDoc.open();     
        wordDoc.save();  
        wordDoc.close(); 

        DocFact pdfFactory = new PdfDocFact();
        Doc pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();  
        pdfDoc.save();  
        pdfDoc.close();

    }
}
