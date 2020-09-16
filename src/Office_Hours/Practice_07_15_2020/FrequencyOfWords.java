package Office_Hours.Practice_07_15_2020;

public class FrequencyOfWords {
    public static void main(String[] args) {

        String str ="dog Dog Dog dog catcatcat cat cat".toLowerCase();

        int countOfDog = 0;

        while(str.contains("dog")){
            countOfDog++;
            str=str.replaceFirst("dog","");
        }

        System.out.println("Dog: "+countOfDog);

        int countOfCat = 0;

        while(str.contains("cat")){
            countOfCat++;
            str=str.replaceFirst("cat","");
        }

        System.out.println("Cat: " +countOfCat);
        System.out.println(countOfCat==countOfDog);

    }
}
