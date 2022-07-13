package theinternet;

import Pages.PageDropdown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

    private By PageDropdown = By.linkText("Dropdown");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public PageDropdown goToPageDropdown(){
        driver.findElement(PageDropdown).click();
        return new PageDropdown(driver);
    }

}
