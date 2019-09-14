package Steps.SignIn;

import Pages.SignIn.SignInPages;
import Pages.SignUp.SignUpPages;
import net.thucydides.core.steps.ScenarioSteps;

public class SignInSteps extends ScenarioSteps {
    SignInPages signInPages;
    SignUpPages signUpPages;

    public void openSepulsaPage(){
        signInPages.open();
    }

    public void klikSignIn(){
        signInPages.klikSignIn();
    }

    public void email(String email){
        signUpPages.email(email);
    }

    public void password(String password){
        signUpPages.password(password);
    }

    public void klikMasuk(){
        signInPages.klikMasuk();
    }

    public void klikMasuk2(){
        signInPages.klikMasuk2();
    }

    public void validasiSignIn(String nama_lengkap){
        signUpPages.validasiSignUp(nama_lengkap);
    }

    public void error(String error){
        signUpPages.validasiError(error);
    }

    public void klikAkun(){
        signInPages.klikAkun();
    }

    public void klikSignOut(){
        signInPages.klikSignout();
    }
}
