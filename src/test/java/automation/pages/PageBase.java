package automation.pages;

import automation.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class PageBase {

    // it a block of code that initilize objects, fields abd variables
    // 1. the class name hast to be SAME
    // 2. It doesn't have return type

    public PageBase() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
