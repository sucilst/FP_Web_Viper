package Steps.SignUp;

import Pages.SignUp.SignUpPages;
import net.thucydides.core.steps.ScenarioSteps;

public class SignUpSteps extends ScenarioSteps {
    SignUpPages signUpPages;

    public void openSepulsaPage(){
        signUpPages.open();
    }

    public void klikSignUp(){
        signUpPages.klikSignUp();
    }

    public void namaLengkap(String nama_lengkap){
        signUpPages.namaLengkap(nama_lengkap);
    }

    public void noHP(String No_HP){
        signUpPages.noHP(No_HP);
    }

    public void email(String email){
        signUpPages.email(email);
    }

    public void password(String password){
        signUpPages.password(password);
    }

    public void klikCheckbox(String pilihan){
        signUpPages.checkbox(pilihan);
    }

    public void klikDaftar(){
        signUpPages.klikDaftar();
    }

    public void otpCode(){
        signUpPages.otpCode();
    }

    public void klikKonfirmasi(){
        signUpPages.klikKonfirmasi();
    }

    public void validasiSignUp(String nama_lengkap){
        signUpPages.validasiSignUp(nama_lengkap);
    }

    public void validasiError(String error){
        signUpPages.validasiError(error);
    }
}
