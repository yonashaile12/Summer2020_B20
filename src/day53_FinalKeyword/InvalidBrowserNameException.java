package day53_FinalKeyword;

public class InvalidBrowserNameException extends RuntimeException{

    public InvalidBrowserNameException(){
        super("Invalid Browser name");
        //System.out.println("Please insert a valid browser name");
    }
    public InvalidBrowserNameException(String str){
        super(str);
        System.err.println("Are you kidding");
    }


}

class Test2{

    public static void main(String[] args) {
        String name = "batch20";

        switch(name.toLowerCase()){
            case "chrome":
                System.out.println("Chrome is selected");
                break;
            case "firefox":
                System.out.println("FireFox is selected");
                break;
            case "safari":
                System.out.println("Safari is selected");
                break;
            default:
                throw new InvalidBrowserNameException("Please enter a valid browser name");
                //throw new RuntimeException();
        }
        //throw new InvalidBrowserNameException();
    }
}
