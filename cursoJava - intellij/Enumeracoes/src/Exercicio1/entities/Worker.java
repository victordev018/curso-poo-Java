package Exercicio1.entities;
import Exercicio1.entities.enums.WokerLevel;
import Exercicio1.entities.HourContract;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    // atributos
    private String name;
    private WokerLevel level;
    private Double baseSalary;

    // associações
    private Departament departament;
    private List<HourContract> contracts = new ArrayList<HourContract>();

    // construtores
    public Worker(){
    }

    public Worker(String name, WokerLevel level, Double baseSalary, Departament departament){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    // getrs e setrs
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WokerLevel getLevel() {
        return level;
    }

    public void setLevel(WokerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    // Método para adicionar um novo contrato na lista contracts
    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    // Método para remover um contrato da lista contracts
    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    // Método que calcula quanto o trabalhador ganhou em um dado mês de um ano
    public double income(int year, int month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();

        for (HourContract c: contracts){
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);  // mês calendar começa com 0

            if (c_year == year && c_month == month){
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
