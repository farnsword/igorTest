package igorTest.Pages;

import org.openqa.selenium.By;

import static Utils.DriverUtil.getDriver;

public class ResultsPage {
    private final By choosenOption = By.xpath("//a[.='Apartment Berri A']");

    public void chooseOption(){
        getDriver().findElement(choosenOption).click();
    }
}
