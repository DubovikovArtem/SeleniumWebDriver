package testtheinternet;

import Pages.PageDropdown;
import base.BaseTest;
import org.testng.annotations.Test;
import theinternet.MainPage;

public class WorkDropdownList extends BaseTest {

    @Test
    public void testGoToPage() {
        goToPage("https://the-internet.herokuapp.com");
        PageDropdown dropdown = new MainPage(driver).goToPageDropdown();
        String pageName = dropdown.getPageName();
        System.out.println(pageName);

        System.out.println("ad");
    }
}
