
public abstract class DataParser {
    protected final void parseDataAndGenerateOutput() {  //template method
        readData();
        processData();
        writeData();
    }

   protected abstract void processData();

   protected abstract void readData();

    protected final void writeData() { //concrete method
        System.out.println("Output generated, writing to CSV ");
    }
}
