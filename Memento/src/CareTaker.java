import java.util.HashMap;
import java.util.Map;

public class CareTaker {
   private final Map<String, Object> savepointStorage = new HashMap<>();

    void saveMemento(Object value, String key) {
        savepointStorage.put(key, value);
    }

    Object getMemento(String key) {
        return savepointStorage.get(key);
    }

    void clearSavePoints() {
        savepointStorage.clear();
        System.out.println("All SavePoints are cleared.");
    }
}
