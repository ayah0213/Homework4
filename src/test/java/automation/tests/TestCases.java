package automation.tests;

import automation.pages.CybertekDropdownPage;
import automation.pages.GoogleWebToolkitPage;
import org.testng.annotations.Test;

public class TestCases extends TestBase {

    /*
    1. it has to randomly (rasgele) click it
    2. PRINT the name of the day (which was clicked already in step 1)
    3. uncheck immediately (unclick)

     */


    @Test(priority = 1, description = "http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox")
    public void testCase_1(){
        GoogleWebToolkitPage googleWebToolkitPage = new GoogleWebToolkitPage();
        //googleWebToolkitPage.checkBoxesTest();
        googleWebToolkitPage.testing();
    }

    @Test(priority = 2, description = "http://practice.cybertekschool.com/dropdown")
    public void testCase_2(){
        CybertekDropdownPage cybertekDropdownPage = new CybertekDropdownPage();
        cybertekDropdownPage.verifyYearMonthDay();
    }
 

}
