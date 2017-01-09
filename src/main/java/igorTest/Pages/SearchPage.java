package igorTest.Pages;

import org.openqa.selenium.By;

import static Utils.DriverUtil.getDriver;

public class SearchPage {
    private final static String URL = "https://www.mybookingpal.com/search";
    private final By destination = By.id("searchTextValue");
    private final By dateFrom = By.id("checkInDate");
    private final By todayDate = By.xpath("//td[@class='current-month weekday today'][1]");
    private final By searchButton = By.xpath("//button[.='Search']");



    public SearchPage() {
        getDriver().get(URL);
        //TODO add assert for page loaded through readyState
    }

    public void fillRequestFormAndProceed() {
        getDriver().findElement(destination).sendKeys("Paris, France");
        getDriver().findElement(dateFrom).click();
        getDriver().findElement(todayDate).click();
        getDriver().findElement(searchButton).click();
    }


}
