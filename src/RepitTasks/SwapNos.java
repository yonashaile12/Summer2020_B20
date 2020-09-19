package RepitTasks;

public class SwapNos {

    public static void main(String[] args) {
        System.out.println("Calling swap function with inputs 2 & 3");
        swap(2,3);
        System.out.println("Calling swap function with inputs -3 & 5");
        swap(-3,5);

        System.out.println("=======================================");


        int num = 10025;
        System.out.println("Input - " + num + " Output:" +
                reverseNo(num));
        System.out.println("=======================================");

        System.out.println("Factorial of 5 using loop is:" + factorialWithLoop(5));
        System.out.println("Factorial of negative number -100 is:" + factorialWithLoop(-100));






    }

    private static void swap(int x, int y) {
        System.out.println("values before swap:" + x + " and " + y);
        // swap logic
        // swap logic - x=2, y=3
        //x = x + y; => x=5
        //y = x - y; => y=2
        //x = x - y; => x=3
        //x & y swapped (x=3, y=2)

        //=========================================
        // swap logic - x=-3, y=5
        //x = x + y; => x=2
        //y = x - y; => y=-3
        //x = x - y; => x=5
        //x & y swapped (x=5 & y=-3)
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("values after swap:" + x + " and " + y);
    }

    public static int reverseNo(int number) {
        int reversed = 0;

        while(number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return  reversed;
    }


    public static long factorialWithLoop(int n) {
        if(n < 0) {
            System.out.println("Negative nos can't have factorial");
            return -9999;
        }
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }


}



