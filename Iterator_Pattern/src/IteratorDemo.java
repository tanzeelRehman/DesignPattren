public class IteratorDemo {
    public static void main(String[] args) {
        Facebook facebook = new Facebook();
        Profile profile = new Profile("ahzam@gmail.com", "ahzam");
        Profile profile1 = new Profile("rafay@gmail.com", "rafay");
        Profile profile2 = new Profile("zeeshan@gmail.com", "zeeshan");
        Profile profile3 = new Profile("tanzeel@gmail.com", "tanzeel");
        Profile profile4 = new Profile("testing@gmail.com", "Rubel");
        facebook.addCoWorker(profile3);
        facebook.addCoWorker(profile4);

        facebook.addFriend(profile);
        facebook.addFriend(profile1);

        facebook.addFriend(profile2);

        System.out.println("Co Workers Iterator : ");
        FacebookIteratorI coWorkersIterator = (FacebookIteratorI) facebook.getCoWorkersIterator();
        while (coWorkersIterator.hasMore()) {
            System.out.println(coWorkersIterator.getNext());
        }
        System.out.println("Friends Iterator : ");
        FacebookIteratorI friendsIterator = (FacebookIteratorI) facebook.getFriendsIterator();
        while (friendsIterator.hasMore()) {
            System.out.println(friendsIterator.getNext());
        }

    }
}
