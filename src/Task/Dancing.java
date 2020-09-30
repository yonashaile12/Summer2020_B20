package Task;

 public class Dancing {


     public static void main(String[] vars) {
         int leaders = 10 * 2 + 10 * (1 + 2 / 5);
         int followers = leaders * 2;
         System.out.print(leaders + followers < 10 ? "Too few" : "Too many");
         System.out.println();
         System.out.print(5 + 6 + "7" + 8 + 9);

         int dog = 11;
         int cat = 3;
         int partA = dog / cat; // 3.666
         int partB = dog % cat; // 2
         int newDog = partB + partA * cat; //3.67+2*3
         System.out.println(newDog);
         //System.out.println(3.67+2*3);

         int flavors = 30;
         int eaten = 0;
         switch (flavors) {
             case 30:
                 eaten++;
             case 40:
                 eaten += 2;
             default:
                 eaten--;
         }
         System.out.print(eaten);

     }
 }