package Generics.exampleGenerics.services;

import java.util.ArrayList;
import java.util.List;

// serviço printService -> parametrizada por um tipo Type
public class PrintService<Type> {

    // lista de objetos do tipo Type
    List<Type> list = new ArrayList<>();

    // método para adicionar um novo elemento na lista
    public void addValue(Type value){
        list.add(value);
    }

    // método para pegar o primeiro valor da lista
    public Type first(){
        // se a lista estiver vazia
        if (list.isEmpty()){
            throw new IllegalStateException("Value not fund");
        }
        return list.getFirst();
    }

    // método para printar a lista
    public void print(){
        System.out.print("[");
        if (!list.isEmpty()){
            System.out.print(list.get(0));
        }
        for (int i = 1; i < list.size(); i++){
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");
    }

}
