package homeWork;

public class EncryptionDecorator extends DataSourceDecorator {
  public EncryptionDecorator(DataSource s) {
    super(s);
  }

  @Override
  public void readData() {
    System.out.println("Reading Encrypted Data");
  }

  @Override
  public void writeData(String data) {
    System.out.println("Writing Encryption to data.");
  }
}
