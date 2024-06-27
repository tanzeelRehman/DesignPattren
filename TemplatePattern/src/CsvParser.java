public class CsvParser extends DataParser {
    @Override
  protected  void processData() {
        System.out.println("CSV Data is being processed");
    }

    @Override
    protected void readData() {
        System.out.println("CSV Data is being read");
    }
}
