package classComparable.entities;

// classe referente aos dados dos funcionários

// implememtar Comparable faz com que a classe possa implememtar como um objeto pode ser comparado com
// outro do mesmo tipo
public class Employee implements Comparable<Employee> {

    // atributos
    private String name;    // nome
    private Double salary;  // salário

    // construtor
    public Employee(){
    }

    public Employee(String name, Double salary){
        this.name = name;
        this.salary = salary;
    }

    // get e set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    // sobreposição do método para comparar um objeto a outro
    // retorna valor negativo se o objeto for menor que o outro, zero se for igaul e positivo se for maior
    @Override
    public int compareTo(Employee o) {
        return name.compareTo(o.getName());
    }
}
