package webdriwerinit;

public class OpenPage extends WebDriverInit {

    public void goToPage(String page) {
        driver.get(page);
    }
}
