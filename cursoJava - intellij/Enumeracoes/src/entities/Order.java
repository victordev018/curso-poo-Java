package entities;

import enums.OrderStatus;
import java.util.Date;

public class Order {
    // atributos
    private Integer Id;
    private Date moment;
    private OrderStatus status;

    // construtores
    public Order(){
    }

    public Order(int Id, Date moment, OrderStatus status){
        this.Id = Id;
        this.moment = moment;
        this.status = status;
    }

    // geters:
    public Integer getId(){
        return Id;
    }
    public Date getDate(){
        return moment;
    }
    public OrderStatus getStatus(){
        return status;
    }

    // seters
    public void setId(Integer id) {
        Id = id;
    }
    public void setMoment(Date moment) {
        this.moment = moment;
    }
    public void setStatus(OrderStatus status){
        this.status = status;
    }

    // toString():
    public String toString(){
        return "Id: " + Id +
               " Moment: " + moment +
               " Status:" + status;
    }
}
