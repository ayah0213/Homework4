package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

// Inheritance
public class GoogleWebToolkitPage extends PageBase {

    @FindBy(xpath = "//span[@class='gwt-CheckBox']")
    private List<WebElement> checkboxesElements;







    public void checkBoxesTest() {
        // this class random it comes from  Java util(ready methods stores)
        // it clicks randomly, NOT by order
        Random random = new Random();

        // I created one integer to store how many Fridays clicked

        int numOfFridayClicked = 0;

        // while numOfFridayClicked not EQUAL to 3
       /* while (numOfFridayClicked != 3) {
            WebElement temporary = checkboxes.get(random.nextInt(5));
            temporary.click();
            System.out.println("You selected = " + temporary.getText());
            temporary.click();
            if (temporary.getText().equalsIgnoreCase("Friday"))
                // it keeps adding
                numOfFridayClicked++;
        }*/
        /*
        // second way
        do {
            WebElement temporary = checkboxes.get(random.nextInt(5));
            temporary.click();
            System.out.println("You selected = " + temporary.getText());
            temporary.click();
            if (temporary.getText().equalsIgnoreCase("Friday"))
                numOfFridayClicked++;
        } while (numOfFridayClicked != 3);*/


    }

    /*
     task find ONE common element for Monday, Tuesday, Wednesday, Thursday and Friday
     task find ONE common element for Saturday and Sunday
     task find ONE common element for checkbox, radio button, basic button ..
     */

    @Test
    public void testing(){
        /*
    1. it has to randomly (rasgele) click it
    2. PRINT the name of the day (which was clicked already in step 1)
    3. uncheck immediately (unclick)

     */
        Random random = new Random();
        int numberOfFridayClicked = 0;

        // do this---> it mean keep looping
        do{
            WebElement anyOneElement = checkboxesElements.get(random.nextInt(5));
            anyOneElement.click();
            System.out.println("You clicked = " + anyOneElement.getText());
            anyOneElement.click();
            // After you check and uncheck Friday for the third time, exit the program.
            if (anyOneElement.getText().equalsIgnoreCase("Friday")){
                numberOfFridayClicked++;
            }
            // until numberOfFridaysClicked not equal 3
        } while (numberOfFridayClicked != 3);
    }





}
