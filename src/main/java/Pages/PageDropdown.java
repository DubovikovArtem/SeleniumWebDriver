package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PageDropdown {
    private WebDriver driver;

    public PageDropdown(WebDriver driver) {
        this.driver = driver;
    }

    private By dropdownList = By.cssSelector("#content > div > h3");
    private By selectedElements = By.id("dropdown");

    public String getPageName() {
        return driver.findElement(dropdownList).getText();
    }

    public void getSelectedSize(String selectOption) {
        System.out.println("before");
        List<WebElement> selected = driver.findElements(selectedElements);
        for(WebElement selectItem: selected ){
            System.out.println("in");
            String text = selectItem.getText();
            if(text.equals(selectOption)){
                selectItem.click();
                break;
            }else{
                System.out.println("This option wasn't found");
            }
//            System.out.println(text);
        }
        System.out.println("after");
    }
}
