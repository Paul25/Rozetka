package TestNGtests;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Marchenko on 31.03.2017.
 */
public class CorrectLogin {
    @Test
    public void login(){
        open(ConfigPage.baseUrl+"/");
    }
}
