package SelenideStart;

import com.codeborne.selenide.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by pc on 19.11.2016.
 */
//@Slf4j

public class StartBrowser {
    @Before
    public void RunURL()
    {
 //       System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        Configuration.browser= "chrome";
        open ("http://vk.com");
    }

    @Test
    public void StartBrowser()
    {
    }
    @After
    public void CloseURL()
    {
        close();
    }
}
