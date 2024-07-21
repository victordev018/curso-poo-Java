package rentCarExercise.model.entities;

// classe referente ao veículo
public class Vehicle {

    // atributos
    private String model;   // modelo

    // construtor
    public Vehicle(){
    }

    public Vehicle(String model){
        this.model = model;
    }

    // get e set
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
