package Exercicio3.entities;

import java.time.LocalDate;

public class Client {

    // atributos
    private String name;
    private String email;
    private LocalDate birthDate;

    // construtores
    public Client(){
    }

    public Client(String name, String email, LocalDate birthDate){
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    // geters e seters
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
