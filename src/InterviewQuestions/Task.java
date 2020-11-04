package InterviewQuestions;

import java.util.Arrays;

public class Task {

    public static void main(String[] args) {

        Calc a = new Calc();
        a.setX(1);
        a.setY(1);
        a.plus();
        System.out.println("1+1 = "+ a.getResult());//1+1 = 2

        Atts a1 = new Atts();
        a1.name = "ball";
        a1.color = "red";
        a1.amount = 1;


        System.out.println(a1.asString());

    }

}

class Calc {

    private int x;
    private int result;
    private int y;

    public int get() {
        return result;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void plus() {
        result = x + y;

    }

    public void minus() {
        result = x - y;

    }

    public int getResult() {
        return result;
    }



}

class Atts {

    String name;
    String color;
    int amount;


    public String asString() {
        return "name:" + name + " color: " + color + " amount: " + amount;
    }

}

class Main
{
    public static String[] combineNames(String[] first_names, String[] last_names){
        String[] fullName = new String[first_names.length];

        for(int i = 0; i < first_names.length; i++){
            fullName[i] = first_names[i].concat(" "+last_names[i]);
        }
        return fullName;
    }



    public static void main(String[] args){
        //feel free to test code here
        String[] first_names = {"Bulent","Ebrahim"};
        String[] last_names = {"Pola","Emam"};

        System.out.println( Arrays.toString(combineNames(first_names, last_names)) );
    }
}
