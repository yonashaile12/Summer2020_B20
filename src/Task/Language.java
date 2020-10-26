package Task;

public class Language {

    public void method(){
        System.out.println("0");
    }

}

class Java extends Language{
    public void method(){
        System.out.println("1");
    }
}

class Selenium extends Java{
    public void method(){
        System.out.println("2");
    }


}
class Main{
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        new Java().method();
        new Language().method();
        new Selenium().method();



    }
}
class constructor{
    public final void constructor(){
        System.out.println("b");
    }

    constructor con = new constructor();
}
