package ShapeExercise.application;

import ShapeExercise.entities.Circle;
import ShapeExercise.entities.Rectangle;
import ShapeExercise.entities.Shape;
import ShapeExercise.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        // declaração da lista de shapes (formas)
        List<Shape> listOfShape = new ArrayList<Shape>();

        // funcionamento principal do programa
        System.out.print("Enter the number of shapes: ");
        int numShapes = in.nextInt();

        // inserindo os dados de cada shape (forma)
        for (int i = 1; i <= numShapes; i++){
            System.out.println("Shape #"+i+" data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char typeShape = in.next().charAt(0);
            System.out.print("Color (CLACK/BLUE/RED): ");
            Color color = Color.valueOf(in.next());

            // verificação do tipo da shape atual
            if (typeShape == 'r'){
                System.out.print("Width: ");
                Double width = in.nextDouble();
                System.out.print("Height: ");
                Double height = in.nextDouble();

                // instanciando o objeto do tipo Rectangle na lista de shapes
                listOfShape.add(new Rectangle(color, width, height));
            }
            else {
                System.out.print("Radius: ");
                Double radius = in.nextDouble();

                // instanciando o objeto do tipo Circle na lista de shapes
                listOfShape.add(new Circle(color, radius));
            }
        }

        // exibição de áreas de cada um dos shapes
        System.out.println("\nAREA SHAPES:");

        // percorrendo a lista e pegando o valor da area de cada um dos objetos presentes
        for (Shape shape: listOfShape){
            System.out.println(String.format("%.2f", shape.area()));
        }

        in.close();
    }

}
