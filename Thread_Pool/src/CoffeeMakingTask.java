public class CoffeeMakingTask extends Task {

    private static final int TIME_PER_CUP = 200;

    public CoffeeMakingTask(int numCups) {
        super(numCups * TIME_PER_CUP);
    }

    @Override
    public String toString() {
        return String.format("%s %s ", this.getClass().getSimpleName(), super.toString());
    }
}


