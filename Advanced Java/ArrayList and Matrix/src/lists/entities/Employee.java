package lists.entities;

public class Employee {

    private Integer Id;
    private String Name;
    private Double Salary;


    // constructors
    public Employee(){

    }
    public Employee(int Id, String Name, Double Salary){
        this.Id = Id;
        this.Name = Name;
        this.Salary = Salary;
    }

    // geters and seters
    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public Double getSalary() {
        return Salary;
    }

    // método para aumentar salário
    public void increaseSalary(Double percent){
        Salary += Salary * percent / 100.0;
    }

    public String toString(){
       return Id + ", " + Name + ", " + String.format("%.2f", Salary);
    }
}
