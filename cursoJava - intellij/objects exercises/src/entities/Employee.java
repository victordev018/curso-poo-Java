package entities;

public class Employee {

    //attributes
    public String Name;
    public double GlossSalary;
    public double Tax;

    //methods
    public double NetSalary(){
        return GlossSalary - Tax;
    }

    public void IncreaseSalary(double percent){
        GlossSalary += GlossSalary*percent/100;
    }

    public String toString(){
        return Name + ", $ " + String.format("%.2f", NetSalary());
    }
}
