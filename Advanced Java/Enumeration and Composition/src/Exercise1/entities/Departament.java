package Exercise1.entities;

public class Departament {
    private String name;

    // construtores
    public Departament(){
    }

    public Departament(String name){
        this.name = name;
    }

    // getrs e setrs
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
