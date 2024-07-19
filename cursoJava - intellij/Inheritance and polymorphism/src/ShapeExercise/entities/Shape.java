package ShapeExercise.entities;
import ShapeExercise.entities.enums.Color;

public abstract class Shape {

    // atributos
    private Color color;

    // construtores
    public Shape(){
    }

    public Shape(Color color){
        this.color = color;
    }

    // get e set
    public Color getColor(){
        return color;
    }

    public void setColor(Color color){
        this.color = color;
    }

    // métodos

    // declaração de método abstrato de área
    public abstract Double area();
}
