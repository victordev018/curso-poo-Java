package exercícios;

import exercícios.entities.Rent;

import java.util.Scanner;

public class desafioPensionato {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("How many rooms will be rented? ");  //quantos quartos serão alugados
        int n = in.nextInt();
        Rent[] vect = new Rent[10];

        for (int c = 0; c < n; c++){
            in.nextLine();
            System.out.printf("%nRENT #%d:%n", c+1);
            System.out.print("Name: ");
            String nome = in.nextLine();
            System.out.print("Email: ");
            String email = in.next();
            System.out.print("Room: ");
            int roomNumber = in.nextInt();

            vect[roomNumber] = new Rent(nome, email);
        }

        System.out.printf("%nBusy rooms:%n"); //quartos ocupados
        for (int c = 0; c < vect.length; c++){
            if (vect[c] != null){
                System.out.println(c + ": " + vect[c].toString());
            }
        }
        in.close();
    }

}
