public class Originator {
    private double x;
    private double y;
    private String lastUndoSavePoint;
    private CareTaker careTaker;


    public Originator(double x, double y, CareTaker careTaker) {
        this.x = x;
        this.y = y;
        this.careTaker = careTaker;
        createSavePoint("INITIAL");
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    void createSavePoint(String savepointName) {
        careTaker.saveMemento(new Memento(this.x, this.y), savepointName);
        lastUndoSavePoint = savepointName;
    }

    void undo() {
        setOriginatorState(lastUndoSavePoint);
    }

    void undo(String savePointName) {
        setOriginatorState(savePointName);
    }

    void undoAll() {
        setOriginatorState("INITIAL");
        careTaker.clearSavePoints();
    }

    public void setOriginatorState(String savePointName) {
        Memento memento = (Memento) careTaker.getMemento(savePointName);
        this.x = memento.x;
        this.y = memento.y;
    }

    @Override
    public String toString() {
        return "Originator{" +
                "x=" + x +
                ", y=" + y +
                ", lastUndoSavePoint='" + lastUndoSavePoint + '\'' +
                '}';
    }

    class Memento {
        private double x;
        private double y;

        public Memento(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }
    }
}
