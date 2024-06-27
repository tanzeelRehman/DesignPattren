import java.util.List;

public class FacebookIteratorI implements IteratorI {
    int index = 0;
    private List<Profile> profiles;

    public FacebookIteratorI(List<Profile> profiles) {
        this.profiles = profiles;
    }

    @Override
    public boolean hasMore() {
        if (index >= profiles.size()) {
            return false;
        } else return true;
    }

    @Override
    public Profile getNext() {
        return profiles.get(index++);
    }
}
