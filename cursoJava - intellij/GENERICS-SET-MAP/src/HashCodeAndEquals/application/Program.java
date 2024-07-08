package HashCodeAndEquals.application;

import HashCodeAndEquals.entities.Client;

public class Program {
    public static void main(String[] args){

        // instanciando dois objetos clienetes e comparando eles
        Client c1 = new Client("João", "joao@gmail.com");
        Client c2 = new Client("João", "joao@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));

    }
}
