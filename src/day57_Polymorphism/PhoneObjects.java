package day57_Polymorphism;

public class PhoneObjects {

    public static void main(String[] args) {
        Iphone iphone = new Iphone("12","5.3",1000);
        Samsung samsung = new Samsung("S20","6.1",1200);
        Huawei huawei = new Huawei("h1611","5.3",200);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(huawei);
    }
}
