public class pdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF Document");
        System.out.println();
    }

    @Override
    public void close() {
        System.out.println("Closing PDF Document");
        System.out.println();
    }

    @Override
    public void save() {
        System.out.println("Saving PDF Document");
        System.out.println();
    }
    
}
