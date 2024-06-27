public class Demo {
    public static void main(String[] args) {
        TVContext remote  = new TVContext();
        State tvStartState = new TVOnState();
        State tVOffState = new TVOffState();
        remote.setTvState(tvStartState);
        remote.doAction();
        remote.setTvState(tVOffState);
        remote.doAction();
//        TVBasic tv = new TVBasic();
//        tv.setState("ON");
//        tv.doAction();
    }
}
