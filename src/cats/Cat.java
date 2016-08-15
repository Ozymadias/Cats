package cats;

import java.util.Date;

public class Cat {

    String name;
    Date date;
    double weight;
    String ownerName;

    public Cat() {
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Cat(String name, Date date, double weight, String ownerName) {
        this.name = name;
        this.date = date;
        this.weight = weight;
        this.ownerName = ownerName;
    }

    public String introduceYourself(){
        return "My name is " + name + ", I was born " + date + ", I weigh " + weight + " and my owner name is " + ownerName;
    }

    public String presentYourself2(){
        return "My name is " + name + " and my owner name is " + ownerName;
    }

    public String presentYourself3(){
        return "My name is " + name + ", i weigh " + String.valueOf(weight) + " and my owner name is " + ownerName;
    }

}
