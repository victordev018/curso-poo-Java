package lists;

//importações:
import java.util.ArrayList; // ArreyList
import java.util.stream.Collectors;

public class List {

    public static void main(String[] args){

        // criando uma lista de nomes com a Interface List, instanciada pela classe ArrayList:
        // List não aceita parametrização com o tipo primitivo, somente o Hiper Class
        java.util.List<String> listName = new ArrayList<String>();


        // adicionando elemetos:
        listName.add("Maria");
        listName.add("Alex");
        listName.add("Bob");
        listName.add("Ana");
        listName.add("Jorge");
        listName.add("Dymon");
        listName.add("João");


        // inserindo novo elemneto em uma posição específica:
        listName.add(2, "Marcos");

        //pegando taanho da lista:
        System.out.println("\nSize list: " + listName.size());
        // pertcorrendo lista:
        System.out.println("Elementos da original:");
        for (String name: listName){
            System.out.println(name);
        }

        // removendo elementos da lista:
        listName.remove("Ana");  // pelo valor
        listName.remove(1);   // pelo index


        // removendo por predicado:
        // para todo nome na lista, tal que a primeira letra seja 'M', será apagado
        listName.removeIf(name -> name.charAt(0) == 'M');


        //pegando taanho da lista:
        System.out.println("\nSize list: " + listName.size());
        // pertcorrendo lista:
        System.out.println("Elementos atualizados:");
        for (String name: listName){
            System.out.println(name);
        }

        // pegano o index de algum elemento:
        System.out.println("\nIndex de Bob: " + listName.indexOf("Bob"));
        //IndexOf = -1 se o elemento não for encontrado

        // filtrando e armazenando em um outra lista os elementos que começam com a letra 'J':
        java.util.List<String> newList = listName.stream().filter(name -> name.charAt(0) == 'J').collect(Collectors.toList());
        // Basicamente, new list recebe um stream filtrado com determinado predicado, porém, como List não aceita strem
        // usamos collect(Collectors.toList), para converter para lista novamente e ser aceita

        System.out.println("\nLista filtrada por 'J': ");
        for(String name: newList){
            System.out.println(name);
        }

        // pegando o primeiro elemento que atenda determinado predicado:
        String firstNameJ = listName.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        // Basicamente, irei filtrar os nomes com 'J', e irei pegar o primeiro que aparecer usando o findFirst.
        // orElse(null), retorna null caso não possua este elemento.

        System.out.println("\nName First 'J': " + firstNameJ);
    }

}
