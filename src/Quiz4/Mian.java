package Quiz4;

public class Mian {

    public static void main(String[] args) {
        System.out.println(appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old.") );

        int x = 1;
        int y = 0;

        if(x++ > ++y){
            System.out.println("Hello");
        }else{
            System.out.println("Welcome");
        }
        System.out.println("Log "+x+" : "+y);


        boolean result = true;
        //int N = 100;

        if(result == false){
            System.out.println("One");
        } else if( result == true != false){
            System.out.println("Two");

        }else if(result == true){
            System.out.println("Three");
        }else if(result != false){
            System.out.println("Four");
        }


        int n1 = 'B';

        if(n1 > 128 || n1 <= 129){
            System.out.println("B");
        }else{
            System.out.println("A");
        }


    }
    public static boolean appearsTwice(String target, String sentence) {
        //write your codes here:
        int count = 0;

        for(int i = 0; i <= sentence.length()-1; i++) {
            if (sentence.substring(i).contains(target)) {
                count++;
                if (count == 2)
                    return true;

            }
        }
        return true;
    }

}
