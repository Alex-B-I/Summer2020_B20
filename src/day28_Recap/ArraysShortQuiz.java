package day28_Recap;

import java.util.Arrays;

public class ArraysShortQuiz {
    public static void main(String[] args) {

        char [] arr = {'D','C','B','A'};
        Arrays.sort(arr);
        for(char each:arr){
            System.out.print(each);
            if (each=='D'){
                continue;
            }
        }
        System.out.println();

        int wd =0;
        String [] days = {"sun", "mon","wed","sat"};
        for (int i =0; i<days.length;i++){
            switch (days[i]){
                case "sat":
                case "sun":
                    wd -=1;
                    break;
                case "mon":
                    wd++;
                case "wed":
                    wd+=2;

            }


        }
        System.out.println(wd);

        int [] nums = {15,30,45,60,75};
        //             0,  1, 2, 3, 4
        nums[2]=nums[4]; //{15,30,75,60,75};
        //nums[2] =75;
        nums[4]=90;

        System.out.println(Arrays.toString(nums));

        int [] a ={1,2,3,4};
        int y = 0;

        do {
            System.out.println(a[y]); // 1 2 3
            y++; // y: 1 2 3
        }while (y<a.length-1);
        //y<3

    }
}
