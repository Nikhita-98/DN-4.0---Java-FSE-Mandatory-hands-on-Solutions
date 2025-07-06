public class WordDoc implements Doc {
    @Override
    public void open() {
        System.out.println("Opening Word Document");
        System.out.println();
    }

    @Override
    public void close() {
        System.out.println("Closing Word Document");
        System.out.println();
    }

    @Override
    public void save() {
        System.out.println("Saving Word Document");
        System.out.println();
    }
}
