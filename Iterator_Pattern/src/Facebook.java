import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

public class Facebook implements SocialNetwork {
    private List<Profile> coworkers = new ArrayList<Profile>();
    private List<Profile> friends = new ArrayList<Profile>();
    private IteratorI iterator;

    @Override
    public IteratorI getFriendsIterator() {

        iterator =  new FacebookIteratorI(friends);
        return iterator;

    }

    @Override
    public IteratorI getCoWorkersIterator() {
        iterator =  new FacebookIteratorI(coworkers);
        return iterator;
    }

    void addFriend(Profile profile) {
        friends.add(profile);
    }

    void addCoWorker(Profile profile) {
        coworkers.add(profile);
    }


}
