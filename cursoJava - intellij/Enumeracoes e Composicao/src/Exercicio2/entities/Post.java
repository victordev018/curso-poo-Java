package Exercicio2.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;


public class Post {
    // atributos
    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private LocalDateTime moment;
    private String title;
    private String content;
    private Integer likes;

    private List<Comment> comments = new ArrayList<Comment>();

    // construtores
    public Post(){
    }

    public Post(LocalDateTime moment, String title, String content, Integer likes){
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    // geters
    public LocalDateTime getMoment(){
        return moment;
    }

    public String getTitle(){
        return title;
    }

    public String getContent(){
        return content;
    }

    public Integer getLikes(){
        return likes;
    }

    // seters
    public void setMoment(LocalDateTime moment){
        this.moment = moment;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setContent(String content){
        this.content = content;
    }

    public void setLikes(int likes){
        this.likes = likes;
    }

    // métodos para gerenciar os comentários do post
    public void addComment(Comment comment){
        comments.add(comment);
    }

    public void removeComment(Comment comment){
        comments.remove(comment);
    }

    // toString
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes + " likes - " + moment.format(fmt) + "\n");
        sb.append(content + "\n");
        sb.append("Comments:\n");
        for (Comment c : comments){
            sb.append(c.getText() + "\n");
        }
        return sb.toString();
    }
}
