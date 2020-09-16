package Office_Hours.Practice_07_20_2020;

public class Max_3DArray {
    public static void main(String[] args) {

        //int [][] arr2D = {{1,2},{3,4}};

        //                      0    1        0        1
        int [][][] arr3D = {{{1,2},{3,4000}},{{5,6,7},{8,9,10}}};
        //                        0             1

        int max = arr3D[0][0][0];

        for(int[][] arr2D:arr3D){
            for(int[]arr1D:arr2D){
                for(int eachNum:arr1D){
                    if(eachNum>max){
                        max=eachNum;
                    }
                }
            }
        }
        System.out.println("Maximum number is: "+max);



    }
}
