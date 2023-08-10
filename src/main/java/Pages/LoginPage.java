package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private static final By UserName = By.xpath("//*[@id=\"login-space\"]/div[1]/div[2]/div[2]/div/form/div[1]/input");
    private static final By Password = By.id("id_password");
    private static final By LoginBttn = By.xpath("//*[@id=\"login-space\"]/div[1]/div[2]/div[2]/div/form/div[4]/div[1]/button");


        public boolean DoLoginScenario (String username , String password)
        {
            Type(UserName,username);
            Type(Password,password);
            click(LoginBttn);

            return false;
        }

}
