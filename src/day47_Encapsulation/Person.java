package day47_Encapsulation;

import java.time.LocalDate;

public class Person {

    public String name;
    public int age;
    public char gender;
    public LocalDate DOB;

    public Person(String name, int age, char gender, LocalDate DOB){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.DOB = DOB;
    }

    private int ID;
    private long SSN;
    private String address;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public long getSSN() {
        return SSN;
    }

    public void setSSN(long SSN) {
        this.SSN = SSN;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString(){
        return "Name: "+name+", Age: "+age+", Gender: "+gender+", DOB: "+DOB;
    }



}
