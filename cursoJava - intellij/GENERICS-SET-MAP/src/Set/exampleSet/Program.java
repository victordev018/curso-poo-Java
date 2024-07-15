package Set.exampleSet;

import java.util.*;

public class Program {

    public static void main(String[] args) {

        // a interface Set pode ser implementada pelas seguintes classes:
        // hashSet -> executas as operações mais rápido porem não garante a ordenação
        // treeSet -> mais lenta, mas garante a ordenação usando o comparteTo do obj ou o Comparator
        // LinkedHashSet -> velocidade intermediária, ordena de acordo com a ordem de entrada
        // o Set não permite a repetição de valor

        Set<String> set = new HashSet<>();

        // adicionando elementos
        set.add("Tablet");
        set.add("Notebook");
        set.add("Tv");

        // verificando se existe determinado valor na estrutura de dados
        System.out.println(set.contains("Tv"));

        // removendo valores da estrutura a partir de um predicado
        set.removeIf(x -> x.charAt(0) == 'T');

        // imprimindo valores da estrutura
        for (String element : set){
            System.out.println(element);
        }

        // OPERAÇÕES DE CONJUTOS

        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        // união
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        // intersecção
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        // direferença
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);
    }
}
