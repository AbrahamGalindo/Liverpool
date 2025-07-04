package Modules;

import org.openqa.selenium.By;

public class HomeModule extends Base {

    By btnPermitirRegisterActivity = By.id("mx.com.liverpool.shoppingapp:id/btn_allow_permission");
    By btnSkipInformation = By.id("mx.com.liverpool.shoppingapp:id/skip_action");
    By btnMiCuenta = By.xpath("//android.widget.FrameLayout[@content-desc=\"Mi cuenta\"]");

    public void openApp() {
        createDriver();
    }

    public void allowLiverpoolRegisterActivity() {
        click(btnPermitirRegisterActivity);
    }

    public void skipInformationAboutApp() {
        click(btnSkipInformation);
    }

    public void enterToMiCuenta() {
        click(btnMiCuenta);
    }
}
