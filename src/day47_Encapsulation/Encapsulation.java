package day47_Encapsulation;

public class Encapsulation {

    private long ssn = 123456789;
    //long ssn = 123456789; if it is default variable you can only access with in the same package
    // return Type Must match with the private dataType

    public long getSsn(){ // to Read ONLY this is how we generate getter
        return ssn;
    }

    public void setSsn(long ssn){
        this.ssn = ssn;
    }











}
