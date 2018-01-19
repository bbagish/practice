package JUnit_Parallel;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Platform;

@RunWith(Parallelized.class)
public class GridParallelTest extends GridParallelTestBase{

    //Constructor
    public GridParallelTest(String browserName) {
        super(browserName);
    }

    @Test
    public void parallelGridTest() throws Exception {
   
        setPlatform(Platform.MAC);
        //Go to Amazon.com
        System.out.println("Test is started for: "+ browserName);
        driver.get("http://www.yahoo.com");
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Test is finished for: "+ browserName);
        //ScreenShot Section
        takeScreenShot();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}