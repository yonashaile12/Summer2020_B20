package Library;
import day47_Encapsulation.AccessModifier;

import javax.swing.*;

public class Test_AccessModifiers {
    public static void main(String[] args) {

        System.out.println(AccessModifier.publicVariable);
        AccessModifier.publicMethod();

        //System.out.println(AccessModifier.defaultVariable); // default is not accessible outside the package
        //AccessModifier.defaultMethod();
        //Visibility: public is visible than default


        // if you don't type public or private it means this is a default access modifier
        // default:  visible within the same package only
        // public: open to the world

        //System.out.println(AccessModifier.privateVariable);
        //AbstractCellEditor.privateMethod();

    }

}
