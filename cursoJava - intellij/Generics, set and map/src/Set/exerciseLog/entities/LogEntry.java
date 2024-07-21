package Set.exerciseLog.entities;

import java.time.LocalDateTime;
import java.util.Objects;

public class LogEntry{

    // atributos
    private String userName;
    private LocalDateTime moment;

    // construtor
    public LogEntry(){
    }

    public LogEntry(String userName, LocalDateTime moment){
        this.userName = userName;
        this.moment = moment;
    }

    // get e set
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    // sobreposição dos método que diz como é testada a igualdade dos objetos dessa classe


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogEntry logEntry = (LogEntry) o;
        return Objects.equals(userName, logEntry.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(userName);
    }
}
