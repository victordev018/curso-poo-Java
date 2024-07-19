package EmployeeExercise.entities;

public class Employee {

    // atributos
    private String name;
    protected Integer hours;
    protected Double valuePerHour;

    // construtores
    public Employee (){
    }

    public Employee (String name, Integer hours, Double valuePerHour){
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    // geteres
    public String getName(){
        return name;
    }

    public Integer getHours(){
        return hours;
    }

    public Double getValuePerHour(){
        return valuePerHour;
    }

    // seteres
    public void setName(String name){
        this.name = name;
    }

    public void setHours(Integer hours){
        this.hours = hours;
    }

    public void setValuePerHour(Double valuePerHour){
        this.valuePerHour = valuePerHour;
    }

    // métodos

    // método que devolve o valor do pagamento do funcionário
    public double payment(){
        return hours * valuePerHour;
    }

}
