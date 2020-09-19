package day51_Exceptions.BrowsersTask;

public class ChromeBrowser extends WebDriver{
    /*
    get(url), close(url)
     */
    @Override
    public void get(String url){
        System.out.println("Opening the "+ url+" in the chrome browser");
    }

    @Override
    public void close(){
        System.out.println("closing the chrome browser");
    }

}
