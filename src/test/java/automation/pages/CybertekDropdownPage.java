package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class CybertekDropdownPage extends PageBase {

    @FindBy(xpath = "//select[@id='year']")
    private WebElement yearElement;

    @FindBy(xpath = "//select[@id='month']")
    private WebElement monthElement;

    @FindBy(xpath = "//select[@id='day']")
    private WebElement dayElement;

    // ctrl+space on Windows
    //command + space on Mac

    public void verifyYearMonthDay(){
        Select selectYear = new Select(yearElement);
        Select selectMonth = new Select(monthElement);
        Select selectDay = new Select(dayElement);

        /*
        // here the when we are verifying with integer
        String actualYear = selectYear.getFirstSelectedOption().getText();
        // we are parceing String to Integer
        Assert.assertEquals(Integer.parseInt(actualYear), 2020);
        */

        // Year
        String actualYear = selectYear.getFirstSelectedOption().getText();
        Assert.assertEquals(actualYear, "2020");
        //Month
        String actualMonth = selectMonth.getFirstSelectedOption().getText();
        Assert.assertEquals(actualMonth, "June");
        //Day
        String actualDay = selectDay.getFirstSelectedOption().getText();
        Assert.assertEquals(actualDay, "1");

       /* //Day version 2 (advanced) second way of checking
        String actualDay2 =selectDay.getFirstSelectedOption().getText();
        Assert.assertEquals(actualDay2, LocalDate.now().format(DateTimeFormatter.ofPattern("dd")));

        // day version 3 3rd way of checking
        // if we want to check year month day                                                         2020 June 01
        Assert.assertEquals("2020 June 01", LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy MMMM dd")));
*/

    }





}
