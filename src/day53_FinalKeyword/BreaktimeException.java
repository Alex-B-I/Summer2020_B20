package day53_FinalKeyword;

public class BreaktimeException extends RuntimeException{ //custom unchecked exception

    public BreaktimeException(){
        super("It is time for a break");
        System.err.println("Time to take 15 minute break");
    }
    public BreaktimeException(String str){
        super(str);
        System.err.println("Time to take 15 minute break");
    }

}

class Test{
    public static void main(String[] args){

       // throw new RuntimeException("This is Runtime exception");

        // throw new RuntimeException();
         //throw new BreaktimeException("You need to give us a break");
        //System.out.println("Test completed");
       // throw new Test();
        throw new BreaktimeException("It is been 45 minutes");
    }
}
