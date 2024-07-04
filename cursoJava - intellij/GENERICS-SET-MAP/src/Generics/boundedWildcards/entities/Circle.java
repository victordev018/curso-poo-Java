package Generics.boundedWildcards.entities;

public class Circle implements Shape{

    private static final double PI = Math.PI;

    // atributos
    private double radius;  // raio

    // construtores
    public Circle(){
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    // get e set
    public double getRadius(){return radius;}

    public void setRadius(Double radius){this.radius = radius;}

    // sobreposição do método area da interface Shape
    @Override
    public double area(){
        return PI * radius * radius;
    }
}
