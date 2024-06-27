package homeWork;

public class DataSourceDecorator implements DataSource {
  private DataSource wrappee;

  public DataSourceDecorator(DataSource s) {
    wrappee = s;
  }

  @Override
  public void writeData(String data) {
    System.out.println("Data to write : " + data);
    //    wrapper.writeData(data);
  }

  @Override
  public void readData() {
    System.out.println("Reading data.");
  }
}
