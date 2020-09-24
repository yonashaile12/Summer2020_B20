package day57_Polymorphism.PhoneTask;

public class PhoneObjects {

    public static void main(String[] args) {
        Iphone iphone = new Iphone("12","5.3",1000);
        Samsung samsung = new Samsung("S20","6.1",1200);
        Huawei huawei = new Huawei("h1611","5.3",200);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(huawei);

        Phone phone1 = new Iphone("11","6",1200);
        Phone phone2 = new Samsung("S8","6.5",900);
        Phone phone3 = new Huawei("h1611","3",200);

        //Iphone[] phones = {iphone, samsung, huawei}; you can only store the referencing objects
        //Samsung[] phones = {iphone,samsung,huawei};
        //Huawei[] phones = {iphone, samsung, huawei};
        //Poly ---> many  morphism --> forms behave in many forms
        Phone[] phone = {iphone,samsung,huawei, phone1, phone2, phone3};
        // this happens due to polymorphism
    }
}
