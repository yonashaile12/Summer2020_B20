package bootCamp;

public class Polymorphism {

    public static void main(String[] args) {
        Shape shape1 = new Rectangle();
        // Upcasting Examples
        // WebDriver driver = (WebDriver)(new ChromeDriver());
        // TakeScreenShot ts = (TakeScreenShot) ChromeDriver())

        // downCasting anything you have to do it manually is downCasting
        //Rectangle rectangle = (Rectangle) shape1;
        double length = ((Rectangle)shape1).length;

        /*
        WebDriver driver = new ChromeDriver(); // this is upcasting
        ((TakeScreenShot)driver).takeScreenShot

        ((JavaScriptExecutor)driver).executeScript()
         */

        Shape shape2 = new Cube();

        //System.out.println(shape2.length);

        //Rectangle r1 = (Rectangle) shape2;
        //ClassCastException
        //System.out.println(r1.length);

        /*
        WebDriver driver = new ChromeDriver();

        FireFoxDriver firefox = (FireFoxDriver)driver;
         */

        Shape shape3 = new Circle();

        System.out.println(shape3 instanceof Rectangle);

        /*
        boolean isChrome = driver instanceof ChromeDriver;
         */


    }
}
