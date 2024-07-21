package Map.demostrationMap;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args){

        // instanciando uma estrutura Map com chave e valor do tipo String
        Map<String, String> cookies = new TreeMap<>();

        // adicionando valores
        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "987654299");

        cookies.remove("email");
        cookies.put("phone", "99999999");   // sobrescreve o valor da key 'phone'
        System.out.println("Contains 'phone' kwy: " + cookies.containsKey("phone"));
        System.out.println("Value of 'email' key: " + cookies.get("email"));
        System.out.println("Cookies size: " + cookies.size());

        // percorrendo os elementos da estrutura
        for (String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
