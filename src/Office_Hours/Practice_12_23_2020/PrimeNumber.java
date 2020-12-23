package Office_Hours.Practice_12_23_2020;

public class PrimeNumber {

    // What is a prime number:
    // a number that is only divisible by itself and 1
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(3));
        System.out.println(isPrimeNumber(10));
        System.out.println(isPrimeNumber(11));
        System.out.println(isPrimeNumber(-1));
        System.out.println(isPrimeNumber(4));


        printPrimeNumber(7);
        printPrimeNumber(100);
    }

    public static boolean isPrimeNumber(int num){

        if(num < 0) return false;

        for(int i = 2; i < num/2; i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }

    // print out all prime numbers up to a number

    public static void printPrimeNumber(int number){
        for(int i = 1; i < number; i++){
            if(isPrimeNumber(i)){
                System.out.println(i);
            }
        }
    }
}
