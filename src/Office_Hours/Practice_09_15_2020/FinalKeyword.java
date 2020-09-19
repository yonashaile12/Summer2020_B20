package Office_Hours.Practice_09_15_2020;

public class FinalKeyword {


    private final int c = 200; // Can not MODIFY
    public int getC(){ // read ONLY
        return c;
    }

    public void set(int c){ // modify ONLY
        //this.c = c; you can not modify it
    }
    /*
     5 private variables
            3 of them are final // you can not use setter for final variables
            2 of them are not final

        how many getter: 5
        how many setter: 2
     */
    // final static int z = 300;

    final private String userName = "cybertek";
    final private String passWord = "Cybertek123";

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public static void main(String[] args) {
        final int a = 100; // final means that it won't be immutable. you can't change it.

    }


class TestBase{

        //@BeforeMethods
    public final void setUp(){
        System.out.println("Set Up the driver");
        System.out.println("Open Browser");
        System.out.println("URL");
        System.out.println("Maximize Window");
        System.out.println("Implicit wait");
    }

    //@AfterMethod
    public final void tearDown(){
        System.out.println("if fails take screenshot");
        System.out.println("Close Browser");
    }
}

class TestCase extends TestBase{

        // @Test
       // public void setUp(){ } final method cannot be overriden

    }


final class Tester{
        // name, age, gender,....jobtitle, findBug()...

//class BA extends Tester{ final class can not be super, it can not be inherited

        }

}
