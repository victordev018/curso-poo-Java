package exercícios.entities;

public class Rent {

    private String nome;
    private String email;

    public Rent(){

    }

    public Rent(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return getNome() + ", " + getEmail();
    }
}
