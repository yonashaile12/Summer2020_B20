package RepitTasks;

class staticInitializationBlock{

    static String name = "Aaron";

    public static void main(String[] args) {
        System.out.println("Daniel"); //Daniel
    }

    public static void print(String str){
        System.out.println(str);
    }

    static{
        print(name); // Aaron static blocks always executed first and once
    }
}
