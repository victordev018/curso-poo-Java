package Generics.delimitedGenerics.services;

import java.util.List;

public class CalculationService {

    // método para calcular o maior elemento de uma lista, baseado em seu preço
    public static <Type extends Comparable<Type>> Type max(List<Type> list){
        // verificação se a lista está vazia
        if (list.isEmpty()){
            throw new IllegalStateException("List can't be empty");
        }
        // variável do tipo Type que guardará o maior
        Type max = list.getFirst();
        for (Type item : list){
            if (item.compareTo(max) > 0){
                max = item;
            }
        }
        return max;
    }

}
