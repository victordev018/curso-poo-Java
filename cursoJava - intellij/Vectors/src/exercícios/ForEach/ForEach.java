package exercícios.ForEach;

public class ForEach {

    public static void main(String[] args){

        //criando um vetor com alguns elementos:
        String[] vetor = new String[] {"Maria", "João", "Pedro"};

        //percorrendo vetor com loop for-each:
        for (String elements: vetor){
            System.out.println(elements);
        }
    }
}
