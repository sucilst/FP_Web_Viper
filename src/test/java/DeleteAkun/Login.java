package DeleteAkun;

import Steps.DeleteAkun.LoginSteps;
import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;

public class Login extends SerenityStory {
    @Steps
    LoginSteps loginSteps;
    @Given("pengguna membuka website backend sepulsa")
    public void givenPenggunaMembukaWebsiteBackendSepulsa() {
        loginSteps.openBackendSepulsa();
    }

    @When("klik SignIn")
    public void whenKlikSignIn() {
        loginSteps.klikLogin();
    }

    @When("masukkan email")
    public void whenMasukkanEmail() {
        loginSteps.email();
    }

    @When("masukkan password")
    public void whenMasukkanPassword() {
        loginSteps.password();
    }

    @When("klik masuk")
    public void whenKlikMasuk() {
        loginSteps.klikMasuk();
    }

    @Then("pengguna diarahkan ke halaman dashboard")
    public void thenDiarahkanKeHalamanDashboard() {
        loginSteps.validasiLogin();
    }
}
