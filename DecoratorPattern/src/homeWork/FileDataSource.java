package homeWork;

public class FileDataSource implements DataSource{
    String fileName;

    public FileDataSource(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void writeData(String data) {
    System.out.println("Writing data: "+data);
    }

    @Override
    public void readData() {
    System.out.println("Reading data.");
    }
}
