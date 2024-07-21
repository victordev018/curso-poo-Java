package ShapeExercise.entities;

import ShapeExercise.entities.enums.Color;

public class Circle extends Shape{

    // atributos
    private Double radius;  // raio

    // construtores
    public Circle(){
    }

    public Circle (Color color, Double radius){
        super(color);
        this.radius = radius;
    }

    // get e set
    public Double getRadius(){ return radius;}

    public void setRadius(Double radius){ this.radius = radius;}

    // métodos

    // implementação do método abstrato da super classe Shape
    @Override
    public Double area(){
        return 3.14 * radius * radius;
    }

}
