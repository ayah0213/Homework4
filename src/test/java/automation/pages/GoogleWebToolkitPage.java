package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

// Inheritance
public class GoogleWebToolkitPage extends PageBase {

    @FindBy(xpath = "//span[@class='gwt-CheckBox']")
    private List<WebElement> checkboxes;

    public void checkBoxesTest() {
        // this class random it comes from  Java util(ready methods stores)
        // it clicks randomly, NOT by order
        Random random = new Random();

        // I created one integer to store how many Fridays clicked

        int numOfFridayClicked = 0;

        // while numOfFridayClicked not EQUAL to 3
        while (numOfFridayClicked != 3) {
            WebElement temporary = checkboxes.get(random.nextInt(5));
            temporary.click();
            System.out.println("You selected = " + temporary.getText());
            temporary.click();
            if (temporary.getText().equalsIgnoreCase("Friday"))
                // it keeps adding
                numOfFridayClicked++;
        }










    }


}
