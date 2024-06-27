public class TVContext {
    private State tvState;

    public void setTvState(State tvState) {
        this.tvState = tvState;
    }

    public State getTvState() {
        return tvState;
    }

    public void doAction() {
        this.tvState.doAction();
    }
}
