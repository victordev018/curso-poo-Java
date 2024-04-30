package listas;

//importações:
import java.util.ArrayList; // ArreyList
import java.util.List;      // List

public class Lista {

    public static void main(String[] args){

        // criando uma lista de nomes com a Interface List, instanciada pela classe ArrayList:
        // List não aceita parametrização com o tipo primitivo, somente o Hiper Class
        List<String> listName = new ArrayList<String>();


        // adicionando elemetos:
        listName.add("Maria");
        listName.add("Alex");
        listName.add("Bob");
        listName.add("Ana");

        // pertcorrendo lista:
        for (String name: listName){
            System.out.println(name);
        }
    }

}
