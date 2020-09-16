package day47_Encapsulation;

public class Encapsulation {
    private long ssn =1234567;
    //private String userName;

    public long getSsn(){ // to read only
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }



}
