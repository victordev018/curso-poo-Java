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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
