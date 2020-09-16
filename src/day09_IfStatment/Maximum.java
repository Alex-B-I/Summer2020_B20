package day09_IfStatment;
/*
1. write a java program that accepts three numbers and return the maximum number
                (assume that none of them are equal)
 */
public class Maximum {
    public static void main(String[] args) {

        double a = 500;
        double b = 200;
        double c = 1000;

        boolean aIsMax = a > b && a>c;
        //              500>200 && 500>1000
        //               true && false==> false

        boolean bIsMax = aIsMax==false && b>c;
                    //b>a && b>c;
        boolean cIsMax = !aIsMax &&!bIsMax;
                    // !(aIsMax && bIsMax)
                   //c>b && c>a;

        double max = 0; // we want to assign the maximum number to variable max

        if (aIsMax){
            max = a;
            //System.out.println(a);
        }
        if (bIsMax){
            max=b;
            //System.out.println(b);
        }
        if (cIsMax){
            max=c;
            //System.out.println(c);
        }
        System.out.println(max+" is maximum number");

    }
}
