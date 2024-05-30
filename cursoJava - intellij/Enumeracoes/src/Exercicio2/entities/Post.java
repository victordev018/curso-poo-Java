package Exercicio2.entities;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class Post {
    // atributos
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
}
