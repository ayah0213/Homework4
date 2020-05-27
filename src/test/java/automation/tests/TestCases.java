package automation.tests;

import automation.pages.GoogleWebToolkitPage;
import org.testng.annotations.Test;

public class TestCases extends TestBase {

    @Test(priority = 1, description = "http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox")
    public void testCase_1(){
        GoogleWebToolkitPage googleWebToolkitPage = new GoogleWebToolkitPage();
        googleWebToolkitPage.checkBoxesTest();
    }
}
