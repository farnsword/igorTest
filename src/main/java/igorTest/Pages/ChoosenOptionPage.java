package igorTest.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static Utils.DriverUtil.getDriver;

public class ChoosenOptionPage {
    private final By propertyID = By.xpath("//td[.='Property ID']//following-sibling::td");
    private final By dateFrom = By.xpath("//input[@ng-model='params.detailCheckInDate']");
    private final By dateFromMonday = By.xpath("//td[contains(@class, 'today')]/.. " +
            "/following-sibling::tr/td[contains(@class,'selected-line')]");


    public void checkMondayAsCheckInDate() {

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println("got interrupted");
            e.printStackTrace();
        }
        getDriver().findElement(dateFrom).click();
        WebElement waiting = (new WebDriverWait(getDriver(), 10))
                .until(ExpectedConditions.visibilityOfElementLocated(dateFromMonday));

        List<WebElement> elements = getDriver().findElements(dateFromMonday);
        elements.get(0).click();
    }

    public String getPropertyID(){
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollBy(0,200)", "");
        String id = getDriver().findElement(propertyID).getText();
        return id;
    }
}
