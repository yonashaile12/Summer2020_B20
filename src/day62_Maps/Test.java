package day62_Maps;

public class Test {

    public static void main(String[] args) {

        //String favoriteColor = "Pink";
        Color favoriteColor = Color.Green;

        System.out.println(favoriteColor);

        //String browserName = "";

        //Browser browserName = Browser.chrome;

        Browser browserName = Browser.chrome;
        switch(browserName){
            case chrome:
                System.out.println("Chrome Browser is set");
                break;
            case firefox:
                System.out.println("FireFox Browser is set");
                break;
            case safari:
                System.out.println("Safari Browser is set");
                break;
            case edge:
                System.out.println("Edge Browser is set");
                break;
        }

        Day day = Day.Monday;
        Day day1 = Day.Tuesday;
        Day day2 = Day.Wednesday;
        Day day3 = Day.Thursday;

        Month month1 = Month.January;
        Month month2 = Month.February;
        Month month3 = Month.March;

        Level level1 = Level.Low;
        Level level2 = Level.ChuckNorries;
        Level level3 = Level.Medium;
        Level level4 = Level.High;



    }
}
