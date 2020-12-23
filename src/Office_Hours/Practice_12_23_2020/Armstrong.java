package Office_Hours.Practice_12_23_2020;

public class Armstrong {

    /*

      153 -->> 1^3 5^3 3^3
      1 + 125+ 27 == 153

     */

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(370));
        System.out.println(isArmstrong(371)); // 3^ 3 + 7^3 + 1^ 1 -->27 +343+1
        System.out.println(isArmstrong(54748));
        System.out.println(isArmstrong(8208));
    }


    public static boolean isArmstrong(int num){
        String value = String.valueOf(num);
       // String value1 = num+"";
        int power = value.length();
        int sum = 0;

        for(int i = 0; i< value.length(); i++){
            int digit = Integer.parseInt(""+value.charAt(i));
            sum += Math.pow(digit, power); // number raised to power == 1 ^3

        }
        return num == sum;
    }

//    public static vo ()  {
//        int newNumber=0;
//        int a=0;
//        int tempNumber=0;
//        int realNumber=407;
//        tempNumber=realNumber;
//        while(realNumber>0)
//        {
//            a=realNumber%10;
//            realNumber=realNumber/10;
//            newNumber=newNumber+(a*a*a);
//        }
//        if(tempNumber==newNumber)
//            System.out.println("armstrong number");
//        else
//            System.out.println("Not armstrong number");
//    }





}
