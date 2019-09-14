package Steps.DeleteAkun;

import Pages.DeleteAkun.LoginPages;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps {
    LoginPages loginPages;

    public void openBackendSepulsa(){
        loginPages.openUrl("https://altaqeproject.sepulsa.id");
    }

    public void klikLogin(){
        loginPages.klikLogin();
    }

    public void email(){
        loginPages.email();
    }

    public void password(){
        loginPages.password();
    }

    public void klikMasuk(){
        loginPages.klikMasuk();
    }

    public void validasiLogin(){
        loginPages.validasiLogin();
    }
}
