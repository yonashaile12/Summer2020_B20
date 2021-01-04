package bootCamp;

public class LoopPractice {

    public static void main(String[] args) {

        for(int i = 25; i > 20 ; i--){
            System.out.println("Batch 20 is the Best "+ i);
        }
        System.out.println("==========================================");
        int j = 25;
        while(j > 20){
            System.out.println("Batch 20 is the best "+ j);
            j--;
        }
        System.out.println("===========================================");
        int k = 25;
        do{
            System.out.println("Batch 20 is the best "+ k);
            k--;
        }while(k > 20);

        System.out.println("==========================================");

        /*
        Foreach loop
        3 data structures:
            1. Array
            2. Collection
            3. Map
         */
        int [] numbers = {10, 20, 30, 40};

        for(int eachNum: numbers){
            System.out.println(eachNum);
        }

        System.out.println("=============================================");

        for(int i = 0; i < numbers.length; i++){
            System.out.println(i); // i is the index 0 1 2 3
        }


    }
}
