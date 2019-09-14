package Steps.PLN;

import Pages.PLN.PLNPrepaidPages;
import Pages.SignIn.SignInPages;
import Pages.SignUp.SignUpPages;
import net.thucydides.core.steps.ScenarioSteps;

public class PLNPrepaidSteps extends ScenarioSteps {
    PLNPrepaidPages plnPrepaidPages;
    SignInPages signInPages;
    SignUpPages signUpPages;

    public void openHalaman(){
        plnPrepaidPages.open();
    }

    public void klikListrik(){
        plnPrepaidPages.klikListrik();
    }

    public void nomorPLN(String nomor){
        plnPrepaidPages.nomorMeter(nomor);
    }

    public void noHP(String No_HP){
        plnPrepaidPages.noHP(No_HP);
    }

    public void nominal(String nominal){
        plnPrepaidPages.nominal(nominal);
    }

    public void pembayaranEmail(String email){
        plnPrepaidPages.email(email);
    }

    public void klikLanjutkan(){
        plnPrepaidPages.klikLanjutkan();
    }

    public void validasiAnon(String email){
        plnPrepaidPages.validasiAnon(email);
    }

    public void validasiLogin(String nama_lengkap){
        plnPrepaidPages.validasiLogin(nama_lengkap);
    }

    public void validasiError(String error){
        plnPrepaidPages.validasiError(error);
    }

    public void validasiNominal(){
        plnPrepaidPages.pilihanNominal();
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
}
