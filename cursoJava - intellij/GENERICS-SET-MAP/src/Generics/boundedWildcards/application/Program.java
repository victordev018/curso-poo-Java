package Generics.boundedWildcards.application;  // coringas delimitados

import Generics.boundedWildcards.entities.Circle;
import Generics.boundedWildcards.entities.Rectangle;
import Generics.boundedWildcards.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args){
        // ciando lista de Shapes
        List<Shape> listShapes = new ArrayList<>();

        // ciando lista de Círculos
        List<Circle> listCircles = new ArrayList<>();

        // adicionando Shapes na lista
        listShapes.add(new Circle(4.5));
        listShapes.add(new Rectangle(3, 4));

        // adicionando circulos na lista de circulos
        listCircles.add(new Circle(2.4));
        listCircles.add(new Circle(5));

        // exibindo valor total de aresa das formas presentes na lista de circulos
        System.out.println("Total area: " + totalArea(listCircles));
    }

    // método que calcula o total  area de uma lista de Shapes ou de uma classe que implemente Shape
    public static Double totalArea(List<? extends Shape> list){
        double sum = 0.0;
        for (Shape s : list){
            sum += s.area();
        }
        return sum;
    }
}
