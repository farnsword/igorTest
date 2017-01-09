package igorTest;

import igorTest.Pages.ChoosenOptionPage;
import igorTest.Pages.ResultsPage;
import igorTest.Pages.SearchPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyBookingPalTest {
    @Before
    public void preConditions(){

    }

    @Test
    public void requestCheck(){
        SearchPage front = new SearchPage();
        front.fillRequestFormAndProceed();

        ResultsPage results = new ResultsPage();
        results.chooseOption();

        ChoosenOptionPage option = new ChoosenOptionPage();
        System.out.println("Property ID of choosen apartment is " + option.getPropertyID()); //doesn`t work
        option.checkMondayAsCheckInDate(); //doesn`t work
    }

    @After
    public void postCondition(){

    }
}
