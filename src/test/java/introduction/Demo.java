package introduction;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalTime;

public class Demo {


    @Test
    public void testIfNumber4isEven() {
        // duomenys
        int actualImput = 4;
        int expectedResults = 0;
        int actualResults;

        //testo veiksmas
        actualResults = actualImput % 2;

        // palyginimas
        Assert.assertEquals(actualResults, expectedResults);
    }

    @Test
    public void testIfNumber5isNotEven() {
        // duomenys
        int actualImput = 5;
        int expectedResults = 1;
        int actualResults;

        //testo veiksmas
        actualResults = actualImput % 2;

        // palyginimas
        Assert.assertTrue(actualResults == expectedResults,
                "Actual : " + actualResults + ", Expected : " + expectedResults);
    }

    @Test
    public void testIfTimeNowIsNot19Hour(){
        //duomenys
        int notExpectedTime = 19;
        int actualTime;
        boolean isSameTime;
        //test veiksmas

        actualTime = LocalTime.now().getHour();

        isSameTime = notExpectedTime == actualTime;


        // palyginimas

        Assert.assertFalse(
                isSameTime,
                String.format("Expected: %s, Actual : %s", notExpectedTime, actualTime)
        );
    }
}
