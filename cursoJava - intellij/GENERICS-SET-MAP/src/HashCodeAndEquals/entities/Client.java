package HashCodeAndEquals.entities;

import java.util.Objects;

public class Client {

    // atributos
    private String name;
    private String email;

    // construtor
    public Client(){
    }

    public Client(String name, String email){
        this.name = name;
        this.email = email;
    }

    // get e set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // sobreposição do método de comparação entre os objetos desta classe
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) && Objects.equals(email, client.email);
    }

    // sobreposição do método que gera um hashCode para o objeto, para permitir a comparação entre os objetos
    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }
}
