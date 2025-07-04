package StepDefinitions;

import Modules.HomeModule;
import Modules.MiCuentaModule;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class MiCuentaSteps {
    HomeModule homeModule = new HomeModule();
    MiCuentaModule miCuentaModule = new MiCuentaModule();

    @Given("Admin open application")
    public void adminOpenApplication() {
        homeModule.openApp();
    }

    @And("Allow Liverpool to register activity")
    public void allowLiverpoolToRegisterActivity() {
        homeModule.allowLiverpoolRegisterActivity();
    }

    @And("Skip information about the app")
    public void skipInformationAboutTheApp() {
        homeModule.skipInformationAboutApp();
    }

    @And("Enter mi cuenta module")
    public void enterMiCuentaModule() {
        homeModule.enterToMiCuenta();
    }

    @When("Select Iniciar Sesion option")
    public void selectIniciarSesionOption() {
        miCuentaModule.clickIniciarSesionOption();
    }

    @And("Insert the user name {string}")
    public void insertTheUserName(String userName) {
        miCuentaModule.insertTheUserName(userName);
    }

    @And("Insert the password {string}")
    public void insertThePassword(String password) {
        miCuentaModule.insertThePassword(password);
    }

    @Then("Click on Iniciar sesion button")
    public void clickOnIniciarSesionButton() {
        miCuentaModule.clickIniciarSesionButton();
    }

    @Then("Valdate the name of the user {string}")
    public void valdateTheNameOfTheUser(String name) {
        assertEquals(name, miCuentaModule.nameOfTheUser());
    }
}
