package accountExercise.model.entities;

import java.util.ArrayList;
import java.util.List;

// classe referente ao Cliente
public class Client {

    // atributos
    private String name;    // nome
    private String cpf;     // cpf

    // lista de contas do cliente
    private List<Account> listOfAccounts = new ArrayList<>();

    // construtores
    public Client(){
    }

    public Client(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    // get e set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Account> getListOfAccounts() {
        return listOfAccounts;
    }

    // método para adicionar uma nova conta
    public void addNewAccount(Account newAccount){
        listOfAccounts.add(newAccount);
    }

    // método para listar as contas
    public void listAccounts(){
        for(Account a : listOfAccounts){
            System.out.println(a);
        }
    }

    // método para verificar o saldo total das contas
    public Double checkTotalBalance(){
        double totalValue = 0.0;
        for (Account a : listOfAccounts){
            totalValue += a.checkBalance();
        }
        return totalValue;
    }
}
