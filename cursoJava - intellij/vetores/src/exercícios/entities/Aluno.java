package exercícios.entities;

public class Aluno {
    //atributos
    private String Nome;
    private  double Nota1;
    private double Nota2;

    //construtor:
    public Aluno(String Nome, double Nota1, double Nota2){
        this.Nome = Nome;
        this.Nota1 = Nota1;
        this.Nota2 = Nota2;
    }

    //geters:
    public String getNome(){
        return Nome;
    }

    public double getNota1(){
        return Nota1;
    }

    public double getNota2(){
        return Nota2;
    }
}
