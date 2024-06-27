package homeWork;

public class CompressionDecorator extends DataSourceDecorator {
  public CompressionDecorator(DataSource s) {
    super(s);
  }

  @Override
  public void readData() {
    System.out.println("Reading Compressed Data");
  }

  @Override
  public void writeData(String data) {
    System.out.println("Compressing data.");
  }
}
