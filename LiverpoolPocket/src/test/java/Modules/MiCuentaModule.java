package Modules;

import org.openqa.selenium.By;

public class MiCuentaModule extends Base {

    By btnIniciarSesionOption = By.id("mx.com.liverpool.shoppingapp:id/imagen_click_Login");
    By txtUserName = By.xpath("//android.widget.EditText[@resource-id=\"username\"]");
    By txtPassword = By.xpath("//android.widget.EditText[@resource-id=\"password\"]");
    By btnIniciarSesionButton = By.xpath("//android.widget.Button[@text=\"Iniciar sesión\"]");
    By lblUserName = By.id("mx.com.liverpool.shoppingapp:id/txt_user_name");

    public void clickIniciarSesionOption() {
        click(btnIniciarSesionOption);
    }

    public void insertTheUserName(String userName) {
        sendKeys(txtUserName,userName);
    }

    public void insertThePassword(String password) {
        sendKeys(txtPassword,password);
    }

    public void clickIniciarSesionButton() {
        click(btnIniciarSesionButton);
    }

    public String nameOfTheUser(){
        waitForElement(lblUserName);
        return getText(lblUserName);
    }

}
