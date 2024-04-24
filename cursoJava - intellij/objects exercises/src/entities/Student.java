package entities;

public class Student {

    public String name;
    public double note1;
    public double note2;
    public double note3;

    public double FinalGrade(){
        return note1+note2+note3;
    }

    public double Missing(){
        if (FinalGrade()>= 60){
            return 0;
        }else {
            return 60.00 - FinalGrade();
        }
    }

}
