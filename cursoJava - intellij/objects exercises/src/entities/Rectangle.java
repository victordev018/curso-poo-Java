package entities;

public class Rectangle {
    // atributos
    public double width; //largura
    public double height; //altura

    // métodos
    //método para calcular area do retângulo
    public double Area(){
        return width * height;
    }

    //metodo para calcular perímetro do retângulo
    public double Perimeter(){
        return 2*width + 2*height;
    }

    //método para calcular diagonal do retângulo
    public double Diagonal(){
        return Math.sqrt(Math.pow(width,2) + Math.pow(height, 2));
    }
}
