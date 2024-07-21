package accountExercise.model.entities;

// interface que define os contratos de qualquer conta que a implemente
public interface Account {
    void depossit(Double amount);   // método para depósito
    void withDraw(Double amount);   // método para sacar
    void transfer(Account targetAccount, Double amount);    // método para transferência
    double checkBalance();          // método para verfifcarf o saldo das contas
}
