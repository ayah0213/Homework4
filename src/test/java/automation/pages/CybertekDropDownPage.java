package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CybertekDropDownPage extends  PageBase{

    @FindBy(xpath = "//select[@id='year']")
    private WebElement yearElement;


    @FindBy(xpath = "//select[@id='month']")
    private WebElement monthElement;


    @FindBy(xpath = "//select[@id='day']")
    private WebElement dayWebelement;


    public void verifyYearMonthDay(){
        Select selectYear = new Select(yearElement);
        Select selectMonth =new Select(monthElement);
        Select selectDay = new Select(dayWebelement);


       String actulYear = selectYear.getFirstSelectedOption().getText();
        Assert.assertEquals(Integer.parseInt(actulYear), "2020");

        String actualMonth = selectMonth.getFirstSelectedOption().getText();
        Assert.assertEquals(selectMonth, "June");

        String actualday = selectDay.getFirstSelectedOption().getText();
        Assert.assertEquals(selectDay, "1");

        //Day version 2 (advanced) second way of checking
        String actualDay2 =selectDay.getFirstSelectedOption().getText();
        Assert.assertEquals("11", LocalDate.now().format(DateTimeFormatter.ofPattern("dd")));
        // if we want to check year month day                                               2020 June 01
        Assert.assertEquals("11", LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy MMMM dd")));

    }

}
