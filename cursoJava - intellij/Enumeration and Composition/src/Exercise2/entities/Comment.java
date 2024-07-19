package Exercise2.entities;

public class Comment {
    // atributos
    private String text;

    // construtores
    public Comment(){
    }

    public Comment(String text){
        this.text = text;
    }

    // get e set
    public String getText(){
        return text;
    }
    public void setText(String text){
        this.text = text;
    }

}
