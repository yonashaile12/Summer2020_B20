package day47_Encapsulation;

import com.sun.xml.internal.bind.v2.model.core.ID;

/*2. create a class called CapitalOneEmployees
                instance variables:
                        employeeName
                        employeeAge
                        jobTitle
                    private ID
                    private salary
                    private address
                    company name = "Capital One"
                    generate getters & setters for private variables
 */
public class CapitalOneEmployees {

    public String employeeName;
    public int employeeAge;
    public String jobTitle;

    public CapitalOneEmployees(String employeeName, int employeeAge, String jobTitle){
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.jobTitle = jobTitle;
    }


    public static String companyName;

    static {
        companyName = "Capital One";
    }

    private long ID;
    private double salary;
    private String address;

    public void setID(long ID){
        this.ID = ID;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public long getID(){
        return ID;
    }
    public double getSalary(){
        return salary;
    }
    public String getAddress(){
        return address;
    }

    public String toString(){
        return "Name: "+employeeName+"\nAge: "+employeeAge+"\nJob Title: "+jobTitle+"\nEmployee ID: "+getID()+"\nSalary: "+getSalary()+"\nAddress: "+getAddress();
    }


}
