package Exercicio1.entities;

import java.util.Date;

public class HourContract {

    // atributos
    private Date date;
    private Double valuePerHour;
    private Integer hours;

    // construtores
    public HourContract(){
    }

    public  HourContract(Date date, Double valuePerHour, Integer hours){
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    // geters
    public Date getDate(){
        return date;
    }
    public Double getValuePerHour(){
        return  valuePerHour;
    }
    public Integer getHours(){
        return hours;
    }

    // setrs
    public void setDate(Date date){
        this.date = date;
    }
    public void setValuePerHours(Double valuePerHour){
        this.valuePerHour = valuePerHour;
    }
    public void setHours(Integer hours){
        this.hours = hours;
    }

}
