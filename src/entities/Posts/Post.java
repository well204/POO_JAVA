package entities.Posts;

import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Post {
    private String postTitle;
    private String postContent;
    private Date postMoment;
    private Integer like;
    private List<Comment> comments = new ArrayList<>();
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Post() {
    }

    public Post(Date postMoment, String postTitle, String postContent, Integer like) {
        this.postMoment = postMoment;
        this.postTitle = postTitle;
        this.postContent = postContent;
        this.like = like;
    }

    public void addComment(Comment comment) {
        this.comments.add(comment);
    }

    public void removeComment(Comment comment) {
        this.comments.remove(comment);
    }

    public Date getPostMoment() {
        return postMoment;
    }

    public void setPostMoment(Date postMoment) {
        this.postMoment = postMoment;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public List<Comment> getComments() {
        return comments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(postTitle + "\n");
        sb.append(like + " Likes" + " - ");
        sb.append(sdf.format(postMoment) + "\n");
        sb.append(postContent + "\n" + "Comments:" + "\n");
        for (Comment c : comments) {
            sb.append(c.getComment() + "\n");
        }
        return sb.toString();
    }
}
