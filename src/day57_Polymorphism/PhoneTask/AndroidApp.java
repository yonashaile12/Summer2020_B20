package day57_Polymorphism.PhoneTask;

/*
2. create an interface named AndroidApp that can inherit from Downloadable
            variable: AppStoreName
 */
public interface AndroidApp extends Downloadable {

    String appStoreName = "Google Play";
    // by default it is public static final
    //1 abstract method
}
