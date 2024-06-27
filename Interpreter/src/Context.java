public class Context {
    String input;
    int output;

    public Context(String input) {
        setInput(input);
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        System.out.println("input is "+input);
        this.input = input;
    }

    public int getOutput() {
        return output;
    }

    public void setOutput(int output) {
        this.output = output;
        System.out.println("output is "+output);
    }
}
