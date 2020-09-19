package day56_Abstraction.PhonesTask;

public class PhoneObjects {

    public static void main(String[] args) {

        Iphone iphone1 = new Iphone("iphone11",1100,"big");
        System.out.println(iphone1);
        Iphone iphone2 = new Iphone("iphone3",240,"small");
        System.out.println(iphone2);

        iphone1.faceTiming(773817966);

        Samsung samsung1 = new Samsung("Galaxy5",900,"Big");
        System.out.println(samsung1);
        samsung1.freezing();
    }
}
