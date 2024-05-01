package entities.Posts;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class PostApl {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Comment cm1 = new Comment("Hello, have a nice day");
        Comment cm2 = new Comment("WoW!!! That's nice, bro! ;)");
        Post post1 = new Post(sdf.parse("21/03/2023 14:21:55"), "Vacation",
                "Today I'm goig to travel for UK", 12);
        post1.addComment(cm2);
        post1.addComment(cm1);
        System.out.println(post1);
    }
}
