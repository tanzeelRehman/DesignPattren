public class Demo {
    public static void main(String[] args) {
        CsvParser csvParser  = new CsvParser();
        csvParser.parseDataAndGenerateOutput();
        System.out.println("**********************");
        DatabaseParser databaseParser = new DatabaseParser();
        databaseParser.parseDataAndGenerateOutput();

    }
}
