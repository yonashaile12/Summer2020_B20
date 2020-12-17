package Office_Hours.Practice_12_16_2020;

import java.util.ArrayList;

public class FacebookUser extends SocialMedia{

    /*
    Facebook User:
(*) Create a class for a facebook user which inherits the Social Media class and additional instance variables: username, password, full name, age, and number of friends
(*) Encapsulate all the variables.
(*) Create a constructor which will create a facebook user by taking username and password.
    - If the password contains the username then it is not a valid password and should not be saved. In this case Print “Password contained username. Default password created: ‘password’” and set the password for the user to the default value.
    - Create and assign the the user's person url by taking 'facebook.com/' and adding their username
    - Set the account length to 0
    - Set the platform for "Facebook" using static block
(*) Overload the constructor to accept username, password, and the user’s name.
    - If the name entered has any characters that are not letters from the alphabet, then the name is invalid. In this case print “invalid name” and assign the name value to be ‘no name’
(*) Overload the constructor to accept username, password, the user’s name, age and number of friends.
    - Only store the age and number of friends into the variables if they are valid numbers ( No negative numbers ). If they are invalid print “Invalid (age/number of friends) and keep the values as the default of 0.
(*) Implement all methods coming from Social Media class
    (*) Direct messaging(String username, String message)
        - print = %message sent to %username
    (*) Post(String body)
        - Should be added to the the ArrayList of Posts of the user
    (*) Notifications(int time)
        - Checks the current time. If the time is between 8 am - 5 pm print "Notification", otherwise print "Sleep mode"
(*) Override the toString method to print all of the information of a Facebook user when they are searched.
(*) Create a sendFriendRequest method that will accept a Facebook user object and send them a friend request. The method should return a boolean of if the friend request was sent (true) or if the friend request was not sent (false).
    - If your friend list is at the 5000 limit then do not send the request and print “You have reached the limit of friends.”
    - If the user you are trying to send the request to has already hit the limit then print “theUsersName cannot accept any more friend request.
    - If both you and the user are under the limit print “Friend request sent to theUsersName” and increase your number of friends by one.
     */

    private String username;
    private String password;
    private String fullname;
    private int age;
    private int numberOfFriends;
    private ArrayList<Post> allPost;

    public ArrayList<Post> getAllPost() {
        return allPost;
    }

    public void setAllPost(ArrayList<Post> allPost) {
        this.allPost = allPost;
    }

    static {
        platform = "Facebook";
    }

    public FacebookUser(String username, String password) {

        if(password.contains(username)){
            System.out.println("Password contains username. Default password set: password");
            this.password = "password";
        }else{
            this.password = password;
        }

        this.username = username;
        this.url = "facebook.com/"+this.username;
        this.accountLength = 0;
        allPost = new ArrayList<>();

    }

    public FacebookUser(String username, String password, String fullName){
        this(username, password);

        boolean isValidName = true;


        for(int i =0; i < fullName.length(); i++){
            if( !Character.isLetter(fullName.charAt(i))){
                if (fullName.charAt(i) == ' ') continue;
                isValidName = false;
                break;
            }
        }
        if(isValidName){
            this.fullname = fullName;
        }else {
            System.out.println("Invalid name");
            this.fullname = "no name";
        }


    }

    public FacebookUser(String username, String password, String fullName, int age, int numberOfFriends){
        this(username, password, fullName);
        if(age < 0){
            System.out.println("Invalid age");
        }else{
            this.age = age;
        }

        if(numberOfFriends < 0){
            System.out.println("Invalid number of friends");
        }else{
            this.numberOfFriends = numberOfFriends;
        }
    }

    public boolean sentFriendRequest(FacebookUser otherUser){
        boolean valid = false;
        if(this.numberOfFriends  > 5000){
            System.out.println("You have reached the max number of friends");
        }else if(otherUser.numberOfFriends > 5000){
            System.out.println(otherUser.fullname + " has reached the max number of friends");
        }else{
            System.out.println("Friend request sent to "+ otherUser.fullname);
            this.numberOfFriends++;
            otherUser.numberOfFriends++;
            valid = true;
        }
        return valid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    public void setNumberOfFriends(int numberOfFriends) {
        this.numberOfFriends = numberOfFriends;
    }

    @Override
    public void directMessage(String username, String message) {
        System.out.println(message+"was sent to: "+username);
    }

    @Override
    public void post(String body) {
        allPost.add(new Post(body));
    }

    @Override
    public void notification(int time) { // time will be 24 hr format
        // 8am to 5pm
        if(time >= 8 && time <= 17){
            System.out.println("Notification");
        }else{
            System.out.println("Sleep mode");
        }

    }

    @Override
    public String toString() {
        return "FacebookUser{" +
                "username='" + username + '\'' +
                ", fullname='" + fullname + '\'' +
                ", age=" + age +
                ", numberOfFriends=" + numberOfFriends +
                '}';
    }
}
