package support;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumber;

import static support.Utils.getRandomEmail;

public class Commands extends RunCucumber {
    public static void waitElementBeClickable(By element, Integer tempo) {
        WebDriverWait wait = new WebDriverWait(getDriver(), tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitElementBeVisible(By element, Integer tempo) {
        WebDriverWait wait = new WebDriverWait(getDriver(), tempo);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public static void clickElement(By element){
        try {
            waitElementBeClickable(element, 2000);
            getDriver().findElement(element).click();
        }catch (Exception error){
            System.out.println(error);
        }
    }

    public static void informarDados(By element, String value){
        try {
            waitElementBeVisible(element, 2000);
            getDriver().findElement(element).sendKeys(value);

        }catch (Exception error){
            System.out.println(error);
        }

    }

    public static void checkMessagem(By element, String expectMessage){

        try {
            String actualMessage = getDriver().findElement(element).getText();
            Assert.assertEquals(expectMessage, actualMessage);

        }catch (Exception error){
            System.out.println(error);
        }
    }
}
