public class excelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Excel Document");
        System.out.println();
    }

    @Override
    public void close() {
        System.out.println("Closing Excel Document");
        System.out.println();
    }

    @Override
    public void save() {
        System.out.println("Saving Excel Document");
        System.out.println();
    }   
    
}
