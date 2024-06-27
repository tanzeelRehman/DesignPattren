package observer.example2;

public class CommentaryDemo {
    public static void main(String[] args) {
        SmsSubsciber subsciber = new SmsSubsciber("Ahzam");
        SmsSubsciber subsciber1 = new SmsSubsciber("Zeeshan");

        Commentary commentary = new Commentary();
        commentary.subscribe(subsciber);
        commentary.subscribe(subsciber1);
        commentary.setDesc(Comment.The_match_will_start_soon.name());
        commentary.setDesc(Comment.It_is_boundary.name());
        commentary.setDesc(Comment.Its_a_six.name());
        commentary.setDesc(Comment.Pakistan_Won.name());
        commentary.setDesc(Comment.India_Lost.name());


    }
}
