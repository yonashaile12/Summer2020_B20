package day51_Exceptions.BrowsersTask;

public class FireFoxBrowser extends WebDriver{



    public void get(String url) {
        System.out.println("Opening the "+ url+" in the firefox browser");
    }

    public void close() {
        System.out.println("closing the firefox browser");
    }
}
