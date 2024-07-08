package HashCodeAndEquals.entities;

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
}
