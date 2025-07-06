public class wordDocFac extends DocFact {
    @Override
    public Doc createDocument() {
        return new WordDoc();
    }
}
