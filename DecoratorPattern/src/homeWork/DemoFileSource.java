package homeWork;

public class DemoFileSource {
  public static void main(String[] args) {
    DataSource  source = new FileDataSource("somefile.dat");
      source.writeData("salaryRecords");

      source = new CompressionDecorator(source);
      source.writeData("salaryRecords");

      source = new EncryptionDecorator(source);
      // The source variable now contains this:
      // Encryption > Compression > FileDataSource
      source.writeData("salaryRecords");

  }
}
