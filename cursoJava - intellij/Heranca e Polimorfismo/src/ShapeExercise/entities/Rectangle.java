package ShapeExercise.entities;

import ShapeExercise.entities.enums.Color;

public class Rectangle extends Shape{

    // atributos
    private Double width;   // largura
    private Double height;  // altura

    // construtores
    public Rectangle(){
    }

    public Rectangle (Color color ,Double width, Double height){
        super(color);
        this.width = width;
        this.height = height;
    }

    // get e set
    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    // métodos

    // implementação do método abstrato area da super classe
    @Override
    public Double area(){
        return width * height;
    }

}
