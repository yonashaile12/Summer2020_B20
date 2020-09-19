package day48_Inheritance.DeviceTask;

import jdk.nashorn.internal.codegen.CompilerConstants;

public class DeviceObjects {

    public static void main(String[] args) {
        Device device1 = new Device();
        device1.setInfo("macBook Air","Catalina",1200,true,true
                ,"medium");

        System.out.println(device1);

        Device device2 = new Device();
        device2.setInfo("Iphone","Xmax",1100,true,true,"large");


    }
}
