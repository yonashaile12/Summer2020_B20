package Office_Hours.Practice_12_16_2020;

public class Main {

    public static void main(String[] args) {
        FacebookUser userOne = new FacebookUser("abcJames", "007");

        FacebookUser userTwo = new FacebookUser("kevin4839", "pass89", "kevin Monday", 30, 50);

        System.out.println(userTwo);
        System.out.println(userOne.url);
        System.out.println(userTwo.getNumberOfFriends());
        userOne.sentFriendRequest(userTwo);


        System.out.println(userTwo.getNumberOfFriends());


    }
}
