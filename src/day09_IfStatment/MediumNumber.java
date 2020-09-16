package day09_IfStatment;

public class MediumNumber {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 150;
        boolean aIsMed = (a>b && a<c) || (a>c && a<b);
        boolean bIsMed = (b>c && b<a) || (b<c && b>a);
        boolean ciSMed = !aIsMed && !bIsMed;

        double med =0;

        if (aIsMed){
            med=a;
        }
        if (bIsMed){
            med=b;
        }
        if (ciSMed){
            med = c;
        }

        System.out.println(med+" is medium number");


    }
}
