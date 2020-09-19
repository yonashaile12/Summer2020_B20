package day47_Encapsulation;

public class Credentials {

    private String username;
    private String password;
    public String name;
    public int age;


    public static String companyName;

    static {
        companyName = "FaceBook";
    }

    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public Credentials(String name, int age){
        this.name = name;
        this.age = age;
    }

}
