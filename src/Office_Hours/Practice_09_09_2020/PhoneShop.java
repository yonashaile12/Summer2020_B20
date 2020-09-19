package Office_Hours.Practice_09_09_2020;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("11 Pro", 1200);

        iphone.call(911);

        iphone.text(773817966);

        System.out.println(iphone);

        System.out.println("==================================");

        Samsung samsung = new Samsung("Galaxy",850);

        samsung.call(911);
        samsung.text(123445);

        System.out.println(samsung);
        System.out.println("====================================");

        Nokia nokia = new Nokia("Brick",25);
        nokia.call(911);
        nokia.text(231233);

        System.out.println(nokia);

    }
}
