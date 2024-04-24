package exercícios.entities;

public class Pessoa {

    private String Nome;
    private int Idade;

    public Pessoa(String nome, int idade) {
        this.Nome = nome;
        this.Idade = idade;
    }

    public String getNome(){
        return Nome;
    }

    public int getIdade(){
        return Idade;
    }

}
