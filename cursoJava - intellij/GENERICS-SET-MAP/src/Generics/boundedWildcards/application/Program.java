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

        // adicionando Shapes na lista
        listShapes.add(new Circle(4.5));
        listShapes.add(new Rectangle(3, 4));

        // exibindo valor total de aresa das formas presentes na lista de Shapes
        System.out.println("Total area: " + totalArea(listShapes));
    }

    // método que calcula o total  area de uma lista de Shapes
    public static Double totalArea(List<Shape> list){
        double sum = 0.0;
        for (Shape s : list){
            sum += s.area();
        }
        return sum;
    }
}
