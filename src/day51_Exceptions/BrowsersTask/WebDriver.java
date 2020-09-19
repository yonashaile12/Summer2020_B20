package day51_Exceptions.BrowsersTask;
/*
 1. create a class called WebDriver
            actions: get(URL): prints "opening the URL in the default browser"
                     close(): closes the default browser
 */
public class WebDriver {

    public void get(String url){
        System.out.println("Opening the"+ url+" in the default browser");
    }

    public void close(){
        System.out.println("closing the default browser");
    }
}
